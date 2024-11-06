package Daca_L18Activity1;

public class Printer extends Thread {
	
	private String docName;
	
	Printer(String docName){
		this.docName = docName;
	}
	
	public void run() {
		printDocuments(Thread.currentThread());
	}
	
	private void printDocuments(Thread currentThread) {

		System.out.println("Printing: " + docName);
		
		synchronized (Printer.class) {
			System.out.println("\n" + Thread.currentThread().getName() + " " + (currentThread.isAlive() ? "running" : "terminated"));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("\nFinished printing: " + docName);
		}
		
	}
	
	public static void main(String[] args) {
	
		Printer printer1 = new Printer("Manuscript_Final.pdf");
		Printer printer2 = new Printer("Manuscript_Final_Final.pdf");
		
		printer1.start();
		printer2.start();
		try {
			printer1.join();
			printer2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nThread has ended");
		System.out.println(printer1.getName() + " status: " + (printer1.isAlive() ? "running" : "terminated"));
		System.out.println(printer2.getName() + " status: " + (printer2.isAlive() ? "running" : "terminated"));
		
	}
	
}

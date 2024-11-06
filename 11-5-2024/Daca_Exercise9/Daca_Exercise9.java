package Daca_Exercise9;

import java.util.LinkedList;
import java.util.Queue;

public class Daca_Exercise9 extends Thread implements Runnable {

	public static Queue<String> queue = new LinkedList<>();
	
	public static void main(String[] args) {
		
		Thread task = new Thread(new Daca_Exercise9());
		queue.add("Hello");
		queue.add("My Name is JavaBot");
		queue.add("Nice to meet you!");
		task.start();
		
	}
	
	public void waitThread() {
		
		try {
			while(queue.size() > 0) {
				System.out.println(Thread.currentThread().getName() + " sent: " + queue.remove());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		waitThread();
	}

}

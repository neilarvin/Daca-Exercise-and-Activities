package Exercise2;

public class Daca_Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 12; i++) {
			
			System.out.print("On the ");
			
			switch(i){
				case 12: System.out.print("twelfth ");
					break;
				case 11: System.out.print("eleventh ");
					break;
				case 10: System.out.print("tenth ");
					break;
				case 9:  System.out.print("ninth ");
					break;
				case 8:  System.out.print("eighth ");
					break;
				case 7:  System.out.print("seventh ");
					break;
				case 6:  System.out.print("sixt ");
					break;
				case 5:  System.out.print("fifth ");
					break;
				case 4:  System.out.print("fourth ");
					break;
				case 3:  System.out.print("third ");
					break;
				case 2:  System.out.print("second");
					break;
				default: System.out.print("first ");
			}
			
			System.out.println("of Christmas my true love sent to me.");
			
			switch(i){
				case 12: System.out.println("Twelve Drummers Drumming.");
				case 11: System.out.println("Eleven Pipers Piping.");
				case 10: System.out.println("Ten Lords a-leaping.");
				case 9:  System.out.println("Nine Ladies Dancing");
				case 8:  System.out.println("Eight Maids a-milking");
				case 7:  System.out.println("Seven Swans a-swimming");
				case 6:  System.out.println("Six Geese a-laying");
				case 5:  System.out.println("Five Golden Rings");
				case 4:  System.out.println("Four Calling Birds");
				case 3:  System.out.println("Three French Hens");
				case 2:  System.out.println("Two Turtle Doves");
				default: System.out.println("And a Partridge in a Pear Tree.\n");
			}
			
		}

	}

}

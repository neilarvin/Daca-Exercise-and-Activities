package Daca_Exercise5;

import java.io.*;
import java.util.*;

public class Daca_Exercise5 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		Formatter numberFile = new Formatter("C:\\Users\\neil.daca\\eclipse-workspace\\DebugDemo\\src\\Daca_Exercise5\\number.txt");
		Formatter outputFile = new Formatter("C:\\Users\\neil.daca\\eclipse-workspace\\DebugDemo\\src\\Daca_Exercise5\\output.txt");
	
		int scale;
		
		while(true){
		
			try {
				System.out.print("Enter survey response from  1-10: ");
				scale = scan.nextInt();
				
				if(scale <= 10 && scale >= 1) {
					numberFile.format(scale + "\n");
				}else {
					
					numberFile.close();
					FileReader fileReader = new FileReader("C:\\Users\\neil.daca\\eclipse-workspace\\DebugDemo\\src\\Daca_Exercise5\\number.txt");
					Scanner read = new Scanner(fileReader);
					int values;
					while(read.hasNextInt()) {
						values = read.nextInt();
						System.out.println(values);
						outputFile.format(values + "\n");
					}

					outputFile.close();
					break;
					
				}
				
			} catch (Exception e) {
				break;
			}
			
		}
		
	}

}

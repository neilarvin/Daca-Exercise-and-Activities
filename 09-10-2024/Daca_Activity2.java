package Daca_Activity;

public class Daca_Activity2 {

	public static void main(String[] args) {
		
		int array[] = {5,4,3,6,10,9,7,15,11,12};
		found(array, 100);
			
	}
	
	public static void found(int array[], int target) {
		
		int found[] = new int[2];
		
		for(int j = 0; j < array.length; j++) {
			
			for(int k = j + 1; k < array.length; k++) {
				
				if(array[j] + array[k] == target && j != k) {
					
					found[0] = j;
					found[1] = k;
					break;
					
				}
				
			}
			
		}
		
		if(found[0] == 0 && found[1] == 0) {
			
			System.out.println("No Match Found!"); 
			
		}else {
			
			System.out.println("["+ found[0] +", " + found[1] + "]"); 
			
		}
	}

}

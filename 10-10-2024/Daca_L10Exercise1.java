package October102024;

import java.util.Scanner;

public class Daca_L10Exercise1 {
	
	static final int 	isNewCustomer = 15, hasLoyaltyCard = 10, hasCoupon = 20;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char isNewCustomer, hasLoyaltyCard, hasCoupon;
		long start, end;
		
		do {
			System.out.print("Are you New Customer? Y/N: ");
			isNewCustomer = scan.next().toUpperCase().charAt(0);	
			if(!(isNewCustomer == 'N' || isNewCustomer == 'Y')) {
				System.err.println("Invalid Choice!!");
			}	
		}while(!(isNewCustomer == 'N' || isNewCustomer == 'Y'));
		
		do {
			System.out.print("Do you have Loyalty Card? Y/N: ");
			hasLoyaltyCard = scan.next().toUpperCase().charAt(0);			
			if(!(hasLoyaltyCard == 'N' || hasLoyaltyCard == 'Y')) {
				System.err.println("Invalid Choice!!");
			}		
		}while(!(hasLoyaltyCard == 'N' || hasLoyaltyCard == 'Y'));
		
		do {
			System.out.print("Do you have Coupon? Y/N: ");
			hasCoupon = scan.next().toUpperCase().charAt(0);		
			if(!(hasCoupon == 'N' || hasCoupon == 'Y')) {
				System.err.println("Invalid Choice!!");
			}	
		}while(!(hasCoupon == 'N' || hasCoupon == 'Y'));
		
		start = System.nanoTime();		
		System.out.println(calculateDiscount(isNewCustomer, hasLoyaltyCard, hasCoupon));
		end = System.nanoTime();
		System.out.println("Time: " + ((end - start)/1000000) + " ms");	
		scan.close();
		
	}
	
	static String calculateDiscount(char isNewCustomerIn, char hasLoyaltyCardIn, char hasCouponIn) {
		
		if(isNewCustomerIn == 'Y') {
			return (hasLoyaltyCardIn == 'Y' ? 
					"\nThis situation is not possible!" : 
					"\nDiscount is " + (hasCouponIn == 'Y' ? hasCoupon : isNewCustomer) + "%");
		}else{
			return (hasLoyaltyCardIn == 'Y' ?
					"\nDiscount is " + (hasCouponIn == 'Y' ? hasLoyaltyCard + hasCoupon : hasLoyaltyCard) + "%" :
					"\nDiscount is " + (hasCouponIn == 'Y' ? hasCoupon : 0) + "%"	);
		}
		
	}
}

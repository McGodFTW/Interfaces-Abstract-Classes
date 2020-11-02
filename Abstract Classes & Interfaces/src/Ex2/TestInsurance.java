package Ex2;

import java.util.Scanner;

public class TestInsurance {
	
	public static void main(String args[]) {
		
		int lCounter = 0, hCounter = 0, tCounter = 0;
		Health h[] = new Health[5];
		Life l[] = new Life[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < h.length; i++) {
			
			h[i] = new Health();
			l[i] = new Life();
			
		}
		
		do {
			
			h[0].print();
			
			System.out.println("What type of insurance do you want?:\n1. Life Insurance\n2. Health Insurance");
			int hl = input.nextInt();
			
			switch(hl) {
			
				case 1:
					
					if(hCounter < 5) {
						
						
						
						System.out.println("What policy would you like:");
						h[lCounter].setType(input.next());
						
						System.out.println("Set your desired reasonable price:");
						h[lCounter].setCost(input.nextDouble());
						
						hCounter++;
						tCounter++;
						
					} else {
						
						System.out.println("We don’t have any more space for that type of insurance right now!");
						h[0].survey();
						
					}
					
					break;
				
				case 2:
				
					if(lCounter < 5) {
						
						
						
						System.out.println("What policy would you like:");
						l[lCounter].setType(input.next());
						
						System.out.println("Set your desired reasonable price:");
						l[lCounter].setCost(input.nextDouble());
						
						lCounter++;
						tCounter++;
						
					} else {
						
						System.out.println("We don’t have any more space for that type of insurance right now!");
						l[0].survey();
					}
					
					break;
					
			
			}
			
			
		}while(tCounter < 10);
		
		System.out.println("Program Ending, no more insurance policies left!");
		
	}

}

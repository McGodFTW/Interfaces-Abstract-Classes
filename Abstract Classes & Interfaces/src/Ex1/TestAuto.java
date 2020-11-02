package Ex1;

import java.util.Scanner;

public class TestAuto {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);	
		Tesla t[] = new Tesla[5];
		Honda h[] = new Honda[5];
		
		for(int i = 0; i < t.length; i++) {
			
			t[i] = new Tesla();
			
		}
		
		for(int i = 0; i < t.length; i++) {
			
			System.out.println("Enter Model:");
			t[i].setModel(input.next());
			
			System.out.println("Enter Price:");
			t[i].setPrice(input.nextDouble());
		}
		
		h[0] = new Honda("Civic", 25000);
		h[1] = new Honda("Accord", 15000);
		h[2] = new Honda("CRV", 35000);
		h[3] = new Honda("Pilot", 12500);
		h[4] = new Honda("Fit", 11000);
		
		System.out.println("Model\t\tPrice");
		for(int i = 0; i < h.length; i++) {
			
			System.out.println(t[i].getModel() + "\t\t$" + t[i].getPrice());
			
		}
		
		System.out.println("\nModel\t\tPrice");
		for(int i = 0; i < t.length; i++) {
			
			System.out.println(h[i].getModel() + "\t\t$" + h[i].getPrice());
			
		}
		
		
		
	}

}

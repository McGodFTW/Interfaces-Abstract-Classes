package Ex2;

import java.util.Scanner;

public class Life extends Insurance implements InsuranceInfo {
	
	Scanner input = new Scanner(System.in);
	
	String type;
	double cost;
	
	public Life() {
		
	}
	
	public Life(String t, double c) {
		
		cost = c;
		type = t;
		
	}

	
	public void setCost(double c) {
		
		cost = c;
		
	}

	
	public double getCost() {
		
		return cost;
	}
	
	public void setType(String t) {
		
		type = t;
		
	}

	public String getType() {

		return type;
		
	}
	

	
	public void survey() {
		
		System.out.println("Are you happy with your life insurance policies?:");
		String yn = input.next();
		System.out.println("Thank you for your feedback!");
		
		
	}
	
	@Override
	public void print() {

		System.out.println("Insurance is a contract, represented by a policy, in which an individual or entity receives financial protection or reimbursement against losses from an insurance company. The company pools clients' risks to make payments more affordable for the insured.");
		
	}

	
	

}

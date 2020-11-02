package Ex1;

public class Tesla extends Auto {
	
	public Tesla() {
		
	}
	
	public Tesla(String m, double p) {
		
		model = m;
		price = p;
		
	}
	
	public void setPrice(double p) {
		
		price = p;
		price *= 1.02;
		
	}

}

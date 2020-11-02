package Ex1;

public class Honda extends Auto {
	
	public Honda() {
		
	}
	
	public Honda(String m, double p) {
		
		model = m;
		price = p;
		
	}
	
	public void setPrice(double p) {
		
		price = p;
		price *= 0.95;
		
	}

}

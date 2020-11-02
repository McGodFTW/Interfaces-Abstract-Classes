package Ex1;

public abstract class Auto {
	
	String model;
	double price;
	
	public abstract void setPrice(double p);
	
	public void setModel(String m) {
		
		model = m;
		
	}
	
	public String getModel() {
		
		return model;
		
	}
	
	public double getPrice() {
		
		return price;
		
	}

}

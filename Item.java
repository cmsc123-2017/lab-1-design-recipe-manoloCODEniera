
public class Item {
	String name;
	double price;
	// CONSTANTS
	final double DISCOUNT_THRESHOLD = 1000.0;
	final double DISCOUNT_RATE = 0.1;
	
	
	public Item(String name, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	
	
	
public double salePrice1000(){
	if(this.price > DISCOUNT_THRESHOLD)
		return this.price * (1 - DISCOUNT_RATE); 
	return this.price;
	
	}
}

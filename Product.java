package objetos;

public class Product {

	private String name;
	private double price;
	private int qntd;
	
	public Product(String name, double price, int qntd) {
		this.name = name;
		this.price = price;
		this.qntd = qntd;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQntd() {
		return qntd;
	}
		
	
	public double TotalValuelnStock() {
		return price * qntd;
	}
	
	public void addProducts (int qntd) {
		this.qntd += qntd;
	}
  
	public void removeProducts (int qntd) {
		this.qntd -= qntd; 
	}
	
	public String toString() {
		return name 
		  + ", U$"
		  + String.format("%.2f", price) 
		  + " , " 
		  + qntd 
		  + " units, Total: $ "
		  + String.format("%.2f", TotalValuelnStock())
		  + "." ;

		
		
	}
		
}



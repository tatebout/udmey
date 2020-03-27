package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double TotalValueInStrock() {
		return price * quantity;
	}

	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", TotalValueInStrock());
	}
}

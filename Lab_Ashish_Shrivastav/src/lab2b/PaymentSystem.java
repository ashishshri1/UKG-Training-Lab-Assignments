package lab2b;

interface Payable {
	public double getPayment();
}

class Invoice implements Payable {
	private String partNum;
	private String partDescription;
	int quantity;
	double pricePerItem;

	public Invoice(String partNum, String partDescription, int quantity, double pricePerItem) {
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Part No.=");
		builder.append(partNum);
		builder.append(", Part Description=");
		builder.append(partDescription);
		builder.append(", Quantity=");
		builder.append(quantity);
		builder.append(", Price Per Item=");
		builder.append(pricePerItem);
		return builder.toString();
	}

	@Override
	public double getPayment() {
		System.out.println(this);
		return (this.pricePerItem * this.quantity);
	}

}

public class PaymentSystem {
	public static void main(String[] args) {
		Invoice i1 = new Invoice("1", "Mouse", 100, 300.0);
		Invoice i2 = new Invoice("2", "Headphones", 50, 2000.0);
		Employee e1 = new SalariedEmployee(1, "Sparsh", 10000.0);
		Employee e2 = new HourlyEmployee(2, "Sarthak", 400.0, 30.0);
		Employee e3 = new CommissionEmployee(3, "Praveen", 50.0, 12000.0);
		System.out.println("Total payment: " + i1.getPayment() + "\n");
		System.out.println("Total payment: " + i2.getPayment() + "\n");
		System.out.println("Total salary: " + e1.getPayment() + "\n");
		System.out.println("Total salary: " + e2.getPayment() + "\n");
		System.out.println("Total salary: " + e3.getPayment() + "\n");
	}
}

package lab3.q3;

import java.io.*;

class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int house_no;
	private String colony;
	private String city;

	public Address(int house_no, String colony, String city) {
		this.house_no = house_no;
		this.colony = colony;
		this.city = city;
	}

	public int getHouse_no() {
		return house_no;
	}

	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [house_no=");
		builder.append(house_no);
		builder.append(", colony=");
		builder.append(colony);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}

}

class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	private Address address;
	private transient double salary;

	public Employee(String name, String id, Address address, double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", id=");
		builder.append(id);
		builder.append(", address=");
		builder.append(address);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	public void display() {
		System.out.println(this);
	}
}

public class SerializationDeserialization {
	public static void main(String[] args) {
		Employee emp = new Employee("Ashish", "95", new Address(2, "Nehru Colony", "Gwalior"), 10000);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Ashish.ser")))) {
			System.out.println("Employee object before serialization");
			emp.display();
			oos.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("Ashish.ser")))) {
			Employee e = (Employee) ois.readObject();
			System.out.println("Employee object after deserialization");
			e.display();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

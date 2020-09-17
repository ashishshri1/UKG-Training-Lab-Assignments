package lab2b;

import java.util.*;

abstract class Employee implements Payable {
	private int eid;
	private String name;

	protected Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}

	public int getId() {
		return this.eid;
	}

	public String getName() {
		return this.name;
	}

	abstract public void setSalary(double rate);

	abstract public double getSalary();

	abstract public void increaseSalary(int percent);
}

class SalariedEmployee extends Employee {
	private double weeklyRate;

	public SalariedEmployee(int eid, String name, double rate) {
		super(eid, name);
		this.weeklyRate = rate;
	}

	@Override
	public void setSalary(double rate) {
		this.weeklyRate = rate;
	}

	@Override
	public double getSalary() {
		return this.weeklyRate;
	}

	@Override
	public void increaseSalary(int percent) {
		this.weeklyRate = this.weeklyRate * (1.0 + (double) percent / 100.0);
	}

	@Override
	public double getPayment() {
		System.out.println(this);
		return this.getSalary();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID=");
		builder.append(getId());
		builder.append(", Name=");
		builder.append(getName());
		builder.append(", Weekly Rate=");
		builder.append(weeklyRate);
		return builder.toString();
	}

}

class HourlyEmployee extends Employee {
	private double hourlyRate;
	private double hoursWorked;

	public HourlyEmployee(int eid, String name, double rate, double hoursWorked) {
		super(eid, name);
		this.hourlyRate = rate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public void setSalary(double rate) {
		this.hourlyRate = rate;
	}

	@Override
	public double getSalary() {
		return this.hourlyRate * this.hoursWorked;
	}

	@Override
	public void increaseSalary(int percent) {
		this.hourlyRate = this.hourlyRate * (1.0 + (double) percent / 100.0);
	}

	@Override
	public double getPayment() {
		System.out.println(this);
		return this.getSalary();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID=");
		builder.append(getId());
		builder.append(", Name=");
		builder.append(getName());
		builder.append(", Hourly Rate=");
		builder.append(hourlyRate);
		return builder.toString();
	}
}

class CommissionEmployee extends Employee {
	private double percentage;
	private double sales;

	public CommissionEmployee(int eid, String name, double rate, double sales) {
		super(eid, name);
		this.percentage = rate;
		this.sales = sales;
	}

	@Override
	public void setSalary(double rate) {
		this.percentage = rate;
	}

	@Override
	public double getSalary() {
		return this.percentage * this.sales / 100;
	}

	@Override
	public void increaseSalary(int percent) {
		this.percentage = this.percentage * (1.0 + (double) percent / 100.0);
	}

	@Override
	public double getPayment() {
		System.out.println(this);
		return this.getSalary();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID=");
		builder.append(getId());
		builder.append(", Name=");
		builder.append(getName());
		builder.append(", Sales Commission Percentage =");
		builder.append(percentage);
		return builder.toString();
	}
}

public class EmployeeRecordSystem {
	public static void main(String[] args) {
		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(new SalariedEmployee(1, "Sparsh", 10000.0));
		arr.add(new HourlyEmployee(2, "Sarthak", 400.0, 30.0));
		arr.add(new CommissionEmployee(3, "Praveen", 50.0, 12000.0));
		for (Employee emp : arr) {
			System.out.println("Total Salary=" + emp.getPayment() + "\n");
		}
		arr.get(0).increaseSalary(25);
		arr.get(1).increaseSalary(20);
		arr.get(2).increaseSalary(60);
		for (Employee emp : arr) {
			System.out.println("Total Salary=" + emp.getPayment() + "\n");
		}
	}
}

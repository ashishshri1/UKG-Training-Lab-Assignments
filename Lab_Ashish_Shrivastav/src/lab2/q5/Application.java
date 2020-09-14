package lab2.q5;

import java.util.Scanner;

class Vehicle {
	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;

	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}

	public int getNoOfWheel() {
		return noOfWheel;
	}

	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void display() {
		System.out.println("Make = " + make);
		System.out.println("Model = " + model);
		System.out.println("No. of wheel = " + noOfWheel);
		System.out.println("No. of passenger = " + noOfPassenger);
	}
}

class Car extends Vehicle {
	private int noOfDoor;

	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	}

	public int getNoOfDoor() {
		return noOfDoor;
	}

	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}

	public void display() {
		System.out.println("Make = " + this.getMake());
		System.out.println("Model = " + this.getModel());
		System.out.println("No. of door = " + this.getNoOfDoor());
	}
}

class Convertible extends Car {
	private boolean isHoodOpen;

	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}

	public boolean isHoodOpen() {
		return isHoodOpen;
	}

	public void setHoodOpen(boolean isHoodOpen) {
		this.isHoodOpen = isHoodOpen;
	}

	public void display() {
		super.display();
		if (isHoodOpen) {
			System.out.println("Hood is open");
		} else {
			System.out.println("Hood is closed");
		}
	}
}

class SportCar extends Car {
	public SportCar(int noOfWheel, int noOfPassenger, int model, String make) {
		super(noOfWheel, noOfPassenger, model, make, 2);
	}
}

public class Application {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("'1' - to create a Vehicle object.");
		System.out.println("'2' - to create a Car object.");
		System.out.println("'3' - to create a Convertible object.");
		System.out.println("'4' - to create a SportCar object.");
		int choice = sc.nextInt();
		if(choice==1) {
			sc.nextLine();
			System.out.println("Enter make: ");
			String make = sc.nextLine();
			System.out.println("Enter model: ");
			int model =sc.nextInt();
			System.out.println("Enter no. of wheels: ");
			int noOfWheel=sc.nextInt();
			System.out.println("Enter no. of passengers: ");
			int noOfPassenger=sc.nextInt();
			Vehicle v=new Vehicle(noOfWheel,noOfPassenger,model,make);
			v.display();
		}
		else if(choice == 2) {
			sc.nextLine();
			System.out.println("Enter make: ");
			String make = sc.nextLine();
			System.out.println("Enter model: ");
			int model =sc.nextInt();
			System.out.println("Enter no. of wheels: ");
			int noOfWheel=sc.nextInt();
			System.out.println("Enter no. of passengers: ");
			int noOfPassenger=sc.nextInt();
			System.out.println("Enter no. of doors: ");
			int noOfDoor=sc.nextInt();
			Car c =new Car(noOfWheel,noOfPassenger,model,make,noOfDoor);
			c.display();
		}
		else if(choice == 3) {
			sc.nextLine();
			System.out.println("Enter make: ");
			String make = sc.nextLine();
			System.out.println("Enter model: ");
			int model =sc.nextInt();
			System.out.println("Enter no. of wheels: ");
			int noOfWheel=sc.nextInt();
			System.out.println("Enter no. of passengers: ");
			int noOfPassenger=sc.nextInt();
			System.out.println("Enter no. of doors: ");
			int noOfDoor=sc.nextInt();
			System.out.println("Hood open? (true/false): ");
			boolean isHoodOpen = sc.nextBoolean();
			Convertible c=new Convertible(noOfWheel,noOfPassenger,model,make,noOfDoor,isHoodOpen);
			c.display();
		}
		else if(choice == 4) {
			sc.nextLine();
			System.out.println("Enter make: ");
			String make = sc.nextLine();
			System.out.println("Enter model: ");
			int model =sc.nextInt();
			System.out.println("Enter no. of wheels: ");
			int noOfWheel=sc.nextInt();
			System.out.println("Enter no. of passengers: ");
			int noOfPassenger=sc.nextInt();
			SportCar s=new SportCar(noOfWheel,noOfPassenger,model,make);
			s.display();
		}
		sc.close();
	}
}

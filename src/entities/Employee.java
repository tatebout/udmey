package entities;

public class Employee {
	public int id;
	public String name;
	public double salary;
	public double tax;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public double netSalary() {
		return salary - tax;
	}

	public void increaseSalary(double percentage) {
		this.salary += salary * percentage / 100;
	}

	public String toString() {
		return name + ", $ " +String.format("%.2f",netSalary());
	}
}

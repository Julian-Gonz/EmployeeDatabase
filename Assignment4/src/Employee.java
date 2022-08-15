
public class Employee {
	private String id;
	private String name;
	private String department;
	private double salary;
	private String designation;
	private int days;
	
	public Employee() {
		id = "No id";
		name = "No name";
		department = "No department";
		salary = 0;
		designation = "No designation";
	}
	
	public Employee(String id, String name, String department, double salary, String designation) {
		setID(id);
		setName(name);
		setDepartment(department);
		setSalary(salary);
		setDesignation(designation);
	}
	
	public Employee(Employee other) {
		if(other == null) {
			System.out.println("Error: null Employee object");
			System.exit(0);
		}
		else {
			this.id = other.id;
			this.name = other.name;
			this.department = other.department;
			this.salary = other.salary;
			this.designation = other.designation;
		}
	}
	
	public void setID(String id) {
		if(id==null || id=="") {
			System.out.println("Invalid id input");
			System.exit(0);
		}
		else {
			this.id = id;
		}
	}
	
	public String getID() {
		return id;
	}
	
	public void setName(String name) {
		if(name==null || name == "") {
			System.out.println("Invalid name input");
			System.exit(0);
		}
		else {
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setDepartment(String department) {
		if(department == null || department == "") {
			System.out.println("Invalid department input");
			System.exit(0);
		}
		else {
			this.department = department;
		}
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setSalary(double salary) {
		if(salary<=0) {
			System.out.println("Salary cannot be negative or equal to 0");
			System.exit(0);
		}
		else {
			this.salary = salary;
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setDesignation(String designation) {
		if(designation==null || designation == "") {
			System.out.println("Invalid designation input");
			System.exit(0);
		}
		else {
			this.designation = designation;
		}
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDays(int days) {		//Needed to help find the deductions
		if(days < 0 || days > 20) {
			System.out.println("Cannot set the days input");
			System.exit(0);
		}
		else {
			this.days = days;
		}
	}
	
	public int getDays() {		//Returns the days to help find deductions
		return days;
	}
	
	public double addBonus() {
		return getSalary() + 200;
	}
	
	public void display() {
		System.out.println("Employee ID: " + getID() + "\nEmployee Name: " + getName());
		System.out.println("Department Name: " + getDepartment() + "\nSalary: $" + getSalary());
		System.out.println("Designation: " + getDesignation() + "\nSalary after adding the "
				+ "bonus is: $" + addBonus() + "\n");
	}
	
	public double deductions(int days) {	//Finds the deductions for an employee
		double money = addBonus() / 20;
		int daysMissed = 20 - days;
		return money * daysMissed;
	}
	
	public boolean equals(Object other) {
		if(other == null) {
			return false;
		}
		else if(getClass() != other.getClass()){
			return false;
		}
		else {
			Employee otherEmployee = (Employee) other;
			return (designation.equals(otherEmployee.designation));
		}
	}
}


public class Manager extends Employee {
	
	public Manager() {
		this("No id", "No name", "No department", 0.0, "Manager");
	}
	
	public Manager(String id, String name, String department, double salary, String designation) {
		super(id, name, department, salary, designation);
	}
	
	public Manager(Manager other) {
		super(other);
	}
	
	public double addBonus() {	//Overridden method
		return getSalary() + 300;
	}
}

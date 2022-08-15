
public class Clerk extends Employee{
	
	public Clerk() {
		this("No id", "No name", "No department", 0.0, "Clerk");
	}
	
	public Clerk(String id, String name, String department, double salary, String designation) {
		super(id, name, department, salary, designation);
	}
	
	public Clerk(Clerk other) {
		super(other);
	}
	
	public double addBonus() {	//Overridden method
		return getSalary() + 100;
	}
}

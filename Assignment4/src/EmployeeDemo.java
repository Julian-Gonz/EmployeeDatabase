import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee mark = new Manager("E001", "Mark", "HR", 15000.0, "Manager");
		Employee peter = new Manager("E012", "Peter", "R&D", 15000.0, "Manager");
		Employee samuel = new Clerk("E056", "Samuel", "Accounts", 10000.0, "Clerk");
		
		mark.display();	//Displays the employees's information
		peter.display();
		samuel.display();
		
		if(mark.equals(samuel)) {	//Finds if the employees's designations are equal
			System.out.println(mark.getName() + " and " + samuel.getName() + " have the same Designations");
		}
		else {
			System.out.println(mark.getName() + " and " + samuel.getName() + " have different Designations");
		}
		System.out.println();
		
		Scanner scnr = new Scanner(System.in);
		int days;
		Employee [] employee = new Employee[3];
		employee[0] = mark;
		employee[1] = peter;
		employee[2] = samuel;
		
		for(int i = 0; i<3; i++) {	//Able to find days present out of 20
			System.out.println("Enter the number of days Employee " + employee[i].getID() + " is Present "
					+ "out of 20: ");
			days = scnr.nextInt();
			while(days < 0 || days >20) { 
				System.out.println("Invalid value! Enter a value between 0-20: "); 
				days = scnr.nextInt(); 
			}	
			employee[i].setDays(days);
		}
		
		System.out.println("\nEmployee ID\tPresent\tAbsent\tDeductions");
		int deduct[][] = new int[employee.length][1];
		for(int i = 0; i<deduct.length; i++) {		//Finds the employees's days present, absent and deduction
			System.out.print(employee[i].getID() + "\t\t");
			for(int j =0; j<deduct[i].length; j++) {
				System.out.println(employee[i].getDays() + "\t" + (20 - employee[i].getDays()) + 
						"\t$" + employee[i].deductions(employee[i].getDays()));
			}
		}
		
		double total = 0;
		for(int i = 0; i<3; i++) {		//Finds total of employee deduction
			total += employee[i].deductions(employee[i].getDays());
		}
		
		System.out.println("\nTotal Deductions: $" + total);
		scnr.close();
	}
}

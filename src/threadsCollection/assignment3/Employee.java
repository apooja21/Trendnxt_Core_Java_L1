package threadsCollection.assignment3;

public class Employee {
	
	private int eCode;
	private String eName;
	private String paySlip;

	public Employee(int eCode, String eName, String paySlip) {
		super();
		this.eCode = eCode;
		this.eName = eName;
		this.paySlip = paySlip;
	}
	
	public int geteCode() {
		return eCode;
	}

	public String geteName() {
		return eName;
	}
	
	public String getPaySlip() {
		return paySlip;
	}
	
	

	@Override
	public String toString() {
		return "Employee [eCode=" + eCode + ", eName=" + eName + ", paySlip=" + paySlip + "]";
	}

	public static void main(String[] args) {
		
		EmployeeDB empDB = new EmployeeDB();
		System.out.println(empDB.addEmployee(new Employee(1, "Aragon", "PS1")));
		System.out.println(empDB.addEmployee(new Employee(2, "Legolas", "PS2")));
		System.out.println(empDB.listAll());
		System.out.println(empDB.showPaySlip(2));
		System.out.println(empDB.deleteEmployee(1));
		System.out.println(empDB.listAll());
	}

}

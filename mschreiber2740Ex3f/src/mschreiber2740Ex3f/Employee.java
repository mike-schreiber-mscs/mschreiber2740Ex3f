package mschreiber2740Ex3f;

public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	
	//no arg constructor
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}

	
	//2 arg constructor
	public Employee(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
		department = "";
		position = "";
		
	}
	
	
	
	//4 arg constructor
	public Employee(String name, int idNumber, String department,
			String position) {
		
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	public String toString() {
		StringBuilder str = new StringBuilder("ID: ");
		str.append(this.idNumber);
		str.append(", ");
		str.append(this.name);
		str.append(", Dept: ");
		str.append(this.department);
		str.append(", Position: ");
		str.append(this.position);	
				
		return str.toString();
		
	}
	
	

}


package pkg.mybatis;

public class Employee {
	private int Employee_Id;
	private String name;
	private int Department_ID;

	public Employee() {
		super();
	}
	public Employee(int emproyee_Id, String emproyee_Name, int department_Id) {
		super();
		this.Employee_Id = emproyee_Id;
		this.name = emproyee_Name;
		this.Department_ID = department_Id;
	}
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int emproyee_Id) {
		this.Employee_Id = emproyee_Id;
	}
	public String getEmployee_Name() {
		return name;
	}
	public void setEmployee_Name(String emproyee_Name) {
		this.name = emproyee_Name;
	}
	public int getDepartment_Id() {
		return Department_ID;
	}
	public void setDepartment_Id(int department_Id) {
		this.Department_ID = department_Id;
	}

}

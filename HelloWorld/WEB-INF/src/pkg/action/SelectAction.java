package pkg.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Result;

import pkg.mybatis.DbMain;
import pkg.mybatis.Employee;

import com.opensymphony.xwork2.ActionSupport;
@Result(name ="SUCCES", location = "select.jsp")
public class SelectAction extends ActionSupport{
	private int id;
	private String name;
	private int departmentId;
	private Employee emp;
	private int buttonId;
	private List<Employee> employeeList=new ArrayList<Employee>();;

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

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public int getButtonId() {
		return buttonId;
	}

	public void setButtonId(int buttonId) {
		this.buttonId = buttonId;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public String execute() {

		try {
			DbMain db= new DbMain();
				if(buttonId==2){
					employeeList=db.selectAll();
					id=0;

				}else if(id!=0){
					emp = db.selectOne(id);
					if(emp==null){
						return "SUCCES";
					}
					employeeList.add(emp);
				}

		} catch (Exception e) {
			 System.err.println(e.getMessage());
			// TODO: handle exception
		}


		return "SUCCES";
	}
}

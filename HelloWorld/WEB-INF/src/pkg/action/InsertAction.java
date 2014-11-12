package pkg.action;

import org.apache.struts2.convention.annotation.Result;

import pkg.mybatis.DbMain;
import pkg.mybatis.Employee;

import com.opensymphony.xwork2.ActionSupport;

@Result(name ="SUCCES", location = "insert.jsp")
public class InsertAction extends ActionSupport {
	private int id;
	private String name;
	private int departmentId;
	private Employee em;

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

	public Employee getEm() {
		return em;
	}

	public void setEm(Employee em) {
		this.em = em;
	}

	public String execute() {

		try {
			if(name!=null&&name.length()!=0){
				DbMain db= new DbMain();
				em = db.insert(name,departmentId);
				id=em.getEmployee_Id();
				name=em.getEmployee_Name();
				departmentId=em.getDepartment_Id();
			}

		} catch (Exception e) {
			 System.err.println(e.getMessage());
			// TODO: handle exception
		}
		return "SUCCES";
	}
}

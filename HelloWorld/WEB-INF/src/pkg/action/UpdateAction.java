package pkg.action;

import org.apache.struts2.convention.annotation.Result;

import pkg.mybatis.DbMain;
import pkg.mybatis.Employee;

import com.opensymphony.xwork2.ActionSupport;

@Result(name ="SUCCES", location = "update.jsp")
public class UpdateAction extends ActionSupport {
	private int id;
	private String name;
	private int departmentId;
	private Employee em;
	private int buttonId;

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


	public int getButtonId() {
		return buttonId;
	}

	public void setButtonId(int buttonId) {
		this.buttonId = buttonId;
	}

	public String execute() {

		try {
			DbMain db= new DbMain();
			if(buttonId==1){
				em=db.selectOne(id);
				id=em.getEmployee_Id();
				name=em.getEmployee_Name();
				departmentId=em.getDepartment_Id();

			}else if(buttonId==2){
				if(name!=null&&name.length()!=0){
					em = db.update(id,name,departmentId);
					id=em.getEmployee_Id();
					name=em.getEmployee_Name();
					departmentId=em.getDepartment_Id();
				}
			}
		} catch (Exception e) {
			 System.err.println(e.getMessage());
			// TODO: handle exception
		}
		return "SUCCES";
	}
}

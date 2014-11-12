package pkg.action;

import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Result(name =ActionSupport.SUCCESS, location = "index.jsp")
public class IndexAction extends ActionSupport {

	public String execute() {
		return SUCCESS;
	}
}

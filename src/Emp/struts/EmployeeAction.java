package Emp.struts;

import java.util.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import Emp.dao.jdbc.DatabaseConnection;
import Emp.dao.jdbc.EmployeeDao;
import Emp.domain.EmployeeBean;
import Emp.domain.FindEmployee;
import Emp.services.Employeeservice;
public class EmployeeAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmployeeBean empp=new EmployeeBean();
	private DatabaseConnection dbconn=new EmployeeDao();
	private Employeeservice empservice= new Employeeservice();
public EmployeeAction()
{
	
}
private Long id;
private String fname;
private String lname;
private Long deptid;
private String lanid;
private String createdby;
private String modifiedby;
private String email;
private String deptname;
private List<EmployeeBean> employeelist;
public String selectEmployee()
{
	System.out.println(id);
	System.out.println(fname);
	System.out.println(lname);
	System.out.println(deptid);
	System.out.println(lanid);
	System.out.println(createdby);System.out.println(modifiedby);System.out.println(email);System.out.println(deptname);
EmployeeBean empp=empservice.selectEmployee(id);
System.out.println(empp.getId());
	id=empp.getId();
	fname=empp.getFname();
	lname=empp.getLname();
	deptid=empp.getDeptid();
	lanid=empp.getLanid();
	createdby=empp.getCreatedby();
	modifiedby=empp.getModifiedby();
	email=empp.getEmail();
	deptname=empp.getDeptname();
	return SUCCESS;
}

public String searchEmployee()
{
	//if(fname.equals("") && lname.equals("") && deptname.equals("") && lanid.equals(""))
	//{
		//return ERROR;
	//}
	
 FindEmployee search= new FindEmployee();
 search.setFname(fname);
 search.setLname(lname);
 search.setDeptname(deptname);
 search.setLanid(lanid);
 
 Employeeservice empservice = new Employeeservice();
  employeelist= empservice.searchEmployee(search);
	return SUCCESS;
	
}

public String insertEmployee()
{
	
	//TODO : Print values entered by user 
	
	
	System.out.println(fname);
	System.out.println(lname);
	System.out.println(deptid);
	System.out.println(lanid);
	System.out.println(createdby);
	System.out.println(modifiedby);
	System.out.println(email);
	empp.setFname(fname);
	empp.setLname(lname);
	empp.setDeptid(deptid);
	empp.setLanid(lanid);
	empp.setCreatedby(createdby);
	empp.setModifiedby(modifiedby);
	empp.setEmail(email);
	 Employeeservice empservice= new Employeeservice();
	empservice.insertEmployee(empp);
	return SUCCESS;
	
}

public String deleteEmployee(){
	empservice.deleteEmployee(id);
	
	// *********************A demo code line for Servlets*****************************
	//HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
	//empservice.deleteEmployee(Longeger.parseLong( request.getParameter("id")));
	
	return SUCCESS;
}
public String updateEmployee()
{ 
	
	
	System.out.println(fname);
	System.out.println(lname);
	System.out.println(deptid);
	System.out.println(lanid);
	System.out.println(createdby);System.out.println(modifiedby);System.out.println(email);System.out.println(deptname);
	empp.setId(id);
	empp.setFname(fname);
	empp.setLname(lname);
	empp.setDeptid(deptid);
	empp.setLanid(lanid);
	empp.setCreatedby(createdby);
	empp.setModifiedby(modifiedby);
	empp.setEmail(email);
	
	empservice.updateEmployee(empp);
	return SUCCESS;
	
}

public String reset()
{
  return SUCCESS;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public Long getDeptid() {
	return deptid;
}
public void setDeptid(Long deptid) {
	this.deptid = deptid;
}
public String getLanid() {
	return lanid;
}
public void setLanid(String lanid) {
	this.lanid = lanid;
}
public String getCreatedby() {
	return createdby;
}
public void setCreatedby(String createdby) {
	this.createdby = createdby;
}
public String getModifiedby() {
	return modifiedby;
}
public void setModifiedby(String modifiedby) {
	this.modifiedby = modifiedby;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getDeptname() {
	return deptname;
}

public void setDeptname(String deptname) {
	this.deptname = deptname;
}

public List<EmployeeBean> getEmployeelist() {
	return employeelist;
}

public void setEmployeelist(List<EmployeeBean> employeelist) {
	this.employeelist = employeelist;
}


}

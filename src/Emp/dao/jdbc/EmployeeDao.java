package Emp.dao.jdbc;

import java.util.*;

import Emp.domain.EmployeeBean;
import Emp.domain.FindEmployee;
import java.sql.SQLException;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class EmployeeDao implements DatabaseConnection {
	public EmployeeDao() {

	}

	public EmployeeBean selectEmployee(Long id) {

		String sql = "  SELECT emp.ID AS id,"
		+ " FNAME AS fname, " 
		+ "INITCAP (LNAME) lname," 
		+ "DEPT_ID as deptid, LANID, "
		+ "emp.CREATED_BY AS createdby, " 
		+ "emp.MODIFIED_BY AS modifiedby, "
		+ "EMAIL, " 
		+ "DEPT_NAME as deptname "
		+ "FROM EMPS emp, "
		+ "Departments dept " 
		+ "where emp.dept_id=dept.id " 
		+ "AND emp.id=?";

		EmployeeBean employeelist = (EmployeeBean) jt.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<EmployeeBean>(EmployeeBean.class));
	
		return employeelist;

	}

	public List<EmployeeBean> searchEmployee(FindEmployee search) {

		String lanid = ")";
		if (search.getLanid() == null || search.getLanid().equals("")) {
			lanid = "or lanid is null";
		}

		String sql = "/* Formatted on 8/10/2016 4:20:44 PM (QP5 v5.252.13127.32847) */ "
				+ "       select * from (SELECT emp.id AS id, " 
				+ "       fname, " 
				+ "       lname, "
				+ "       dept_id as deptid, " 
				+ "       lanid, " 
				+ "       emp.created_by AS createdby, "
				+ "       emp.modified_by AS modifiedby, " 
				+ "       email, " 
				+ "       dept_name as deptname"
				+ "       FROM EMPS emp, Departments dept " 
				+ "       WHERE emp.dept_id = dept.id "
				+ "       AND UPPER (emp.fname) LIKE UPPER (?) " 
				+ "       AND UPPER (emp.lname) LIKE UPPER (?) "
				+ "       AND dept.dept_name Like ?)"; 
				//+ "       AND emp.lanid Like ? )";

		
		@SuppressWarnings("unchecked")
		List<EmployeeBean> employeelist = jt.query(sql,
				new Object[] { search.getFname() + '%', search.getLname() + '%', search.getDeptname() + '%', /*search.getLanid() */ },
				new BeanPropertyRowMapper<EmployeeBean>(EmployeeBean.class));

		System.out.println(employeelist);
		for (EmployeeBean empBean : employeelist) {
			System.out.println("DEBUG:   FIRST NAME TEST:  " + empBean.getFname());
			System.out.println("DEBUG:   DEPT NAME TEST:  " + empBean.getDeptname());
		}
		return employeelist;

	}

	public void insertEmployee(EmployeeBean empp) {
		// int result=0;
		try {
			String query = "insert into  EMPS (ID, "
					+ "FNAME, "
					+ "LNAME, "
					+ "DEPT_ID, "
					+ "LANID, "
					+ "CREATED_BY, "
					+ "DATE_CREATED,"
					+ "DATE_MODIFIED,"
					+ "MODIFIED_BY, "
					+ "EMAIL) values "
					+ "(st_seq.nextval,?,?,?,?,?, "
					+ "SYSDATE,"
					+ "SYSDATE,?,?)";

			jt.update(query, new Object[] { empp.getFname(), empp.getLname(), empp.getDeptid(), empp.getLanid(),
					empp.getCreatedby(), empp.getModifiedby(), empp.getEmail() });
			System.out.println(query);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public Long deleteEmployee(Long id) {

		try {
			String sql = ("delete from EMPS where id=?");
			jt.update(sql, new Object[] { id });

		} catch (Exception e) {
			e.getMessage();
		}

		return id;
	}

	public void updateEmployee(EmployeeBean empp) {
		try {
			
			String updatesql = "UPDATE EMPS SET "
					+ "FNAME=?, "
					+ "LNAME=?,"
					+ "DEPT_ID=?, "
					+ "LANID = ?, "
					+ "CREATED_BY=?, "
					+ "DATE_MODIFIED = SYSDATE, "
					+ "MODIFIED_BY = ?, "
					+ "EMAIL=? "
					+ "WHERE ID=?";
			
			
			
			jt.update(updatesql, new Object[] { empp.getFname(), empp.getLname(), empp.getDeptid(), empp.getLanid(),
					empp.getCreatedby(), empp.getModifiedby(), empp.getEmail(), empp.getId() });
			
			

			System.out.println("DEBUG:   FIRST NAME TEST:  " + empp.getFname());
			System.out.println("DEBUG:   DEPT NAME TEST:  " + empp.getLname());
			System.out.println("DEBUG:   DEPT NAME TEST:  " + empp.getDeptid());
			System.out.println("DEBUG:   DEPT NAME TEST:  " + empp.getLanid());
			System.out.println("DEBUG:   DEPT NAME TEST:  " + empp.getCreatedby());
			System.out.println("DEBUG:   DEPT NAME TEST:  " + empp.getModifiedby());
			System.out.println("DEBUG:   DEPT NAME TEST:  " + empp.getEmail());
			System.out.println("DEBUG:   DEPT NAME TEST:  " + empp.getId());
		
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e.getMessage());
		}

	}

}

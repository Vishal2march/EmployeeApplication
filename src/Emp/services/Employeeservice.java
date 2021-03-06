package Emp.services;

import java.util.List;

import Emp.dao.jdbc.EmployeeDao;
import Emp.domain.EmployeeBean;
import Emp.domain.FindEmployee;

public class Employeeservice {

	EmployeeDao dao = new EmployeeDao();

	public Employeeservice() {

	}

	public EmployeeBean selectEmployee(Long id) {

		return dao.selectEmployee(id);

	}

	public List<EmployeeBean> searchEmployee(FindEmployee search) {
		return dao.searchEmployee(search);

	}

	public void insertEmployee(EmployeeBean empp) {
		dao.insertEmployee(empp);

	}

	public Long deleteEmployee(Long id) {
		return dao.deleteEmployee(id);

	}

	public void updateEmployee(EmployeeBean empp) {
		dao.updateEmployee(empp);

	}
}

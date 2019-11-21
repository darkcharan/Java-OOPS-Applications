package com.employeeDao;

import java.util.List;

import com.employee.EmployeeBean;

public interface EmployeeDao {
	void AddEmployee();
	List<EmployeeBean>ViewEmployee();
	void ViewEmployee(int eno);
	void UpdateEmployee(int eno);
	void DeleteEmployee(int eno);

}

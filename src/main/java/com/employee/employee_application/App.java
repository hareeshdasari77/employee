package com.employee.employee_application;

import java.util.List;
import java.util.Optional;

import com.maven.dto.Employee;
import com.maven.service.EmployeeServiceImpl;

public class App 
{
	public void demo()
	{
		System.out.println("bug-1");
	}
    public static void main( String[] args )
    {
       
    	
    	EmployeeServiceImpl employeeService =new EmployeeServiceImpl();
    	
    	
    	Employee employee =new Employee(101, "rohit", 10000.0, "JAVA");
    	
     Optional<Employee> addedEmployee =	employeeService.addEmployee(employee);
    	
     if(addedEmployee.isPresent())
     {
    	 System.out.println("employee added sucessfull");
     }
     
     List<Employee> employees = employeeService.getEmployees();
     System.out.println(employees);
    	
    }
}

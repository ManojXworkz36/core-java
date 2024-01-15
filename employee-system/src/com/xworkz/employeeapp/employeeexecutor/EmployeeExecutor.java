package com.xworkz.employeeapp.employeeexecutor;

import com.xworkz.employeeapp.Employee;
import com.xworkz.employeeapp.Impl.CognizantImpl;

public class EmployeeExecutor {

        public static void main(String[] args) {

            CognizantImpl company = new CognizantImpl();
            try{
                Employee employee = new Employee();
                employee.setEmployeeId(1);
                employee.setEmployeeName("Gagan");
                employee.setEmployeeDepartment("Development");
                employee.setEmployeeProjectId(3);
                employee.setEmployeeProjectName("Identity and Access Management");
                employee.setEmployeeJoiningDate("20-11-2023");

                company.addEmployee(employee);

                Employee employee1 = new Employee();
                employee1.setEmployeeId(2);
                employee1.setEmployeeName("Sachin");
                employee1.setEmployeeDepartment("Development");
                employee1.setEmployeeProjectId(3);
                employee1.setEmployeeProjectName("Identity and Access Management");
                employee1.setEmployeeJoiningDate("15-11-2023");

                company.addEmployee(employee1);



                company.getEmployeeDetails();

            }catch(Exception e){
                System.out.println("Interrupted");
            }
        }
    }



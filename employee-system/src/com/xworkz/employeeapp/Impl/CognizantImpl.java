package com.xworkz.employeeapp.Impl;

import com.xworkz.employeeapp.Employee;
import com.xworkz.employeeapp.company.Company;

import java.util.ArrayList;

public class CognizantImpl implements Company {
    ArrayList employees = new ArrayList();
   // ArrayList employees = new ArrayList();

    int employeeId = 1,index = 0;


    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Number of employees present are : "+this.employees.size());

//        for (int i = 0; i < this.employees.size(); i++) {
//            System.out.println(employees);
//        }

        for(Object e:employees){
            System.out.println(e);
        }


    }
}


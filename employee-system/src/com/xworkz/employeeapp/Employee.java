package com.xworkz.employeeapp;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee {

        private int employeeId;
        private String employeeName;
        private String employeeDepartment;
        private String employeeJoiningDate;
        private int employeeProjectId;
        private String employeeProjectName;
    }


package com.xworkz.map.officer;


import lombok.*;

@Setter
@Getter
@ToString
public class Officer {
    private String officerName;
    private int officerId;
    private String officerAddress;
    private int officerAge;
    private String officerPostName;
    private String officerBloodroup;
    private String officerGender;

    public Officer(){

    }

    public Officer(String officerName, int officerId, String officerAddress, int officerAge, String officerPostName, String officerBloodroup, String officerGender) {
        this.officerName = officerName;
        this.officerId = officerId;
        this.officerAddress = officerAddress;
        this.officerAge = officerAge;
        this.officerPostName = officerPostName;
        this.officerBloodroup = officerBloodroup;
        this.officerGender = officerGender;
    }
}


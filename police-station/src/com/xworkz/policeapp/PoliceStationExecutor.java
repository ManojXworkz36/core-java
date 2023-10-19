package com.xworkz.policeapp;

import com.xworkz.policeapp.hub.OfficerHub;
import com.xworkz.policeapp.policestation.Officer;

import java.util.Scanner;

public class PoliceStationExecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of officers to be added");
        int size = sc.nextInt();
        OfficerHub off = new OfficerHub(size);
        for (int i = 0; i <size ; i++) {
Officer officer = new Officer();
            System.out.println("Enter the officer id");
officer.setOfficerId(sc.nextInt());

            System.out.println("Enter the officer name");
            officer.setOfficerName(sc.next());

            System.out.println("enter the gender of officer");
            officer.setOfficerGender(sc.next());

            System.out.println("Enter officer post name");
            officer.setOfficerPostName(sc.next());

            System.out.println("Enter the officer blood group");
            officer.setOfficerBloodroup(sc.next());

            off.addOfficer(officer);
            System.out.println("officers added sucessfully");

        }
        off.getAllOfficers();
        System.out.println("Got officers info");
        String input = null;
        do{
            System.out.println("Press 1: to get all officers");
            System.out.println("Press 2: to get officer by name");
            System.out.println("Press 3:to get officer by id");

            int options = sc.nextInt();
            switch (options){

                case 1:off.getAllOfficers();
                    break;

                case 2:
                    System.out.println("Enter the officer Name");
                    off.getOfficerBYName(sc.next());
                    break;
                case 3:
                    System.out.println("enter the officer id");
                    off.getOfficerById(sc.nextInt());
                    break;

                default:
                    System.out.println("Please enter the valid choice");

            }
            System.out.println("Do you want to continue Y/N");
            input=sc.next();

        } while (input.equals("Y"));
        System.out.println("Thank you for using our app");















       /* Officer officer = new Officer();
        officer.setOfficerAge(27);
        officer.setOfficerName("Gagan");
        officer.setOfficerId(1);
        officer.setOfficerGender("A+");
        officer.setOfficerAddress("Davanagere");
        officer.setOfficerPostName("CPI");
        officer.setOfficerGender("Male");



        Officer officer1 = new Officer();
        officer1.setOfficerAge(25);
        officer1.setOfficerName("Sachin");
        officer1.setOfficerId(2);
        officer1.setOfficerGender("B+");
        officer1.setOfficerAddress("Shivmogga");
        officer1.setOfficerPostName("PSI");
        officer1.setOfficerGender("Male");


        OfficerHub station = new OfficerHub();
        station.addOfficer(officer);
       station.addOfficer(officer1);
       // station.getAllOfficers();
        Officer off = station.getOfficerBYName("Gagan");
        System.out.println(off.getOfficerName()+" "+off.getOfficerId()+" "+off.getOfficerPostName()+" "+off.getOfficerGender()+" "+off.getOfficerAge()+" "+off.getOfficerBloodroup());
  boolean name = station.updateOfficerNameById(1,"Yuvi");
        System.out.println(name);
        station.getAllOfficers();
station.deleteOfficerbyName("Sachin");
station.getAllOfficers();*/
    }
}

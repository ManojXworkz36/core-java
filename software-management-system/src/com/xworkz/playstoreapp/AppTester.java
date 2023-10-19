package com.xworkz.playstoreapp;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.hub.SoftwareHub;

//import java.sql.SQLOutput;
import java.util.Scanner;

public class AppTester {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of apps to be added");
  int size=sc.nextInt();

        SoftwareHub software = new SoftwareHub(size);
       // System.out.println("Enter the number of apps to be added");
        for (int i = 0; i <size ; i++) {
            Application application = new Application();


           // System.out.println("Enter the " + (i+1) + " th APP Id");
       // application.setAppId(sc.nextInt());


            System.out.println("Enter The " +( i+1) + " th App Name");
        application.setAppName(sc.next());


            System.out.println("Enter the  " + (i+1 )+ " th company Name");
       application.setCompanyName(sc.next());


            System.out.println("Enter the " + (i+1) +" th app version ");
    application.setAppVersion(sc.next());


            System.out.println("Enter The " +( i+1) + "th app type");
       application.setAppType(sc.next());


            System.out.println("Enter the " + (i+1) +" th app release date");
      application.setReleaseDate(sc.next());

            System.out.println("enter the " + (i+1 )+ " th app size");
            application.setSizeInMb(sc.nextDouble());



      // Application app = new Application();

        software.addApplications(application);
            System.out.println("Apps added sucessfully");
        }
        software.getAllApplications();
        System.out.println("Got all Apps info");
        String input = null;
        do{
            System.out.println("Press 1: to get all applications");
            System.out.println("Press 2: to get application by name");
            System.out.println("Press 3: to get application by type");
            System.out.println("Press 4: to get application type by name");
            System.out.println("Press 5: to get application by id");
            int options = sc.nextInt();
            switch (options){

                case 1:software.getAllApplications();
                break;

                case 2:
                    System.out.println("Enter the application Name");
                    software.getApplicationByName(sc.next());
                    break;

                case 3:
                    System.out.println("Enter the Application Type");
                    software.getApplicationByType(sc.next());
                    break;

                case 4:
                    System.out.println("Enter the Application Name");
                    software.getApplicationTypeByName(sc.next());
                    break;

                case 5:
                    System.out.println("Enter the application id");
                    software.getApplicationById(sc.nextInt());
                    break;

                default:
                    System.out.println("Please enter the valid choice");

            }
            System.out.println("Do you want to continue Y/N");
            input=sc.next();

        } while (input.equals("Y"));
        System.out.println("Thank you for using our app");



























       /* app.setAppId(2);
       // app.setAppName("Instagram");
       // SoftwareHub software = new SoftwareHub();
      // software.addApplications(app);
       // app.setCompanyName("meta");
       // app.setAppVersion("2.4V");
       // app.setAppType("Entertainment");
        //app.setReleaseDate("01-04-2006");
        //app.setSizeInMb(28.7);
     //  software.getAllApplications();
       /*software.UpdateAppVersionByAppName("Twitter","1.5V");
       software.upDateCompanyNameById("Meta",1);
       software.updateAppversionAndSizeByName("1.6V",15,"Twitter");
       software.getAllApplications();
       software.deleteApplicationByApp("Instagram");
       software.getAllApplications();}*/
       /* System.out.println("Enter name of an app to be searched");

        Application app1=software.getApplicationByName(sc.next());
        System.out.println("Searched app details are");
        System.out.println(app1.getAppName()+" "+app1.getAppId()+" "+app1.getReleaseDate()+" "+ app1.getCompanyName()+" "+app1.getSizeInMb()+" "+app1.getAppVersion()+ " "+app1.getAppType());

        System.out.println("enter type of an application to be searched");
 Application app2 = software.getApplicationByType(sc.next());
        System.out.println("Searched application info are :");

   System.out.println(app2.getAppType()+" " +app2.getAppName()+" "+app2.getAppId()+" "+app2.getAppVersion()+" "+app2.getAppVersion()+" "+app2.getCompanyName()+" "+app2.getReleaseDate());

        System.out.println("enter applicatrion name to be searched ton get type of an app");

 String  appType = software.getApplicationTypeByName(sc.next());
        System.out.println("Application Type of  given AppName "+appType);
        System.out.println("Enter application id to be searched");
        Application appId = software.getApplicationById(1);
        System.out.println(appId.getAppName());*/


    }
}

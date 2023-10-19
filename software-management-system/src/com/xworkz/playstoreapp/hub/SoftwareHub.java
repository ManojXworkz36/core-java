package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Application;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SoftwareHub {
    Application application[] ;
    public SoftwareHub(int size) {
        application = new Application[size];
    }
    int index=0;
    int appId=1;

    public boolean addApplications(Application application) {
        boolean isAdded = false;
        if (application != null) {
            this.application[index] = application;
            this.application[index].setAppId(appId++);
            System.out.println("Application added successfully");
            index++;
            isAdded = true;


        }
        return isAdded;
    }

    public void getAllApplications() {

        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index].getAppId() + " " + application[index].getAppName() + " " + application[index].getSizeInMb() + " " + application[index].getAppType() + " " + application[index].getAppVersion() + " " + application[index].getCompanyName() + " " + application[index].getReleaseDate());
        }
    }

    public Application getApplicationByName(String appName) {
        System.out.println("Search Application By Its Name");
        Application appli = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName().equals(appName)) {
                appli = application[appIndex];
                System.out.println("Application found,install it");
            }


        }
        return appli;
    }

    public Application getApplicationByType(String appType) {
        System.out.println("Application Searching by Application Type");
        Application app = null;
        for (int index = 0; index < this.application.length; index++) {
            if (application[index].getAppType().equals(appType)) {
                app = application[index];
                System.out.println("App is found by its type ,Install it");
            }

        }
        return app;
    }

    public String getApplicationTypeByName(String appName) {
        System.out.println("Searching Application  Type by Application Name");
        String app = null;
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppName().equals(appName)) {
                app = application[i].getAppType();
                System.out.println("Application  Type is found");
            }

        }
        return app;
    }

    public Application getApplicationById(int appId) {
        System.out.println("Search Application by Id");
        Application app = null;
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppId() == appId) {
                app = application[i];
            }

        }
        return app;
    }

    public boolean UpdateAppVersionByAppName(String existingAppName, String upDatedVersion) {
        boolean isVersionUpdated = false;
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppName() == existingAppName) {
                application[i].setAppVersion(upDatedVersion);
                isVersionUpdated = true;

            }

        }
        return isVersionUpdated;
    }

    public boolean upDateCompanyNameById(String updatedCompanyName, int existingId) {
        boolean isCompanyUpdated = false;
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppId() == existingId) {
                application[i].setCompanyName(updatedCompanyName);
                isCompanyUpdated = true;
            }

        }

        return isCompanyUpdated;
    }

    public boolean updateAppversionAndSizeByName(String updatedAppVersion, double updatedAppSize, String existingAppName) {
        boolean isUpdated = false;
        for (int i = 0; i < this.application.length; i++) {
            if (application[i].getAppName() == existingAppName) {
                if (application[i].getAppName() == existingAppName) {
                    application[i].setAppVersion(updatedAppVersion);
                    application[i].setSizeInMb(updatedAppSize);
                }
            }

        }
        return isUpdated;
    }

    public void deleteApplicationByApp(String appName) {
       /* Application newapplication[]=new Application[this.application.length-1];
        int newIndex = 0;
    for (int i = 0; i <this.application.length ; i++) {
        if (application[i].getAppName()!=appName) {
            newapplication[newIndex++]=application[i];
            }
        }
    System.out.println("list of Applications post Delete");
    for (int index = 0; index <newapplication.length; index++) {
        System.out.println(newapplication[index].getAppId()+" "+newapplication[index].getAppName()+" "+newapplication[index].getAppType()+" "+newapplication[index].getReleaseDate()+" "+newapplication[index].getAppVersion()+" "+ newapplication[index].getCompanyName());

    }
    }*/

int index,newIndex;
        for (index=0,newIndex=0;index<this.application.length;index++) {
            if(application[index].getAppName()!=appName){
                application[newIndex++]=application[index];
                System.out.println("Given app is deleted");
            }

        }
        application = Arrays.copyOf(application,newIndex);
        //getAllNewApplication(application);
    }

    //public void getAllNewApplication(Application[] application) {
    //   for (int i = 0; i <application.length ; i++) {
         //  System.out.println(application[i].getAppId()+" "+application[i].getAppName()+" "+application[i].getAppType()+" "+application[i].getSizeInMb()+" "+application[i].getAppVersion());

      }






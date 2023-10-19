package com.xworkz.policeapp.hub;

import com.xworkz.policeapp.policestation.Officer;

import java.util.Arrays;

public class OfficerHub {
    Officer officer[];
    int index;
    public OfficerHub(int size){
        officer=new Officer[size];
    }

    public boolean addOfficer(Officer officer){
         boolean isAdded = false;
if(officer!=null){
this.officer[index++]=officer;
isAdded=true;
}
return isAdded;
    }

    public void getAllOfficers(){
        for (int index = 0; index <officer.length; index++) {
            System.out.println(officer[index].getOfficerId()+" "+officer[index].getOfficerName()+" "+officer[index].getOfficerAge()+" "+officer[index].getOfficerAddress()+" "+officer[index].getOfficerGender()+" "+officer[index].getOfficerPostName()+" "+officer[index].getOfficerAddress());

        }
    }
    public Officer getOfficerBYName(String name){
        Officer officer1= null;
        for (int i = 0; i <this.officer.length ; i++) {
if(officer[i].getOfficerName()==name){
      officer1=officer[i];
    System.out.println("Got officer info");

}

        }


return officer1;

    }
    public Officer getOfficerById(int appId) {
        System.out.println("Search Application by Id");
        Officer app = null;
        for (int i = 0; i < this.officer.length; i++) {
            if (officer[i].getOfficerId() == appId) {
                app = officer[i];
                System.out.println("Officer found");
            }

        }
        return app;
    }
    public boolean updateOfficerNameById(int existingId,String updatedName){
        boolean isOfficerNameUpdated = false;
        for (int i = 0; i < this.officer.length; i++) {
            if (officer[i].getOfficerId() == existingId) {
                officer[i].setOfficerName(updatedName);
                isOfficerNameUpdated = true;
                }
            }
return isOfficerNameUpdated;



        }
        public void deleteOfficerbyName(String name) {


            int index, newIndex;
            for (index = 0, newIndex = 0; index < this.officer.length; index++) {
                if (officer[index].getOfficerName() != name) {
                    officer[newIndex++] = officer[index];
                    System.out.println("Given Officer  is deleted");
                }

            }
            officer = Arrays.copyOf(officer, newIndex);


        }

}

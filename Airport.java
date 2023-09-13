//id name location ,type,noofTerminals
class Airport{

int id;
String name;
String location;
String typeOfAirport;
int noofTerminals;
int noOfAirlines ;
 public Airport(){
	 this(1,"Bengaluru","Kempegouda","International Airport",2,8);
 }
 public Airport(){
	 this(2,"Hubli","Hubli Airport","Domestic airport",2,5);
 }

 
 
   public Airport(int id,String location,String name,String typeOfAirport,int noofTerminals,int noOfAirlines){
   
   this.id = id;
   this.name = name;
   this.location = location;
   this.typeOfAirport = typeOfAirport;
   this.noofTerminals = noofTerminals;
   this.noOfAirlines = noOfAirlines;
   
   
   
   }
public void displayDetails(){
	System.out.println("The id of the Airport is " + id);
	System.out.println("The name of the airport is  " + name);
	System.out.println("The location of this Airport is " + location);
	System.out.println("The airport type is " + typeOfAirport);
	System.out.println("The number of terminals in this airport is " + noofTerminals);
	System.out.println("The number of Airlines available in this airport is " +noOfAirlines);
	System.out.println("----------------------------------------------------");

	
	
}



}
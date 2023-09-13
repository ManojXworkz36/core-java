class Udyanavana{
//flowersname,id,name,location,noOfgates
int id ;
String name;
String flowersname[];
String location;
int noOfGates;
 
 public Udyanavana(int id,String name,String flowersname[],String location,int noOfGates){
 
 this.id = id;
 this.name = name;
 this.flowersname=flowersname;
 this.location=location;
 this.noOfGates=noOfGates;
 
 
 
 
 }
 
 public void displayDetails(){
	 
	 System.out.println("the id of the Udyanavana is "+id);
	 System.out.println("The name of the Udyanavana is "+name);
	 System.out.println("the location of the Udyanavana is " +location);
	 System.out.println("The number of gates present in this Udyanavana is "+noOfGates);
	 getAllFlowers();
	 
 }
 public void getAllFlowers(){
	 
	 for(int index=0;index<.length;index++){
		 
		 System.out.println(flowersname[index]);
	 }
	 
 }
}
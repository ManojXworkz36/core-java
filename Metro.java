class Metro{
 int metroId;
 int noOfComparments;
 String source;
 String destination;
 
 public Metro(){
	 this(1,10,"nagarabhavi","mgroad");

	 System.out.println("Default constructor of metro is invoked");
 }
public Metro(int metroId,int noOfComparments,String source,String destination){
//this();//it is used to communicate one constructor to another constructor to achive constructor chaining
this.metroId = metroId;
this.noOfComparments = noOfComparments;
this.source = source;
this.destination = destination;
}
public void displayDetails(){
System.out.println("the metro id is " + metroId);
System.out.println("the metro noOfComparments are " + noOfComparments);
System.out.println("the metro source is " + source);
System.out.println("the metro destinationis " + destination);



}
/*public static void main(String args[]){

Metro metro = new Metro();

metro.displayDetails();
}*/

}
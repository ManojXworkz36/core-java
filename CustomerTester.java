public class CustomerTester{

public static void main(String args []){

Customer cust = new Customer();
cust.setCustomerId(1);
System.out.println("the id of the customer is " +cust.getCustomerId());
Customer cust1 = new Customer();
cust1.setCustomerName("manoj");
System.out.println("The name of the customer is "+cust1.getCustomerName());
Customer cust2 =  new Customer();
cust2.setAdress("Bengaluru");
System.out.println("The name of the customer is "+cust2.getAdress());
Customer cust3 = new  Customer();
cust3.setContactNo(9620592009L);
System.out.println("The name of the customer is "+cust3.getContactNo());
Customer cust4 = new  Customer();
cust4.setEmail("manoj@gmail.com");
System.out.println("The name of the customer is "+cust4.getEmail());
Customer cust5 =  new Customer();
cust5.setDob("01/08/2001");
System.out.println("The name of the customer is "+cust5.getDob());
Customer cust6 =  new Customer();
cust6.setGender("male");
System.out.println("The name of the customer is "+cust6.getGender());






} 






}
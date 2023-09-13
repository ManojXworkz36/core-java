class Banktester{
public static void main(String args[]){

   Bank bank = new Bank(3,"Bank of Bharath",56789,54365565,67,"v","kalinga",78);
   bank.setBankId(3);
   bank.setBankName("Bank of Bharath");
   bank.setIfsc(56789);
   bank.setMic(54365565);
   bank.setBranchNo(67);
   bank.setLocation("Vij");
   bank.setManagerName("Kalinga");
   bank.setNoOfemployees(78);
   
   System.out.println("the bank id is :" +bank.getBankId());
   System.out.println("the bank name is :" +bank.getBankName());
   System.out.println("the bank ifsc code is :" +bank.getIfsc());
   System.out.println("the bank mic is :" +bank.getMic());
   System.out.println("the bank branch no is :" +bank.getBranchNo());
   System.out.println("the bank location is :" +bank.getLocation());
   System.out.println("the manager name is :" +bank.getManagerName());
   System.out.println("the employees are :" +bank.getNoOfemployees());
   
   





}
}
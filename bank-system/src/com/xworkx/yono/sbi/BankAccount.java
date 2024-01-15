package com.xworkx.yono.sbi;

public class BankAccount {
    private double balance;


    public void debit(int amount){

        if (balance>=amount) {
          //  balance = balance - amount;
           this.balance -= amount;

          //  System.out.println("the remaining balance is "+balance);

        }
    }
    public void credit(int amount ){
      // System.out.println("The amount is creditd " +balance);

      // balance= balance+amount;
        this.balance+=amount;
      System.out.println("The amount is credited " + amount );


    }
   public void transfer(int amount ,BankAccount beneficiaryAccount){
        this.debit(amount);
        beneficiaryAccount.credit(amount);
        System.out.println("The amount is transfered sucessfully " +amount);
    }
    public double getBalance()
    {
        return this.balance;
   }
}


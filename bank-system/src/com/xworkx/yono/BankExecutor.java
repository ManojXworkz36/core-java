package com.xworkx.yono;

import com.xworkx.yono.sbi.BankAccount;
import com.xworkx.yono.sbi.current.CurrentAccount;
import com.xworkx.yono.sbi.savings.SavingAccount;

public class BankExecutor {

    public static void main(String[] args) {

        BankAccount myAccount = new SavingAccount(10000);
        //myAccount.credit(3000);
        myAccount.credit(8000);
        System.out.println("My intial balance is "+myAccount.getBalance());

        SavingAccount mySavingAccount = (SavingAccount)myAccount;
        mySavingAccount.calculateIntrestRate();
        System.out.println("Balance after intrest is "+ mySavingAccount.getBalance());


      /*  BankAccount friendsAccount = new SavingAccount();
        friendsAccount.credit(1000);
        System.out.println("Friend account balance is "+friendsAccount.getBalance());

        myAccount.transfer(2000,friendsAccount);
        System.out.println("My account balance after transfer is " +myAccount.getBalance());
        System.out.println("Friend account balance after transfer is "+friendsAccount.getBalance());

        BankAccount ammaAccount = new CurrentAccount();
        ammaAccount.credit(2000);
        System.out.println("amma's initial balance is "+ammaAccount.getBalance() );

        myAccount.transfer(2000,ammaAccount);
        System.out.println("My balance after transfered to amma is "+myAccount.getBalance());
        System.out.println("amma balance after transfer is "+ammaAccount.getBalance());

        myAccount.credit(5000);
        System.out.println("My current balance is " + myAccount.getBalance());

        BankAccount appajiAccount = new SavingAccount();
        myAccount.transfer(2500,appajiAccount);
        System.out.println("My current balance is "+myAccount.getBalance());
        System.out.println("Appaji's current balance is "+appajiAccount.getBalance());

        BankAccount sisAccount = new SavingAccount();
        myAccount.transfer(500,sisAccount);
        System.out.println("My current balance is "+myAccount.getBalance());
        System.out.println("sis's current balance is "+sisAccount.getBalance());

        BankAccount uncleAccount = new SavingAccount();
        myAccount.transfer(2000,uncleAccount);
        System.out.println("My current balance is "+myAccount.getBalance());
        System.out.println("uncle's current balance is "+uncleAccount.getBalance());

        BankAccount ajjiAccount = new CurrentAccount();
        myAccount.transfer(2000,ajjiAccount);
        System.out.println("My current balance is "+myAccount.getBalance());
        System.out.println("ajji's current balance is "+ajjiAccount.getBalance());

        BankAccount auntAccount = new CurrentAccount();
        myAccount.transfer(2000,auntAccount);
        System.out.println("My current balance is "+myAccount.getBalance());
        System.out.println("aunt's current balance is "+auntAccount.getBalance());

        myAccount.credit(10000);
        System.out.println("My current balance is "+myAccount.getBalance());

        BankAccount grandFatherAccount = new SavingAccount();
        myAccount.transfer(2000,grandFatherAccount);
        System.out.println("My current balanc is "+myAccount.getBalance());
        System.out.println("grandfather's current balance is "+grandFatherAccount.getBalance());

        BankAccount bigdaddyAccount = new SavingAccount();
        myAccount.transfer(2000,bigdaddyAccount);
        System.out.println("My current balanc is "+myAccount.getBalance());
        System.out.println("bigg daddy's current balance is "+bigdaddyAccount.getBalance());*/

    }
}

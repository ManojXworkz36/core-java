package com.xworkx.yono.sbi.savings;

import com.xworkx.yono.sbi.BankAccount;

public class SavingAccount extends BankAccount {

    double intrestRate = 4.5;

    public SavingAccount(){


    }
    public SavingAccount(double minBalance){

        this.credit((int)minBalance);

    }
    public void calculateIntrestRate(){
        double intrestAmount = (intrestRate*getBalance()/100);
        this.credit((int)intrestAmount);
    }
}

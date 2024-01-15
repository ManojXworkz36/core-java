package com.xworkz.shopapp.fruits;

public class ElectronicShop implements Shop{

    @Override
    public void doBusiness() {
        System.out.println("Business will be done by selling Electronic Devices");
    }
}

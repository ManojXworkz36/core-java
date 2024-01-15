package com.xworkz.shopapp.fruits;

public class FruitsShop implements Shop{
// this class is called implementation class
    @Override
    public void doBusiness() {
        System.out.println("Business will run by selling fruits");
    }
}

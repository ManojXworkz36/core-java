package com.xworkz.shopapp;

import com.xworkz.shopapp.fruits.*;

public class ShopExecutor {
    public static void main(String[] args) {
        Shop shop = new FruitsShop();
        shop.doBusiness();

        Shop teashop = new TeaShop();
        teashop.doBusiness();

        Shop eShop = new ElectronicShop();
        eShop.doBusiness();

        Shop cShop = new Cafeteria();
        cShop.doBusiness();

        Shop chatShop = new ChatShop();
        chatShop.doBusiness();

        Shop pShop = new PharmaceuticalShop();
        pShop.doBusiness();

    }
}

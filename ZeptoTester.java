class ZeptoTester{
public static void main(String args[]){
int price = Zepto.get("chicken");
System.out.println("the price of food is " + price );
price = Zepto.get("mutton");
System.out.println("the price of is " + price );
price = Zepto.get("fish");
System.out.println("the price of food is " + price );
price = Zepto.get("kabab");
System.out.println("the price of is " + price );
int pricewithquantity = Zepto.get("chicken",3);
System.out.println("the price of food is " + pricewithquantity );
pricewithquantity = Zepto.get("mutton",3);
System.out.println("the price of is " + pricewithquantity );
pricewithquantity = Zepto.get("fish",3);
System.out.println("the price of food is " + pricewithquantity );
pricewithquantity = Zepto.get("kabab",3);
System.out.println("the price of is " + pricewithquantity );


}



}
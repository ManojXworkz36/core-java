class ZeptooTester{
public static void main(String args[]){
	int price =0;
	int pricewithquantity=0;
	
 price = Zeptoo.get("chicken");
System.out.println("the price of food is " + price );
price = Zeptoo.get("mutton");
System.out.println("the price of food is " + price );
 pricewithquantity=Zeptoo.get("chicken",3);
System.out.println("the price of food is " + pricewithquantity );
 pricewithquantity=Zeptoo.get("mutton",3);
System.out.println("the price of food is " + pricewithquantity );
}}
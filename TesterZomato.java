class TesterZomato{
public static void main(String argfs []){
	double price=0.0;
	double pricewithquantity=0.0;

 price=Zomato.search("pizza");
System.out.println("the price of  pizza is  " +price);


price=Zomato.search("veg Biryani");
System.out.println("the price of veg biryani " + price);


price=Zomato.search("gobi");
System.out.println("the price of gobi is  " + price);
price =Zomato.search("dose");
System.out.println("the price of dose is  " + price);
price=Zomato.search("idli");
System.out.println("the price of idli is " + price);
price=Zomato.search("vada");
System.out.println("the price of vada is " + price);
price=Zomato.search("palav");
System.out.println("the price of palav is " + price);
price=Zomato.search("vangibath");
System.out.println("the price of vangibath is " + price);
price=Zomato.search("paddu");
System.out.println("the price of paddu is " + price);
pricewithquantity=Zomato.search("gobi",4);
System.out.println("the price of gobi with quantity is " + pricewithquantity);
}

}
class SuperMarket{

  static String chocolates[] ={"cadburry" , "perk" , "eclairs" ,"dairymilk","snickers","kacchamango","pulse","silk","amul","nestle","mars","milkybar","fuse","banana","kopiko","pan"};
  static String perfumes[] = {"fogg","yardley","denver","layershot","something something","set wet","davidoff","hugo","burberry","axe","spinz","vevlvet noir", "ocean mist","golden amber"};
  static String soaps[] = {"lux","cinthol","lifeboy","santoor","medimix","mysore sandal","yardley","dove","raktachadana","gramflour","pears","charcoal","chandrika","dettol","himalaya"};
  static String snacks [] = {"potato chips","popcorn","pretzels","candy bars","nuts","trail mix","granola bars","crackers","cheese puffs","fruit snacks","cookies","jerky","rice cakes","veggie chips","chocolate covered pretzels"};
  static String vegetables [] = {"carrots","broccoli","tomatoes","lettuce","bell peppers","spinach","cucumbers","onions","cauliflowers","zucchini","potatoes","green beans","eggplants","mushrooms","corn"};
  static String fruits [] = {"apples","bananas","grapes","strawberry", "blueberries","watermelons","pineapples","peaches","pears","kiwis","mangoes","lemons","limes","raspberries"};
  static String iceCreams [] = {"vanila","chocolate","strawberry","mint chip","cookies and cream","rockey road","butter pecan","coffee","neapolitan","cookie dough","pista","rainbow sherbet","chocolate chip","french vanila","fudge swirl"};
  static String softDrinks[] = {"coco cola","pepsi","sprite","mountain dew","dr pepper","7up","fanta","root beer","ginger ale","club soda","tonic water","cream soda","orange crush","grape soda","lemon lime"};
	  


public static void main (String[]args){
  
  getChocolates();
  getReverseChocolates();
  getPerfumes();
  getReversePerfumes();
 getSoap();
 getReverseSoap();
  getSnacks();
  getReverseSnacks();
  getVegetables();
  getReverseVegetables();
  getFruits();
  getReverseFruits();
  getIcecreams();
  getReverseIcecreams();
  getSoftdrinks();
  getReverseSoftdrinks();

}




public static void getChocolates(){
System.out.println("get chocolates in give order ");
for (int index=0;index<chocolates.length;index++){
System.out.println(chocolates[index]);

}
}
public static void getReverseChocolates(){

System.out.println("get choclates in the reversed order ---------");
for (int i=chocolates.length-1;i>=0;i--){
	System.out.println(chocolates[i]);
}
}


public static void  getPerfumes(){
	
	System.out.println("get perfumes in given order -----------");
	for(int index=0;index<perfumes.length;index++){
		
		System.out.println(perfumes[index]);
	}
}
	public static void getReversePerfumes(){
	System.out.println("get perfumes in reverse order -----------");
	for(int index=perfumes.length-1;index>=0;index--){
		
		System.out.println(perfumes[index]);
	
}
}
public static void  getSoap(){
	
	System.out.println("get soap in given order -----------");
	for(int index=0;index<soaps.length;index++){
		
		System.out.println(soaps[index]);
	}
}
	public static void getReverseSoap(){
	System.out.println("get soaps in reverse order  -----------");
	for(int index=soaps.length-1;index>=0;index--){
		
		System.out.println(soaps[index]);
	}
}

	public static void  getSnacks(){
	
	System.out.println("get snacks in given order -----------");
	for(int index=0;index<snacks.length;index++){
		System.out.println(snacks[index]);
	}
	}
	public static void getReverseSnacks(){
	System.out.println("get snacks in reverse order -----------");
	for(int index=snacks.length-1;index>=0;index--){
		System.out.println(snacks[index]);
	}
	}
	
	
	
public static void  getVegetables(){
	
	System.out.println("get vegetables in given order -----------");
	for(int index=0;index<vegetables.length;index++){
		
		System.out.println(vegetables[index]);
	}
}
public static void getReverseVegetables(){
System.out.println("get vegetables in reverse order -----------");
	for(int index=vegetables.length-1;index>=0;index--){
		
		System.out.println(vegetables[index]);
	}
}
	public static void  getFruits(){
	System.out.println("get fruits in given order -----------");
	for(int index=0;index<fruits.length;index++){
		System.out.println(fruits[index]);
	}
	}
	public static void getReverseFruits(){
System.out.println("get fruits in reverse order -----------");
for(int index=fruits.length-1;index>=0;index--){
System.out.println(fruits[index]);
	}
	}
	
	public static void  getIcecreams(){
	System.out.println("get iceCreams in given order -----------");
	for(int index=0;index<iceCreams.length;index++){
		System.out.println(iceCreams[index]);
	}
	}
	public static void getReverseIcecreams(){
	System.out.println("get perfumes in reverse order -----------");
	for(int index=iceCreams.length-1;index>=0;index--){
		System.out.println(iceCreams[index]);
	}
	}
	
	public static void  getSoftdrinks(){
	System.out.println("get softDrinks in given order -----------");
	for(int index=0;index<softDrinks.length;index++){
	System.out.println(softDrinks[index]);
	}
	}
	public static void getReverseSoftdrinks(){
	
	System.out.println("get softDrinks in reverse order -----------");
	for(int index=softDrinks.length-1;index>=0;index--){
	System.out.println(softDrinks[index]);
	}
	}
}

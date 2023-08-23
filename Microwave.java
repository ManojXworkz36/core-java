class Microwave{

 static boolean isConnected;
 static  int maxTemperature = 10;
 static  int minTemperature  ;
 static int  currentTemperature;


public static boolean onOrOff(){
if(isConnected==false){
isConnected=true;
System.out.println("the Microwave is turned on");
}
else if (isConnected==true){

isConnected=false;
System.out.println("the Microwave is turned of");
}



return isConnected;

}
public static int increaseTemp(){
if (isConnected==true){
if(currentTemperature<maxTemperature){
currentTemperature=currentTemperature+1;
System.out.println("the current Temperature is  " + currentTemperature);
}
else{

System.out.println("the Microwave has reached maximum temperature");
}}
else{
System.out.println(" first turn on the Microwave");

}
return  currentTemperature;
}


public static int decreaseTemp(){
if (isConnected==true){
if(currentTemperature>minTemperature){
currentTemperature=currentTemperature-1;
System.out.println("the current Temperature is  " + currentTemperature);
}
else{

System.out.println("the Microwave has reached minimum temperature");
}}
else{
System.out.println(" first turn on the Microwave");

}
return minTemperature;
}

}
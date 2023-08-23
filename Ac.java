class Ac{
 static boolean isConnected;
 static  int maxTemperature = 32;
 static  int minTemperature = 16;
 static int  currentTemperature;


public static boolean onOrOff(){
if(isConnected==false){
isConnected=true;
System.out.println("the Ac is turned on");
}
else if (isConnected==true){

isConnected=false;
System.out.println("the ac is turned of");
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

System.out.println("the Ac has reached maximum temperature");
}}
else{
System.out.println(" first turn on the Ac");

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

System.out.println("the Ac has reached minimum temperature");
}}
else{
System.out.println(" first turn on the Ac");

}
return minTemperature;
}


}
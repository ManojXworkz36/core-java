class Tv{
static boolean isConnected ;
static int currentvol;
static  int maxVol=100;
static int minVol;
public static boolean TurnOnOrOff(){
if(isConnected==false){
isConnected=true;
System.out.println("The tv is now turned on");


}
else if (isConnected==true){
isConnected=false;
System.out.println("the tv is now turned off");


}

return isConnected;
}

public static void volumeUp(){
if(isConnected==true){
if (currentvol<maxVol){
	currentvol=currentvol+1;
System.out.println("the current volume of tv is  " + currentvol);

}
else {
System.out.println("the current volume has reached max volume");

}}
else{
System.out.println("first turn on the Tv");

}





}
public static void volumeDown(){
if(isConnected==true){
if (currentvol>minVol){
	currentvol=currentvol-1;
System.out.println("the current volume of tv is  " + currentvol);

}
else {
System.out.println("the current volume has reached min volume");

}}
else{
System.out.println("first turn on the Tv");

}

}
}
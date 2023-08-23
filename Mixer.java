class Mixer{
static boolean isConnected ;
static int currentSpeed;
static  int maxSpeed=5;
static int minSpeed;
public static boolean TurnOnOrOff(){
if(isConnected==false){
isConnected=true;
System.out.println("The mixer is now turned on");


}
else if (isConnected==true){
isConnected=false;
System.out.println("the mixer is now turned off");


}

return isConnected;
}

public static void speedUp(){
if(isConnected==true){
if (currentSpeed<maxSpeed){
	currentSpeed=currentSpeed+1;
System.out.println("the current speed of mixer is  " + currentSpeed);

}
else {
System.out.println("the current speed has reached max speed");

}}
else{
System.out.println("first turn on the mixer");

}





}
public static void speedDown(){
if(isConnected==true){
if (currentSpeed>minSpeed){
	currentSpeed=currentSpeed-1;
System.out.println("the current speed of mixer is  " + currentSpeed);

}
else {
System.out.println("the current speed has reached min speed");

}}
else{
System.out.println("first turn on the mixer");

}

}





}
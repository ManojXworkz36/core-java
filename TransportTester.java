class TransportTester{

public static void main(String args[]){

Transport transport=new Transport(1,"Railway Transport","Fastest mode","Mobilise goods and people",500);

transport.getTransportDetails();

System.out.println("___________________________________________________________");

Transport transport1=new Transport(1,"Air Transport","Fastest mode","Mobilise goods and people",5000);

transport1.getTransportDetails();

Transport transport2=new Transport(1,"bus","Slowest mode","Mobilise goods and people",700);

transport2.getTransportDetails();

System.out.println("___________________________________________________________");

Transport transport3=new Transport(1,"Water Transport","Slowest mode","Mobilise goods and people",2500);

transport3.getTransportDetails();

System.out.println("___________________________________________________________");


Transport transport4=new Transport(1,"road Transport ","Fastest mode","Mobilise goods and people",500);

transport4.getTransportDetails();

System.out.println("___________________________________________________________");



}


}
//transport id ,type,avilability,functiontype,costoftransport
  
  
  class Transport{
	  int transportId;
	  String type;
	  String transportMode;
	  String functiontype;
	  int costoftransport;
	  
	  public Transport(int transportId,String type,String transportMode,String functiontype,int costoftransport){
		  this.transportId = transportId;
		  this.type = type;
		  this.transportMode = transportMode;
		  this.functiontype = functiontype;
		  this.costoftransport = costoftransport;
		  
		  
		  
	  }
	  
	  public void getTransportDetails(){
		  System.out.println("The id of the Transport is " +transportId);
		  System.out.println("The type of transport is "+type);
		  System.out.println("the Transport mode is  " + transportMode);
		  System.out.println("The function type of this Transport is " + functiontype);
		  System.out.println("The cost of this Transport is "+ costoftransport);
		  
		  
		  
		  
		  
	  }
	  
	  
	  
  }
class OttPlatform{

String movieNames[]= new String [4];
int index;

public boolean addMovieName(String movieName){        //create / add / save
	System.out.println("Inside addMovieName()");
  boolean isAdded = false;
if(movieName != null){
	
	System.out.println("validation is proper..proceed to add movie");
	movieNames[index] = movieName;
	index++;
	isAdded = true;
	System.out.println(movieName +  " is added sucessfully  ");
	
	
}
return isAdded;

}

public void getMovieNames(){
	for(int index=0;index<movieNames.length;index++){
		
		System.out.println(movieNames[index]);
	}
}


}
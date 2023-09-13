class Spotify{

String songNames[] = new String[11];
int index;
public boolean addSongName(String songName){
	boolean isSongAdded = false;
	if(songName!=null){
		
		songNames[index] = songName;
		index++;
		isSongAdded = true;
	}
	
	
	return isSongAdded;
}

public void getSongNames(){
	
	for(int index=0;index<songNames.length;index++){
		
		System.out.println(songNames[index]);
	}
	
}





}
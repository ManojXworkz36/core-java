class Interior{

String materialNames[] = new String[10];
int index;
public boolean addMaterialName(String materialName){
	boolean isMaterialAdded = false;
	if(materialName!=null){
		
		materialNames[index] = materialName;
		index++;
		isMaterialAdded = true;
	}
	
	
	return isMaterialAdded;
}

public void getMaterialNames(){
	
	for(int index=0;index<materialNames.length;index++){
		
		System.out.println(materialNames[index]);
	}
	
}






}
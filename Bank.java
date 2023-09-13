class Bank{
private int bankId;
private String bankName;
private int ifsc;
private int mic;
private int branchNo;
private String location;
private String managerName;
private int noOfemployees;
public Bank(int bankId,String bankName,int ifsc,int mic,int branchNo,String location,String managerName,int noOfemployees){
	
	
}

public void setBankId(int bankId){
	this.bankId = bankId;
}
public int getBankId(){
 return bankId;
 }
public void setBankName(String bankName){
	this.bankName = bankName;
}
public String getBankName(){
	return bankName;
}
public void setIfsc(int ifsc){
	this.ifsc = ifsc;
}
public int getIfsc(){
	return ifsc;
}
public void setMic(int mic){
	this.mic = mic;
}
public int getMic(){
	return mic;
}
public void setBranchNo(int branchNo){
	this.branchNo = branchNo;
}
public int getBranchNo(){
	return branchNo;
}
public void setLocation(String location){
	this.location = location;
}
public String getLocation(){
	return location;
}
public void setManagerName(String managerName){
	this.managerName = managerName;
}
public String getManagerName(){
	return managerName;
}
public void setNoOfemployees(int noOfemployees){
	this.noOfemployees = noOfemployees;
}
public int getNoOfemployees(){
	return noOfemployees;
}
}
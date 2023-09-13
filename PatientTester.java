public class PatientTester{

public static void main(String args[]){

Patient pat = new Patient();
pat.setPatientId(1);
System.out.println("The id of the patient is " + pat.getPatientId());


 Patient pat1 = new Patient();
 pat1.setPatientName("Siddesh");
 System.out.println("The name of the patient is "+pat1.getPatientName());
 
 Patient pat2 = new Patient();
 pat2.setPatientAge(23);
 System.out.println("The age of the patient is "+pat2.getPatientAge());
 
Patient pat3 = new Patient();
 pat3.setDiseaseName("Fever");
 System.out.println("The Patient is suffering from "+pat3.getDiseaseName());

Patient pat4 = new Patient();
 pat4.setWardNo(301);
 System.out.println("The Patient is present in the ward Number "+pat4.getWardNo());

Patient pat5 = new Patient();
 pat5.setAdmittedDate("06/09/2023");
 System.out.println("The Patient is admitted on "+pat5.getAdmittedDate());
 
 Patient pat6 = new Patient();
 pat6.setHospitalName("Sanjeeivini Hospital");
 System.out.println("The name of the Hospital is  "+pat6.getHospitalName());


 Patient pat7 = new Patient();
 pat7.setPatientAdress("Hosdurga");
 System.out.println("The Patient is from  "+pat7.getPatientAdress());
 
 Patient pat8 = new Patient();
 pat8.setPatientGender("Male");
 System.out.println("The Patient is   "+pat8.getPatientGender());
 
 Patient pat9 = new Patient();
 pat9.setConsultantDoctor("Manjunath");
 System.out.println("The Patient is consulatetd by   "+pat9.getConsultantDoctor());
 
}














}
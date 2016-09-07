package datamanagement;

public interface IStudent {  //interface created

	public Integer getID();
	//method to get student id with method getID

	public String getFirstName();
	//method to get first name of the student with method getFirstName 

	public void setFirstName(String firstName);
	//method to set the first name of the student with setFirstName method
	//with strig argument FirstName

	public String getLastName();
	//method to get last name of the student with method have no arguments

	public void setLastName(String lastName);
	//method to set last name of the student
	//wih lastName argument of string type

	public void addUnitRecord(IStudentUnitRecord record);
	//method to add units according to the student's unit records

	public IStudentUnitRecord getUnitRecord(String unitCode);
	//method to call IStudentUnitRecord class to get unit record

	public StudentUnitRecordList getUnitRecords();
      // list of available students in each unit
}

package datamanagement;

public interface IStudentUnitRecord { 
	// an interface class for students unit record

	public Integer getStudentID();
	//method to get student id

	public String getUnitCode();
	//method to get code of subject

	public void setAsg1(float mark);
	//set marks of assignment1 

	public float getAsg1();
	//get method to get marks of assignment 2

	public void setAsg2(float mark);
	//set marks of assignment1 

	public float getAsg2();
	//get method to get marks of assignment 2

	public void setExam(float mark);
	//set marks in the exam

	public float getExam();
	//get exam marks

	public float getTotal();
	//calculate total marks of student
}

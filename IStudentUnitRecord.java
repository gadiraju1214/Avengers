package datamanagement;

public interface IStudentUnitRecord { 
	// an interface class for students unit record

	public Integer getStudentID();
	//method to get student id with StudenID() method

	public String getUnitCode();
	//method to get code of subject with getunitcode()method with arguemnts

	public void setAsg1(float mark);
	//set marks of assignment1 with method setAsg1 with argument mark

	public float getAsg1();
	//get method to get marks of assignment 2

	public void setAsg2(float mark);
	//set marks of assignment1 with setAsg2 method have argumet of markd of type float

	public float getAsg2();
	//get method to get marks of assignment 2

	public void setExam(float mark);
	//set marks in the exam with set exam method have argument of marks 

	public float getExam();
	//get exam marks with getExam method

	public float getTotal();
	//calculate total marks of student with getTotal method
}

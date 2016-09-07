package datamanagement;

public interface IUnit {
	// interface class of units of the students
	
	//methods of interface to get and set unit and grade information
	public String getUnitCode();
	// to get unit code eg

	public String getUnitName();
	//to get unit name eg;ITC

	public float getPsCutoff();
	//student get pass grade in the subject

	public void setPsCutoff1(float cutoff);
	//to set, student pass grade in the subject

	//cutoff methods to limit the high distinction,credit,pass,fail
	public float getCrCutoff();
	//get method for credit marks

	public void setCrCutoff(float cutoff);

	public float getDiCuttoff();
	//get method for distinction marks
	public void setDiCutoff(float cutoff);
	
	public float getHdCutoff();
	//get method for figh distinction marks

	public void setHdCutoff(float cutoff);

	public float getAeCutoff();
	// get method for Ae 

	public void setAeCutoff(float cutoff);

	public int getAsg1Weight();
	//get range assignment 1 marks ie:0  to 1000

	public int getAsg2Weight();
	//get range of assignment 2 marks ie: 0 to 100

	public int getExamWeight();
	//get range of exam marks ie:0 to 100

	public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt);
	//set total assessments marks according to asg1,asg2,exam
	

	public String getGrade(float asg1, float asg2, float exam);
	//  grades method have argument of as1,asg2,exam

	public void addStudentRecord(IStudentUnitRecord record);
	//add student record with mthod addStudentRecord have argument as record of units

	public IStudentUnitRecord getStudentRecord(int studentID);
	//add units record with getStudentRecord method have studentID as argument

	public StudentUnitRecordList listStudentRecords();
	// add number of students
}

package datamanagement;

public interface IUnit {
	// interface class of units of the students
	
	//methods of interface to get and set unit and grade information
	public String getUnitCode();
	// to get unit code eg;556

	public String getUnitName();
	//to get unit name eg;ITC

	public float getPsCutoff();
	//student get pass grade in the subject

	public void setPsCutoff1(float cutoff);
	//to set, student pass grade in the subject

	//cutoff methods to limit the high distinction,credit,pass,fail
	public float getCrCutoff();

	public void setCrCutoff(float cutoff);

	public float getDiCuttoff();

	public void setDiCutoff(float cutoff);
	
	public float getHdCutoff();

	public void setHdCutoff(float cutoff);

	public float getAeCutoff();

	public void setAeCutoff(float cutoff);

	public int getAsg1Weight();
	//get range assignment 1 marks ie:0  to 1000

	public int getAsg2Weight();
	//get range of assignment 2 marks ie: 0 to 100

	public int getExamWeight();
	//get range of exam marks ie:0 to 100

	public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt);
	//set assessment weight that should not be less than 0 and more than 100
	

	public String getGrade(float asg1, float asg2, float exam);
	// get grades according to marks ie: fails,pass etc

	public void addStudentRecord(IStudentUnitRecord record);
	//add student record

	public IStudentUnitRecord getStudentRecord(int studentID);
	//add units record

	public StudentUnitRecordList listStudentRecords();
	// add number of students
}

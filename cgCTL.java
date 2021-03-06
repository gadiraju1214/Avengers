package datamanagement;

public class cgCTL {

	cgUI CGUI;
	//variable of class type cgUI
	String cuc = null;
	Integer currentStudentID = null;
	boolean changed = false;

	public cgCTL() {
	}

	public void execute() {
		CGUI = new cgUI(this);
		CGUI.setState1(false);

		CGUI.setState2(false);
		CGUI.setState3(false);
		CGUI.setState4(false);
		CGUI.setState5(false);
		CGUI.setState6(false);
		CGUI.Refresh3();
		//different states of CGUI at selection

		ListUnitsCTL luCTL = new ListUnitsCTL();
		luCTL.listUnits(CGUI); // list of units 
		CGUI.setVisible(true);
		CGUI.setState1(true);
	}

	public void unitSelected(String code) {
		//unit selected according to the selected code of the unit
		if (code.equals("NONE"))
			CGUI.setState2(false);
		else {
			ListStudentsCTL lsCTL = new ListStudentsCTL();
			lsCTL.listStudents(CGUI, code);
			cuc = code;
			CGUI.setState2(true);
		}
		CGUI.setState3(false);
	}

	public void studentSelected(Integer id) {
		//select studet according to stuednt id
		currentStudentID = id;
		if (currentStudentID.intValue() == 0) {
			CGUI.Refresh3();
			CGUI.setState3(false);
			CGUI.setState4(false);
			CGUI.setState5(false);
			CGUI.setState6(false);
		}

		else {
			IStudent s = StudentManager.get().getStudent(id);

			IStudentUnitRecord r = s.getUnitRecord(cuc);
			CGUI.setRecord(r);
			CGUI.setState3(true);
			CGUI.setState4(true);
			CGUI.setState5(false);
			CGUI.setState6(false);
			changed = false;

		}
	}

	public String checkGrade(float f, float g, float h) {
		//get grades according to the marks
		IUnit u = UnitManager.UM().getUnit(cuc);
		String s = u.getGrade(f, g, h);
		CGUI.setState4(true);
		CGUI.setState5(false);
		if (changed) {
			CGUI.setState6(true);
		}
		return s;
	}

	public void enableChangeMarks() {
		//enable to change marks according to the selected unit and student
		CGUI.setState4(false);
		CGUI.setState6(false);
		CGUI.setState5(true);
		changed = true;
	}

	public void saveGrade(float asg1, float asg2, float exam) {
		//method to save grades according to unit and student selected
		//asg1,asg2,exam passed as argument
		IUnit u = UnitManager.UM().getUnit(cuc);
		IStudent s = StudentManager.get().getStudent(currentStudentID);

		IStudentUnitRecord r = s.getUnitRecord(cuc);
		r.setAsg1(asg1);
		r.setAsg2(asg2);
		r.setExam(exam);
		//setting the marks of asg1,asg2,and exam
		StudentUnitRecordManager.instance().saveRecord(r);
		CGUI.setState4(true);
		CGUI.setState5(false);
		CGUI.setState6(false);
	}
}

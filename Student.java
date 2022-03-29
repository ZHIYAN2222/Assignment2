package assignment2;

public class Student {
	
	private int stuId;
	private String name;
	private String department;
	private int scienceMark;
	private int mathMark;
	
	//Accessor and Mutator
	public int getStuId() {
		return stuId;
	}
	
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getScienceMark() {
		return scienceMark;
	}
	
	public void setScienceMark(int scienceMark) {
		this.scienceMark = scienceMark;
	}
	
	public int getMathMark() {
		return mathMark;
	}
	
	public void setMathMark(int mathMark) {
		this.mathMark = mathMark;
	}

}

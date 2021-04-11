package week5;

public class classList {
	private int semester;
	private int year;
	private Subject sub;
	private Student s1;
	private Student s2;
	public classList(int semester, int year, Subject sub, Student s1, Student s2) {
		super();
		this.semester = semester;
		this.year = year;
		this.sub = sub;
		this.s1 = s1;
		this.s2 = s2;
	}
	public classList() {
		super();
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public Student getS1() {
		return s1;
	}
	public void setS1(Student s1) {
		this.s1 = s1;
	}
	public Student getS2() {
		return s2;
	}
	public void setS2(Student s2) {
		this.s2 = s2;
	}
	
	
	public String toString() {
		String info="";
		info=this.year+"学年\t"+this.semester+"学期\n";
		info+=this.sub.toString()+"\n";
		info+="学号\t姓名\n";
		info+="=======================\n";
		info+=this.s1.toString()+"\n";
		info+=this.s2.toString();
		return info;
	}
	
	
}

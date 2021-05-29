package week12;

public class Course {
	private String id;
	private String courseName;
	private float courseGrade;
	public Course() {
		super();
	}
	public Course(String id, String courseName, float courseGrade) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseGrade = courseGrade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public float getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(float courseGrade) {
		this.courseGrade = courseGrade;
	}
	@Override
	public String toString() {
		return "";
	}
	
}

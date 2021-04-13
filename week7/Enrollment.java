package week7;

import java.util.Arrays;

public class Enrollment {
	private Student[] list;
	private Subject subject;
	private int count;
	
	public Enrollment() {
		super();
	}

	public Enrollment(Subject subject) {
		super();
		this.subject = subject;
		list = new Student[subject.getMaxNum()];
		count = 0;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getCount() {
		return count;
	}

	public boolean addStudent(Student student){
		if(student == null)
			return false;
		if(count >= list.length)
			return false;
		
		for (int i = 0; i < count; i++) {
			if (student.getId() == list[i].getId()) {
				System.out.println("学号已存在，请勿重复选课！");
				return false;
			}
		}
				
		list[count] = student;
		count++;
		return true;
	}

	public boolean withDraw(int id, String name) {
		for (int i = 0; i < count; i++) {
			
			
			if (list[i].getId() == id && list[i].getName().equals(name)) {
				list[i] = null;
				count--;

				if (i == count) 
					return true;// last one
				
				for (; i < count; i++)
					list[i] = list[i+1];
				
				list[i++] = null;
				return true;
			}
			
			
		}
		System.out.println("没有找到");
		return false;
	}
	
	@Override
	public String toString() {
		String info = "";
		info += subject+"\n";
		for(int i = 0;i<count;i++) {
			info += list[i]+"\n";
		}
		info += "学生人数："+count;
		return info;
	}
	
}

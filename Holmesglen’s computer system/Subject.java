package week5work3;

public class Subject {
	private String name;
	private String id;
	public Subject(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Subject() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		String info="";
		info= "ѧ�ƴ���:"+this.id+"\t"+"ѧ������:"+this.name;
		return info;
	}
	
}

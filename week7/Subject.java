package week7;

public class Subject {
	private String subId;
	private String sujName;
	private int maxNum;
	public Subject() {
		super();
	}
	public Subject(String subId, String sujName, int maxNum) {
		super();
		this.subId = subId;
		this.sujName = sujName;
		this.maxNum = maxNum;
	}
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getSujName() {
		return sujName;
	}
	public void setSujName(String sujName) {
		this.sujName = sujName;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	@Override
	public String toString() {
		return "课程号：" + subId + ", 课程名：" + sujName + ", 最大人数：" + maxNum;
	}
	
	
}

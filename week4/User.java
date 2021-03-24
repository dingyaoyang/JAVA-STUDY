package week4;

public class User {

	private String userName;
	private int key;
	private int userNum = 2;
	
	public User(){
		
	}
	
	public User(String userName) {
		this.userName = userName;
	}
	public User(String userName, int key) {
		this.userName = userName ;
		this.key = key;
		
	}
	
	public int getKey() {
		return key;
	}
	public void setkey(int key) {
		this.key = key;
	}
	
	@Override
	public String toString() {
		return ("用户[userName:"+userName+" key:"+key+"] usernum:"+userNum);
	}
	
}

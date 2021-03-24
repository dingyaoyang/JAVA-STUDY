package week4;

public class dogDriver {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//名字，年龄，颜色；
		dog dog1 = new dog("旺财",5,"black");
		dog dog2 = new dog();
		
		
		dog2.setName("财旺");
		dog2.setAge(4);
		dog2.setColor("white");
		
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
	}

}

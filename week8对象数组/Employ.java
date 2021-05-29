package week8对象数组;

public	class Employ {   //雇员类
		 private String id;  //编号
		 private String name; //姓名
		 private int age;     //年龄
		 private String vocation; //职务
		 public Employ(){} //构造方法一
		 public Employ(String id,String name,int age,String vocation){
		  set(id,name,age,vocation);
		 }
		 //设置属性的方法
		 public void set(String id,String name,int age,String vocation){
		  this.id=id;
		  this.name=name;
		  this.age=age;
		  this.vocation=vocation;
		 }
		 public String toString() {
		  String mess=id+","+name+","+age+","+vocation;
		  return mess;
		 }
}

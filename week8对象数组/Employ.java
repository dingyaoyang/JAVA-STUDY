package week8��������;

public	class Employ {   //��Ա��
		 private String id;  //���
		 private String name; //����
		 private int age;     //����
		 private String vocation; //ְ��
		 public Employ(){} //���췽��һ
		 public Employ(String id,String name,int age,String vocation){
		  set(id,name,age,vocation);
		 }
		 //�������Եķ���
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

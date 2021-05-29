package week8对象数组;

import week8对象数组.Employ;

public class Example11 {
	public static void main(String[] args) {
		  //先创建3个雇员对象
		  Employ employee1=new Employ("0001","张文军",50,"总经理");
		  Employ employee2=new Employ("0005","李琦",45,"副经理");
		  Employ employee3=new Employ("1016","张丽",28,"秘书");
		  //声明对象数组并直接初始化
		  Employ 雇员1[]={employee1,employee2,employee3};
		  output(雇员1);//输出雇员信息
		  System.out.println("------------------");//分割线
		  //声明对象数组并直接初始化，初始化元素直接调用
		  //构造方法创建对象
		  Employ 雇员2[]={new Employ("0001","张文军",50,"总经理"),
		  new Employ("0005","李琦",45,"副经理"),
		  new Employ("1016","张丽",28,"秘书")};
		  output(雇员2);
		 }
		 //定义方法用于输出雇员信息，注意方法是private,static
		 private static void output(Employ 雇员[]){
		  for(Employ employee:雇员)
		   System.out.println(employee.toString());
		 }
}

package week1;

import java.util.Scanner;

public class 自动售货机 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//定义变量
		float money;
		int dollar2;
		int dollar1;
		int cent50;
		int cent20;
		int cent10;
		int cent5;
		float t;//小数部分
		//变量赋值
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please inout total money:");
		money = scan.nextFloat() ;
		
		//运算处理
		dollar2 = (int)money/2;
		dollar1 = (int)money%2;
		t       = money%1;
		cent50  = (int)(t/0.50);
		cent20  = (int)((t-0.5*cent50)/0.2);
		cent10  = (int)((t-0.5*cent50-0.2*cent20)/0.1);
		cent5   = (int)((t-0.5*cent50-0.2*cent20-0.1*cent10)/0.05);

		//输出结果
		System.out.println("共需要：");
		if(dollar2 != 0)
		System.out.println(dollar2+"个2美元");
		if(dollar1 != 0)
		System.out.println(dollar1+"个1美元");
		if(cent50 != 0)
		System.out.println(cent50+"个50美分");
		if(cent20 != 0)
		System.out.println(cent20+"个20美分");
		if(cent10 != 0)
		System.out.println(cent10+"个10美分");
		if(cent5 != 0 )
		System.out.println(cent5+"个5美分");
		
	}

}

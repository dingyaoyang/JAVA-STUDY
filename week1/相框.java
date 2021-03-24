package week1;

import java.util.Scanner;

public class 相框 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//定义变量
		float regular,fancy;
		float length,width;
		float cardboardPaper,glass;
		float colorch;
		float crowns;
		float total;
		String color;
		String type;
		int crownsNum;
		
		colorch        = 0.10f;
		regular        = 0.15f;
		fancy          = 0.25f;
		cardboardPaper = 0.02f;
		glass          = 0.07f;
		crowns         = 0.35f;
		
		//输入数据
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input your pictures' length and width:");
		length = scan.nextFloat();
		width  = scan.nextFloat();
		System.out.println("Please input your pictures' type:(regular or fancy)");
		type   = scan.next();
		System.out.println("Please input your pictures' color:(white or red or blue or black or other)");
		color  = scan.next();
		System.out.println("Please input crowms number:(0-4)");
		crownsNum = scan.nextInt();
		
		//数据处理
		if(type.equals("regular"))
				fancy = 0;
			else regular = 0;
		if(color.equals("white"))
			colorch = 0;
		
		total = (length+width)*(colorch+regular+fancy)+length*width*(cardboardPaper+glass)+crowns*crownsNum;
		
		//输出
		System.out.println("此相框总价格为："+total);
	}
}

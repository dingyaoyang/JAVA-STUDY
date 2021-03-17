package week3;

import java.util.Scanner;

public class 数一数二 {

	public static int firstNum,secondNum;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int choose = menu();
		
		while(choose!=6) {
			switch(choose) {
			case 1:input();break;
			case 2:oddNum();break;
			case 3:evenSum();break;
			case 4:numAndSquares();break;
			case 5:oddSquaresSum();break;
			default:
			System.out.println("输入无效，重新选择！");
			}
			choose = menu();
		}
		System.out.println("程序结束！");
	}	
//////		
	public static int menu() {
			int choice = 0;
			System.out.println("===========firstNum and secondNum==========");
			System.out.println("1.Input");
			System.out.println("2.odd num");
			System.out.println("3.the sum of even num");
			System.out.println("4.num and their squares between 1 to 10");
			System.out.println("5.the sum of squares of odd num");
			System.out.println("6.Exit");
			System.out.println("please choose(1-6):");
			Scanner scan  = new Scanner(System.in);
			choice = scan.nextInt();
			return choice;
			
		}
///////		
	public static void input() {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("请输入数一:");
			firstNum  = scan.nextInt();
			System.out.println("请输入数二:");
			secondNum = scan.nextInt();
			if(firstNum>=secondNum) {
				System.out.println("数一 不小于 数二###请重新输入数一和数二：");
			}
		}while(firstNum>=secondNum);
		
	}

	public static void oddNum() {
		
		if(firstNum == -1 || secondNum == -1) {
			System.out.println("请先输入这两个数!");
		}
		
		int j=1;
		
		for(int i = firstNum ; i <= secondNum ;i++) {
			if(i%2 == 1) {
				while(j == 1) {
					System.out.print(firstNum+"和"+secondNum+"之间的奇数有：");
					j--;
				}
				System.out.print(i+"  ");
			}
		}
		
		if(j == 1) {
			System.out.println(firstNum+"和"+secondNum+"之间没有奇数");
		}
		else System.out.println();
		
		
	}

///////////
	public static void evenSum() {
		
		if(firstNum == -1 || secondNum == -1) {
			System.out.println("请先输入这两个数!");
		}
		
		int sum = 0;
		for(int i = firstNum ; i <= secondNum ;i++) {
			if(i%2 == 0) {
				sum += i;

			}
		}
		
		if(sum != 0) {
			System.out.println(firstNum+"和"+secondNum+"之间偶数和为："+sum);
		}
		else System.out.println(firstNum+"和"+secondNum+"之间没有偶数");
		
	}
	
/////
	
	public static void numAndSquares() {

		System.out.print("1 - 10 ：");
		for(int i = 1; i <= 10 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("1 - 10 之间数的平方：");
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.print((int)Math.pow(i, 2)+" ");
		}
		System.out.println();
		
	}
	
//////////
	
	public static void oddSquaresSum() {
		
		if(firstNum == -1 || secondNum == -1) {
			System.out.println("请先输入这两个数!");
		}
		
		int sum = 0;
		
		for(int i = firstNum ; i <= secondNum ;i++) {
			if(i%2 == 1) {
				sum += i*i;				
			}
		}
		
		if(sum == 0) {
			System.out.println(firstNum+"和"+secondNum+"之间没有奇数");
		}
		else System.out.println("奇数平方和为："+sum);
		
	}
	
	
}

package week3;

import java.util.Scanner;

public class 成绩信息 {
public static double Score[] = null;
	
	public static void main(String[] args) {

		
		int choose = menu();
		
		double average;
		double high;
		double low;
		double sort;
		
		while(choose != 6){
			switch(choose){
			case 1: Input();break;
			case 2: 
				average = getAverage();
				if (average != -1)
					System.out.println("平均分=" + average);
				break;
			case 3:
				high = High();
				if (high != -1)
					System.out.println("最高分=" + high);
				break;
			case 4:
				low = Low();
				if (low != -1)
					System.out.println("最低分=" + low);
				break;
			case 5:sort = sort();
				if (sort != -1) {
					for(int i=0 ;i < Score.length;i++)
						System.out.println(Score[i]);
					}
				break;
			default:
				System.out.println("输入无效，重新选择！");
			
			}
			
			choose = menu();
			
		}
		System.out.println("程序退出，欢迎再次使用！");
		
	}

	
	/*
	 * 完成菜单的显示，返回用户的输入选择（1-5）
	 */
	
	public static int menu(){
		int choice = 0;
		System.out.println("==========WTU Bank===========");
		System.out.println("1.Input");
		System.out.println("2.Average");
		System.out.println("3.High");
		System.out.println("4.Balance");
		System.out.println("5.sort");
		System.out.println("6.Exit");
		System.out.println("please choose(1-6):");
		Scanner scan  = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}
	
	
/////	
	public static double sort(){
		double tmp;
		
		if(Score == null){
			System.out.println("请先输入成绩！");
			return -1;
			}
		
		for(int i = 0; i<Score.length;i++)
			for(int j = Score.length-1;j>i;j--)
				if(Score[i]>Score[j]) {
					tmp = Score[i];
					Score[i] = Score[j];
					Score[j] = tmp;
				}
		return 0;
	}
	
	
	
	
	
	public static double getAverage(){
		if(Score == null){
			System.out.println("请先输入成绩！");
			return -1;
			}
		double average = 0  ;
		double sum = 0;
		for(int i = 0 ; i<Score.length;i++){
			sum = sum + Score[i];
		}
		average = sum/Score.length;
		return average;
	}
	
	
/////
	public static void Input(){
		Score = new double[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<Score.length;i++){
			System.out.println("请输入第"+(i+1)+"个成绩：");
			Score[i] = scan.nextDouble();
			if(Score[i]<0 || Score[i]>100){
				System.out.println("无效输入，请重新输入：");
				i--;}
			
		}
		
		
	}
/////
	public static double High(){
		if(Score == null){
			System.out.println("请先输入成绩！");
			return -1;
			}
		double high = Score[0];
		for(int i = 1; i<Score.length;i++){
			if(Score[i] > high)
				high = Score[i];
			
		}
		return high;
	}

	
	
////
	public static double Low(){
		
		if(Score == null){
			System.out.println("请先输入成绩！");
			return -1;
			}
		
		double low = Score[0];
		for(int i = 1; i<Score.length;i++){
			if(Score[i] < low)
				low = Score[i];
			
		}
		return low;
	}

}

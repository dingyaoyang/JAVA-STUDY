package week2;

import java.util.Scanner;

public class 水仙花数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//定义变量
		int n;//n位水仙花数
		int weih;//各位数n次幂求和
		int wei;//记录每次弃掉个位数后的数
		int t;//表示每一位上的数字
		//数据输入
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input n:(3 to 7)");
		n = scan.nextInt();
				
		//输出
		for(int num = (int)Math.pow(10,n-1) ; num <= Math.pow(10,n)-1 ; num++) {
			weih = 0;
			wei  = num ;
			do {
				t = wei%10;
				weih +=Math.pow(t, n);
				wei = wei/10;
			}while(wei != 0);
				
		if (num == weih) 
		System.out.println(num);
		}
	}

}

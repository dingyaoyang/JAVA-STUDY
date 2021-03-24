
package week2;

import java.util.Scanner;

public class 猜数游戏 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		while(true)
		{
		int guess=-1,chances = 3;
		String choose;
		int num=(int)(Math.random()*1000+1);
		System.out.println(num);
		
		System.out.println("输入你猜的第一个数：");
		Scanner scan = new Scanner(System.in);
			for (int time = 1; time <= chances; time++) {
				guess = scan.nextInt();
				if (guess > num) {
					System.out.println("too high！");
				}
				if (guess < num) {
					System.out.println("too low！");
				}
				if (guess == num) {
					System.out.println("恭喜你猜对了！");
					break;
				}
				System.out.println("你还有"+(chances-time)+"次机会:");
					
			}	
		if(guess == num)
			break;
		System.out.println("游戏结束！再来一次？（y/n）：");
		choose = scan.next();
		if(choose.equals("n"))
			break;
	}
}
}
	
		

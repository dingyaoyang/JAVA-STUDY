package week9系统类库;

import java.util.Scanner;

public class boom {
	public static void main(String[] args) {

		boolean lengthok = false;
		boolean hasSpace = false;
		boolean hasUppercase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;

		System.out.println("请输入密码，必须符合以下要求:");
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		int len = password.length();

		// 长度判断
		if (len >= 8 && len <= 15) {
			lengthok = true;
		}
		// 逐一取出每一字符进行判断,记录判断结果
		for (int i = 0; i < len; i++) {
			char c = password.charAt(i);
			if (c == ' ') {
				hasSpace = true;
			}
			if (c >= 'A' && c <= 'Z') {
				hasUppercase = true;
			}
			if (c >= 'a' && c <= 'z') {
				hasLowerCase = true;
			}
			if (c >= '0' && c <= '9') {
				hasDigit = true;
			}
		}
		// 根据布尔型变里的记录给出相关的结果
		String info = "";
		if (lengthok && !hasSpace && hasUppercase && hasLowerCase && hasDigit) {
			info = "符合要求";
			System.out.println("恭喜你，你的密码'" + password + "'" + info);
		} else {
			if (!lengthok) {
				info += "长度不符合要求\n";
			}
			if (hasSpace) {
				info += "密码包含了空格\n";
			}
			if (!hasUppercase)
				info += "密码至少需要一个大写\n";
			if (!hasLowerCase) {
				info += "密码至少需要一个小写\n";
				if (!hasDigit) {
					info += "密码至少需要一个数字\n";
					// 输出结果
					System.out.println("你的密码'" + password + "'无效，原因如下");
					System.out.println(info);
				}

			}
		}
	}
}

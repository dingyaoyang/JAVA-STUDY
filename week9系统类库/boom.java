package week9ϵͳ���;

import java.util.Scanner;

public class boom {
	public static void main(String[] args) {

		boolean lengthok = false;
		boolean hasSpace = false;
		boolean hasUppercase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;

		System.out.println("���������룬�����������Ҫ��:");
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		int len = password.length();

		// �����ж�
		if (len >= 8 && len <= 15) {
			lengthok = true;
		}
		// ��һȡ��ÿһ�ַ������ж�,��¼�жϽ��
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
		// ���ݲ����ͱ���ļ�¼������صĽ��
		String info = "";
		if (lengthok && !hasSpace && hasUppercase && hasLowerCase && hasDigit) {
			info = "����Ҫ��";
			System.out.println("��ϲ�㣬�������'" + password + "'" + info);
		} else {
			if (!lengthok) {
				info += "���Ȳ�����Ҫ��\n";
			}
			if (hasSpace) {
				info += "��������˿ո�\n";
			}
			if (!hasUppercase)
				info += "����������Ҫһ����д\n";
			if (!hasLowerCase) {
				info += "����������Ҫһ��Сд\n";
				if (!hasDigit) {
					info += "����������Ҫһ������\n";
					// ������
					System.out.println("�������'" + password + "'��Ч��ԭ������");
					System.out.println(info);
				}

			}
		}
	}
}

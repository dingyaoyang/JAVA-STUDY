package week8��������;

import week8��������.Employ;

public class Example11 {
	public static void main(String[] args) {
		  //�ȴ���3����Ա����
		  Employ employee1=new Employ("0001","���ľ�",50,"�ܾ���");
		  Employ employee2=new Employ("0005","����",45,"������");
		  Employ employee3=new Employ("1016","����",28,"����");
		  //�����������鲢ֱ�ӳ�ʼ��
		  Employ ��Ա1[]={employee1,employee2,employee3};
		  output(��Ա1);//�����Ա��Ϣ
		  System.out.println("------------------");//�ָ���
		  //�����������鲢ֱ�ӳ�ʼ������ʼ��Ԫ��ֱ�ӵ���
		  //���췽����������
		  Employ ��Ա2[]={new Employ("0001","���ľ�",50,"�ܾ���"),
		  new Employ("0005","����",45,"������"),
		  new Employ("1016","����",28,"����")};
		  output(��Ա2);
		 }
		 //���巽�����������Ա��Ϣ��ע�ⷽ����private,static
		 private static void output(Employ ��Ա[]){
		  for(Employ employee:��Ա)
		   System.out.println(employee.toString());
		 }
}

package day0315;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//socrer�� 68�̴�.
		//socore�� 60�̻��̸� �հ��� ����ϰ�
		//�׷��� ������ ���հ��� ��� �Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score =sc.nextInt();
		
		System.out.println("Ű�� �Է��ϼ���");
		float height=sc.nextFloat();
		if (score >= 60)
		{
			System.out.println("�հ�");
		}
		if ( score<60)
		{
			System.out.println("���հ�");
		}
	}

}

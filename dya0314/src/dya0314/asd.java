package dya0314;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int gender=sc.nextInt();
		if (gender==2|| gender==4)
		{
			System.out.println("����");
		}
		if(gender==1||gender==3)
		{
			System.out.println("����");
		}
		int score=86;
		if (score>=90)
		{
			System.out.println("��");
		}
		if(score>=80)
		{
			System.out.println("��");
		}
		if(score<=70)
		{
			System.out.println("��");
		}
		else
		{
			System.out.println("��");
		}
		System.out.println("����");
	}

}

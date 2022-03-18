package day0315;

import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수 를 입력하시요");
		int a=sc.nextInt();
		if(a<0)
		{
			System.out.println(a*-1);
		}
		else
		{
			System.out.println(a);
		}
	}

}

package day0315;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수 를 입력하시요");
		int x=sc.nextInt();
		if(x %2==0)
		{
			System.out.println("짝수");
		}
		else
		{
			System.out.println("홀수");
		}
	}

}

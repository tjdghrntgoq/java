package dya0314;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요");
		int gender=sc.nextInt();
		if (gender==2|| gender==4)
		{
			System.out.println("여자");
		}
		if(gender==1||gender==3)
		{
			System.out.println("남자");
		}
		int score=86;
		if (score>=90)
		{
			System.out.println("수");
		}
		if(score>=80)
		{
			System.out.println("우");
		}
		if(score<=70)
		{
			System.out.println("미");
		}
		else
		{
			System.out.println("가");
		}
		System.out.println("종료");
	}

}

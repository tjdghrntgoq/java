package day0315;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//socrer가 68이다.
		//socore가 60이상이면 합격을 출력하고
		//그렇지 않으면 불합격을 출력 하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score =sc.nextInt();
		
		System.out.println("키를 입력하세요");
		float height=sc.nextFloat();
		if (score >= 60)
		{
			System.out.println("합격");
		}
		if ( score<60)
		{
			System.out.println("불합격");
		}
	}

}

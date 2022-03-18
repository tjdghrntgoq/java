import java.util.Scanner;

public class example27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하시요");
		int c1=sc.nextInt();
		int b1=c1;
		System.out.println("영어 점수를 입력하시요");
		int c2=sc.nextInt();
		int b2=c2;
		System.out.println("수합 점수를 입력하시요");
		int c3=sc.nextInt();
		int b3=c3;
		System.out.println("과학 점수를 입력하시요");
		int c4=sc.nextInt();
		int b4=c4;
		System.out.println("음악 점수를 입력하시요");
		int c5=sc.nextInt();
		int b5=c5;
		int sum=b1+b2+b3+b4+b5;
		float avw=sum/5f;
		System.out.printf("성적 총합계는 %d입니다,평균은 %.1f입니다",sum,avw);
	}

}

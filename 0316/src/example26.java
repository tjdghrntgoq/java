import java.util.Scanner;

public class example26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변을 입력하시요");
		int a=sc.nextInt();
		int a1=a;
		System.out.println("삼각형의 높이를 입력하시요");
		int b=sc.nextInt();
		int b1=b;
		float sum=a*b;
		float awm=sum/2;
		System.out.printf("삼각형의 넓이는 %.1f 입니다",awm);
	}

}

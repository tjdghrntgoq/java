
import java.util.Scanner;

public class example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자를 입력해주세요");
		char swc=sc.next().charAt(0);
		System.out.println((char)(swc-32));
	}

}

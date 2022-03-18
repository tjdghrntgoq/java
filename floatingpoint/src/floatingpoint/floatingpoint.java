package floatingpoint;

public class floatingpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//%d:10진 정수를 출력(decimal)
		System.out.printf("%d \n",10);
		//%o:8진 정수를 출력
		System.out.printf("%o \n",10);
		//%x:16진 정수를 출력
		System.out.printf("%x \n",10);
		//%2진수 출력 서식문자는 없음
		//%b:논릴값(bloolean)
		System.out.printf("%b \n",true);
		//%f:실수 출력(float)
		//%,1f:소수점 1자리까지 출력
		System.out.printf("%f \n",3.14);
		//%c:문자 하나 출력(character)
		System.out.printf("%c \n",'a');
		//%s:문자 하나 출력(string)
		System.out.printf("%s \n","abc");
		System.out.printf("%s,%c형,%d세,%1fcm \n","홍길동",'b',20,180.5);
		
	}

}

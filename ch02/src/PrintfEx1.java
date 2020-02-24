
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10.0/3);
		
		//printf는 줄바꿈에 개행문자(%n)가 필요하다!
//		System.out.printf("%d%n", 15);
//		System.out.printf("%#o%n", 15);//8진수로 출력, #은 접두사
//		System.out.printf("%#x%n", 15);//16진수로 출력, x가 대문자이면 접두사도 대문자 
//		System.out.printf("%s", Integer.toBinaryString(15));
		//2진문자열("1111")로 출력 (=printf("%s", "1111");)
		
//		float f = 123.456789f;
//		double f = 123.456789; //float 타입보다 정밀도가 더 높은 double 타입
//		System.out.printf("%f%n", f);//float 변수의 경우 소수점 6자리까지 반올림
//		System.out.printf("%e%n", f);
//		System.out.printf("%g%n", f);
		
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%5d]%n", 1234567);//지정한 자리수 이상으로 값을 출력
		System.out.printf("[%-5d]%n", 10);//왼쪽정렬
		System.out.printf("[%05d]%n", 10);
		
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d);//(소수점 포함)14자리, 소수점 10자리
//		System.out.printf("%14.6f",  d);
		System.out.printf("%.6f%n",  d);
		
		System.out.printf("[%s]%n",  "www.codechobo.com");
		System.out.printf("[%20s]%n",  "www.codechobo.com");//기본은 오른쪽정렬
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");//왼쪽에서 10글자만 출력
		
		
	}

}

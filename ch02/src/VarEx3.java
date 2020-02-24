
public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100; //상수를 선언과 동시에 초기화
		//score = 200;
//		System.out.println(score);
		
		boolean power = true;
//		System.out.println(power);
		
		byte b = 127; //-128~127
//		System.out.println(b);
		
		int oct = 010; //8진수, 10진수로는 8
		int hex = 0x10; //16진수, 10진수로는 16
//		System.out.println(oct);//8
//		System.out.println(hex);//16
		//n진수 그대로 출력하고자 하면 printf
		
		long l = 10_000_000_000L;
		//integer literal는 20억 범위 안에서만 가능
//		System.out.println(l);
		
		float f = 3.14f;
		double d = 3.14;
//		System.out.println(f);
//		System.out.println(d);
		
//		System.out.println(10.);//10.0
//		System.out.println(0.10);//0.1
//		System.out.println(10f);//10.0
//		System.out.println(1e3); //1000.0
		
		char ch = 'A';
		int i = 'A';
		System.out.println(ch); //A
		System.out.println(i); //65
		
		String str = "";//빈 문자열(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);//결합순서대로
		System.out.println(""+7+7);//77
		System.out.println(7+7+"");//14
	}
}

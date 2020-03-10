
public class OperatorEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 1_000_000 * 1_000_000;
		//int타입과 int타입의 연산결과 = int타입 -> 오버플로우 발생!
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}

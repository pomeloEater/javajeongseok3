
public class OperatorEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000000;
		
		int result1 = a * a / a; // 1000000 * 1000000 / 1000000
		//int타입과 int타입의 연산인 a * a를 연산할 때 오버플로우가 발생
		int result2 = a / a * a; // 1000000 / 1000000 * 1000000
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
	}

}

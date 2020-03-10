
public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000; //1,000,000	1백만
		int b = 2_000_000; //2,000,000	2백만
		
//		long c = a * b; // a*b=2,000,000,000,000 ?
		long c = (long)a * b;	
		System.out.println(c);

	}

}

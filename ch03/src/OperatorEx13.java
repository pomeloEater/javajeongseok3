
public class OperatorEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		
//		char c2 = c1 + 1; //컴파일 에러발생!
		char c2 = (char)(c1+1);
//		char c2 = 'a'+1; //컴파일 에러없음
		
		System.out.println(c2);
	}

}

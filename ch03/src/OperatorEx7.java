
public class OperatorEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b); //a*b=300은 byte형의 범위를 넘어가 데이터 손실 발생
		System.out.println(c); 
	}

}

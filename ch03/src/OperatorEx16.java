
public class OperatorEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		//(int)(3141.592f) / 1000f -> 3141/1000f -> 3141.0f/100f -> 3.141f
		System.out.println(shortPi);
	}

}

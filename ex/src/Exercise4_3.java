
public class Exercise4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0, sum = 0;
		for(int i=1; i<=10; i++) {
			temp += i;
			sum += temp;
		}
		System.out.println("결과: "+sum);
	}

}

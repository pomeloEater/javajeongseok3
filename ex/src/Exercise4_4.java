
public class Exercise4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int tmp = 0;
		int m = 1;
		
		for(int i=1; true; i++, m=-m) {
			tmp = i * m;
			sum += tmp;
//			System.out.printf("%d %d \n", tmp, sum);
		
			if(sum >=100)
				break;
		}
		
//		for(int i=1;sum < 100; i++, m=-m) {
//			tmp = i * m;
//			sum += tmp;
//		}//답지에 나와있는 방식
		
//		System.out.println("총합: "+sum);
		System.out.println("구하는 값: "+tmp);
		
	}//main의 끝
}

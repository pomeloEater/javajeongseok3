
public class FlowEx30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			++i;//break문이 수행되면 이 부분은 실행되지 않음
			sum += i;//break문이 수행되면 이 부분은 실행되지 않음
		}//end of while
		
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}//main의 끝

}

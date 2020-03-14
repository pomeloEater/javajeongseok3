import java.util.*;
public class FlowEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) +1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input!=answer);//반복적으로 사용자의 입력을 받아서 처리할 때!
		System.out.println("정답입니다.");//두 값이 같으면 반복을 벗어난다.
	}//main의 끝

}

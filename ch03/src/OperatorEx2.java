
public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = 0;
		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j="+j);
		//1.i가 j 값을 참조 2.연산결과를 j에 저장 3.i값을 증가
		
		i=5;
		j=0; //결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j= ++i;
		System.out.println("j=++i; 실행 후, i="+i+", j="+j);
		//1.i 값을 증가 2.i 값을 참조 3.연산결과를 j에 저장
		//연산 순서가 다르다!
	}

}

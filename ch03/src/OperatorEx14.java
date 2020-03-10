
public class OperatorEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c= '1';
		for(int i = 0; i<26; i++) {	//블럭{} 안의 문장을 26번 반복한다.
			System.out.print(c++);	//'a'부터 26개의 문자를 출력한다.
		}
		System.out.println();	//줄바꿈을 한다.
		//매개변수 없이 println 메서드를 호출하면, 아무것도 출력하지 않고 단순히 줄을 바꾸고 다음 줄의 처음으로 출력 위치를 이동시킨다.
		
		c = 'A';
		for(int i=0; i<26; i++) {	//블럭{} 안의 문장을 26번 반복한다.
			System.out.print(c++);	//'A'부터 26개의 문자를 출력한다.
		}
		System.out.println();
		
		c = '0';
		for(int i=0; i<10; i++) {	//블럭{} 안의 문장을 10번 반복한다.
			System.out.print(c++);	//'0'부터 10개의 문자를 출력한다.
		}
		System.out.println();
	}

}

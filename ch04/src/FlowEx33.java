
public class FlowEx33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5)
//					break Loop1;//2*5에서 Loop1을 빠져나옴
//					break;//i*5가 실행되지 않고 (i+1)*j로 넘어감
//					continue Loop1;//System.out.println();이 실행되지 않고 (i+1)*j를 수행함
//					continue;//j<=9라는 조건을 충족할 때까지 i*j를 수행
				System.out.println(i+"*"+j+"="+i*j);
			}//end of for i
			System.out.println();
		}//end of Loop1
	}//main의 끝

}

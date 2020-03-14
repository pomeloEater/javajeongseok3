
public class FlowEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i);
			for(int j=0;j<2_000_000_000;j++) {
				;//아무런 내용도 없는 빈 문장. 매 출력마다 약간의 시간을 지연시킴
			}
			//for(int j=0;j<2_000_000_000;j++);
			//또는 for(int j=0;j<2_000_000_000;j++){}
		}
		System.out.println("GAME OVER");
		
/*		for(i=1;i<=10;i++);
		{
			System.out.println("i = "+i);
		}*/
	}//main의 끝

}


public class FlowEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);
				}else {
					System.out.printf("%5c", ' '); //%5c는 문자 1개
				}
			}
			System.out.println();
		}
	}//main의 끝

}

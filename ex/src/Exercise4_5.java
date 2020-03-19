
public class Exercise4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=0; i<=10; i++){
//			for(int j=0; j<=10; j++)
//				System.out.print("+");	
//			System.out.println();
//			}//...11개의 +를 11줄 출력하는 방법?

		int i = 0;
		while(i<=10) {
			int j=0;
			while(j<=10) {
				System.out.print("+");
				j++;
			}
			System.out.println();
			i++;
		}

	}//end of main
}//end of class

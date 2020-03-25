import java.util.*;
public class MultiArrPr1 {

	public static void main(String[] args) {

		final int SIZE = 10;
		int x=0, y=0;
		
		char[][] board = new char [SIZE] [SIZE];
		byte[][] shipBoard = new byte [SIZE-1][SIZE-1];
		
		for(int i=1;i<SIZE-1;i++) {
			for(int j=1;j<SIZE-1;j++) {
				shipBoard[i][j] += (byte)(Math.round(Math.random()));
			}
		}
		
		//1행에 행번호를, 1열에 열번호를 저장한다.
		for(int i=1; i<SIZE;i++)
			board[0][i] = board[i][0] = (char)(i+'0');

		//0과 1을 무작위로(?) 생성해서 만든 배열 shipBoard를 확인한다.
//		System.out.println(Arrays.deepToString(shipBoard));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요.(종료는 00)>");
			String input = scanner.nextLine();
			
			if(input.length()==2) {
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0)
					break;
			}//숫자를 좌표값으로 변환하여 각각 저장
			
			if(input.length() !=2||x<=0||x>=SIZE||y<=0||y>=SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			//shipBoard[x-1][y-1]의 값이 1이면, '0'을 board[x][y]에 저장한다.
			board[x][y] =  shipBoard[x-1][y-1]==1 ? 'O':'X';
			
			//배열 board의 내용을 화면에 출력한다.
			for(int i=0; i<SIZE;i++) 
				System.out.println(board[i]);
			System.out.println();
		}
		
//Q1.(Math.random()을 사용하지 않고) 정해진 개수만큼의 1을 포함한 배열을 만드는 법은?
//Q2.Arrays.deepToString()를 이용하여 board를 출력하고자 할 때,
//행번호와 열번호는 출력되지만 그 외의 요소들은 출력되지 않는다.
//shipBoard는 byte 배열이지만 board는 char 속성이기 때문에 출력되지 않는 것이라면
//전체를 제대로 출력하는 방법은 뭐가 있을까?
		
//그나저나 이런 식으로 지뢰찾기를 만드나?
		
	}//main의 끝
}

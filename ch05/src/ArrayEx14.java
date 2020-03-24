
public class ArrayEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src="ABCDE";
		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAT("+i+"):"+ch);
		}
		
		//String을 char[]로 변환
		char [] chArr = src.toCharArray();
		
		//char배열(char[])을 출력
		System.out.println(chArr);
	}

}

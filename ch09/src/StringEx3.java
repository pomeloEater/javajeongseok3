
public class StringEx3 {
	public static void main(String[] args) {
		// 길이가 0인 char 배열을 생성한다.
		char[] cArr = new char[0];
		String s = new String(cArr);
		
		System.out.println("cArr.length="+cArr.length);
		System.out.println("@@@"+s+"@@@");
	}
}


public class ExceptionEx12 {
	public static void main(String[] args) throws Exception {
		method1();
	} // main메서드의 끝
	
	static void method1() throws Exception {
		method2();
	} // method1의 끝
	
	static void method2() throws Exception {
		throw new Exception();
	} // method2의 끝

}

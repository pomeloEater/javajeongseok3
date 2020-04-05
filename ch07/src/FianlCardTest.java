class Cardnew{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Cardnew(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Cardnew(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND +" "+NUMBER;
	}
}

public class FianlCardTest {

	public static void main(String[] args) {
		Cardnew c = new Cardnew("HEART", 10);
//		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
//		System.out.println(c.toString());
	}
}

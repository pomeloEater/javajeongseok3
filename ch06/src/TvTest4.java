
public class TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];//길이가 3인 Tv객체 배열
		
		//Tv객체를 생성해서 TV객체 배열의 각 요소에 저장
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;//tvArr[i]의 channel에 ㅑ+10을 저장
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}//main의 끝

}


class Tv{
	//Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	//TV의 기능(메서드)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

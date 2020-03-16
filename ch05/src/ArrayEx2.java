import java.util.*;//Arrays.toString()을 사용하기 위해 추가
public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
		
		for(int i=0;i<iArr1.length;i++) {
			iArr1[i] = i+1;//1~10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for(int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) +1;//1~10의 값을 (랜덤으로) 배열에 저장
		}
		
		//배열에 저장된 값들을 출력한다.
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		//위 줄을 넣지 않으면 iArr1에 저장된 값을 확인한 줄 옆으로 iArr2에 저장된 값들이 붙어 출력됨
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);//배열을 가리키는 참조변수(타입@주소)가 출력됨
		System.out.println(chArr);//구분자없이 출력됨
	}

}

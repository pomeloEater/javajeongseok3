//import java.util.*;
public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<numArr.length;i++) {
			counter[numArr[i]]++;
			//counter 배열의 (numArr[i])번째 값을 1 증가시킨다.
		}
		
//		System.out.println(Arrays.toString(counter));
		//counter 배열이 궁금해서... import를 까먹지 말자!
		
		for(int i=0; i<numArr.length;i++) {
			System.out.println(i+"의 개수 :"+counter[i]);
		}
	}

}

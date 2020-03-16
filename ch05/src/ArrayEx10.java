
public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length;i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		//왜 numArr.length-1이어야 할까? 생각해보기!
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false;//자리바꿈이 발생했는지를 체크한다.
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {//엽의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;//자리바꿈이 발생했으므로 changed를 true로.
				}
			}//end for j
			
			if(!changed) break;//자리바꿈이 없으면 반복문을 벗어난다.
			//배열의 끝에 도달할 때까지 자리바꿈을 반복하면 제일 큰 값이 배열의 마지막 값이 된다.
			//가장 큰 값이 배열의 마지막 값이 된 이후, 나머지 부분 자리바꿈을 진행할 때
			//비교해야 하는 범위가 하나씩 줄어든다. (numArr.length-1-i)
			
			for(int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]);
			System.out.println();
		}//end for i
	}//main의 끝

}

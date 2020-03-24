
public class ArrayEx16 {

	public static void main(String[] args) {
		if(args!= null) {
			System.out.println("매개변수의 개수:"+args.length);
			for(int i=0; i<args.length; i++) {
				System.out.println("args["+i+"] = \""+args[i]+"\"");
			}
		}
	}
}
//Run Configurations을 이용하거나 cmd에서 ..\ch05\bin의 경로로 가서 실행시킨다.
//src 폴더에는 .java 파일이, bin 폴더에는 .class 파일이 있으므로.
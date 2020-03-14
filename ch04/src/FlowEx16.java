
public class FlowEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
/*		System.out.println();
		for(int j=1;j<=1;j++) {System.out.print("*");} System.out.println();
		for(int j=1;j<=2;j++) {System.out.print("*");} System.out.println();
		for(int j=1;j<=3;j++) {System.out.print("*");} System.out.println();
		for(int j=1;j<=4;j++) {System.out.print("*");} System.out.println();
		for(int j=1;j<=5;j++) {System.out.print("*");} System.out.println();
 */
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {System.out.print("*");} System.out.println();
		}
	}
}
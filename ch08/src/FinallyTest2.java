
public class FinallyTest2 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}
	} // main�� ��
	
	static void startInstall() {
		/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�. */
	}
	
	static void copyFiles() {/* ���ϵ��� �����ϴ� �ڵ带 ���´�. */}
	static void deleteTempFiles() {/* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�. */}
}
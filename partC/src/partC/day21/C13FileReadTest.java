package partC.day21;

import java.io.File; //io�� input�� output. ����� Ŭ�������� ��Ű�� �Դϴ�.
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C13FileReadTest {
	
	public static void main(String[] args) {
		// D:\iclass0419�� ����� words.txt ���Ϸ� ���� �Է�(�о����)
		String path = "D:\\iclass0419\\words.txt";
		File file = new File(path); //1)�о�� ���Ͽ� ���� ��ü ����.
		
		//Scanner fscc = new Scanner(file); 2)������ �ٷ�� Scanner ��ü ����(���� �Է�)
		//3)������� �ٷ�� ��ü���� Exception(���ܴ� ���α׷����� �߻��ϴ� ����) ó���� �����ڰ� �ؾ���.
		
		Scanner fsc = null;
		
		try {
			//4)try{}��ɹ��� �����ϴٰ� Exception(����)�� ����� catch{}�� �����մϴ�.
			fsc = new Scanner(file);
			
			//7) ���Ͽ��� �о�� �����͸� �ֿܼ� ����ϱ�
			while (fsc.hasNext()) { //�� �پ� �������� ���� ��, �о�� ���� �� �ֳ�?
				System.out.println(fsc.nextLine()); //�� �پ�(enter����) �о���� �޼ҵ�
			}
			
			System.out.println("���������� ���� �о���� ��!!");
			
		}catch(FileNotFoundException e) {//5)���ܰ� �߻��� ������ Exception ��ü�� ����
			//FileNotFoundException ���ܸ� ó���մϴ�.
			
			System.out.println("���Ϸκ��� �о���� - �Է� ���� : "+ e.getMessage());
			//������ ������ ����ڿ��� �˷��ֱ�
		}finally {
			//6)���� ����� ���� �߻� ��� ����� �ڿ��� �����ϱ� ���� ��ɹ� �ۼ�
			if(fsc != null) fsc.close();
		}
		
		//���� : ���� ó���� try~catch�� throws(���ѱ��)
		//main�޼ҵ忡�� throws�� �ϸ� JVM�� ó���մϴ�. JVM�� �ڹ� ���α׷��� �����ϴ� ����ӽ�.
	}

}

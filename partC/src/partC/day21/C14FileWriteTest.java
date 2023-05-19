package partC.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C14FileWriteTest {
	public static void main(String[] args) {
		//D:\\iclass0419 ��� note.txt ���Ϸ� ���(�����ϱ�.����)
		String path = "D:\\iclass0419\\note.txt";
		File file = new File(path);
		Scanner sc = new Scanner(System.in); // ǥ�� �Է� ��ĳ�� ��ü
		
		//���� ��� Ŭ����
		PrintWriter fpw = null;
		try {
			fpw = new PrintWriter(file); //���� ��� PrintWriter ��ü
			
//			//�׽�Ʈ��
//			fpw.print("�׽�Ʈ"); fpw.println("TEST"); fpw.print("�׽�Ʈ");
			while(true) {
				System.out.println("�ڹٿ��� ���� ���� �ܾ� �Է� >>>");
				String english = sc.nextLine();
				if(english.equals("_end_")) break; //��������
				
				System.out.println("�ܾ��� �ǹ̸� �Է��ϼ���. >>>");
				String korean = sc.nextLine();
				
				fpw.print(english); //fpw���� ������ ���Ϸ� ����
				fpw.print("/");
				fpw.println(korean);
				
				System.out.println("1�� �ܾ� �߰� �Ϸ� !!!");
			}
			
			System.out.println("���� ���� �Ϸ�!!!");
			
		} catch (FileNotFoundException e) {
			System.out.println("���Ϸ� �����ϱ� - ��� ���� : "+ e.getMessage());
		}finally {
			if(fpw != null)fpw.close();
			sc.close();
		}
	}

}

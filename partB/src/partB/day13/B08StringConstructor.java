package partB.day13;

import java.util.Scanner;

//�ڹ� Ŭ���� String�� ������ �׽�Ʈ. String Ŭ���� �������� �����ε� ����
public class B08StringConstructor {

	public static void main(String[] args) {
		
		String str1 = new String(); //�Ű����� ���� �⺻ �����ڿ� ��ü ����
		System.out.println("str1 = " + str1 + " ,���� =" +str1.length());
		//str1�� ""(����:null �ƴ�)
		
		String str2 = new String("heelo hi!"); //�Ű����� ���ڿ� 1�� ��ü ����
		System.out.println("str2 = " + str2 + " ,���� =" +str2.length());
		
		String str3 = new String(new char[] {'h','e','l','l','o','*'});
		//�Ű������� char �迭 1���� ������
		System.out.println("str3 = " + str3 + " ,���� =" +str3.length());
		
		//���� : Scanner Ŭ���� ������ System.in �Ű������� InputStreamŸ���Դϴ�.
		Scanner sc = new Scanner(System.in);
		
		//String Ŭ������ �Һ� ��ü. ����(���� ����)�� �ٲ� �� ���� ��ü
		String msg = "hello";
		msg = msg + "*hi";  //hello ���ڿ� + *hi ���ڿ� ����� ����Ǵ� ��ü�� ������ ��������ϴ�
		System.out.println(msg);        
		

	}
}

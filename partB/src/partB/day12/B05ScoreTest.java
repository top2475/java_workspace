package partB.day12;

import java.util.Arrays;
import java.util.Scanner;

public class B05ScoreTest {
//�ν��Ͻ� �ʵ�� �ν��Ͻ� �޼ҵ�� ��ü�� �����ؾ� ��� ����
	public static void main(String[] args) {
		B05Score hyerim = new B05Score();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���. >>>>");
		hyerim.setName(sc.next());
		System.out.println("���� ������ �Է��ϼ���. >>>>");
		hyerim.setKorea(sc.nextInt());
		System.out.println("���� ������ �Է��ϼ���. >>>>");
		hyerim.setEnglish(sc.nextInt());
		System.out.println("���� ������ �Է��ϼ���. >>>>");
		hyerim.setScience(sc.nextInt());
		System.out.println("===�ش� �л��� ����===");
		System.out.println(hyerim.member());
		System.out.println("���� =" + hyerim.sum());
		System.out.println(String.format("��� = %.2f\n",hyerim.averge()));

		

	}
}

package partB.day12;

import java.util.Scanner;

public class B05ScoreWhlieTest {
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//�ν��Ͻ� �ʵ�� �ν��Ͻ� �޼ҵ�� ��ü�� �����ؾ� ����� �� �ֽ��ϴ�.
		boolean status = true;
		while(status) {
	    B05Score hyerim = new B05Score();
	    
		System.out.println("�̸��� �Է��ϼ���. >>>> (end=>����)");
		String name = sc.nextLine();
		if(name.equals("end")) break;
			
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
		
		sc.nextLine();

	}

}}

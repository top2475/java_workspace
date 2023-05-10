package partB.day13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//���� : ��ü�� �迭 ����. String �迭�� ����
public class B10UserArray {
	
	public static void main(String[] args) {
		
		//Ŭ���� Ÿ������ ����� ������ ��ü�� �������� ����!!
		B09User momo = new B09User("twice","����",27,100);
		B09User nayeon = new B09User("twice2","����",25,110);
		B09User dahyeon = new B09User("twice3","����",28,120);
		B09User zuwi = new B09User("twice4","����",24,133);
	

		//1. ���� 4�� ��ü�� ������ �迭�� �迭ũ��7�� ����. �迭�̸��� twice
	    //   ����� �迭�� 4���� ��ü�� ����
		B09User[] twice = new B09User[7];
		
		twice[0] = momo;
		twice[1] = nayeon;
		twice[2] = dahyeon;
		twice[3] = zuwi;
		
		//��ü ������������ �迭�� ������ ��� Ȯ��
		System.out.println(twice[0]);
		System.out.println(momo);
		System.out.println(twice[0].user());
		System.out.println(momo.user());
		System.out.println("��� : twice[0]�� momo�� ������ ���� �����ϴ�. \n" +
		"��, ���� ��ü�� �����ϰ� �ִ�.");
		
		//2. ���� ������ �迭�� ��Ҹ� ��� �ʵ尪 ���. �������� �ذ�
		System.out.println("==�迭�� ��ü ���� ���� Ȯ��==");
		for(int i=0; i<twice.length; i++) {
		System.out.println(twice[i]);}
		
		System.out.println("==�迭�� ��ü ���� �ʵ尪 ���==");
		for(int i=0; i<twice.length; i++) {
			if(twice[i] !=null)
			//��ü null�� ���� �޼ҵ� ���� ����**
			System.out.println(twice[i].user());}
		
		//3. ���ο� ��ü�� ����. �迭 �ε��� 4�� ����
		B09User jungyeon = new B09User("twice5","����",28,150);
		twice[4] = jungyeon;
		//twice[4] = new User("twice5","����",28,150);
		//��ü ���� ������ �������� �ʰ� �ٷ� �迭 ��ҷ� ����
		System.out.println("==���ο� ��ü�� �ε���4�� ������ ���==");
		for(int i=0; i<twice.length; i++) {
			if(twice[i] !=null)
				System.out.println(twice[i].user());}
		
		//4.�迭���� �����ϴ� ��ü�� User Ÿ�� - User��ü�� name�ʵ常 ����ϱ�
		System.out.println("==twice �迭�� ����� User ��ü�� name �ʵ� ���==");
		for (int i=0; i<twice.length;i++) {
			if(twice[i] != null)
				System.out.println(twice[i].getName());}
		
		//5. User�� �Һ� ��ü�� ���ǵǾ����Ƿ�, Ű���� �Է°����� ��ü�� �����Ѵٸ�?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է� >>>");
		String id = sc.nextLine();
		System.out.println("�̸� �Է� >>>");
		String name = sc.nextLine();
		System.out.println("���� �Է� >>>");
		int age = sc.nextInt();
		System.out.println("����Ʈ �Է� >>>");
		int point = sc.nextInt();
		
		twice[5] = new B09User(id,name,age,point);
		System.out.println(twice[5].user());
		
		twice[6] = nayeon; //�̹� ������ ��ü�� 6������ �ε��� ����
		
		//6. twice �迭�� ����� ��ü���� age �ʵ� �� ����� ���غ���.
		double sum = 0.0;
		for(int i=0;i<twice.length;i++) {
			if(twice[i] != null)
				sum += twice[i].getAge();
		}
		System.out.println("���� �� =" + sum + ", ����� = " + sum/twice.length);
		
		System.out.println("==�迭 ��� 2���� ���Ƿ� null�� ������ ��==");
		twice[4] =null; twice[6]=null;
		sum=0;
		int count =0;
		for(int i=0;i<twice.length;i++) {
			if(twice[i] != null) {
				count++;
				sum += twice[i].getAge();}
			}
		System.out.println("���� �� =" + sum);
		System.out.println("null�� �ƴ� ��ü�� ���� = " + count);
		System.out.println("��� = " + sum/count);
		
		
		
		
	}
}

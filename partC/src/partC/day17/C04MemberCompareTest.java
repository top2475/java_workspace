package partC.day17;

import java.util.Arrays;

public class C04MemberCompareTest {
	//Member ��ü�� compare(��)
	public static void main(String[] args) {
		
		Member m1 = new Member("����", 23);
		Member m2 = new Member("�ֻ糪", 20);
		
		System.out.println("m1 ���� ��ü�� m2 ���� ��ü�� ���� �� �ֳ���?");
		System.out.println("�� : ��ü ��ü�δ� �񱳰� �ȵ�. ��ü�� Ư�� �ʵ�� ���ؾ� ��");
		System.out.println("\n2. ��ü�� Ư�� �ʵ�� ��� �� �� �� �ֳ���?");
		System.out.println("�� : Member Ŭ������ ���� �� �ִ� Ŭ������ �����մϴ�.");
		System.out.println("m1.compareTo(m2) = " + m1.compareTo(m2)); 
		System.out.println("m2.compareTo(m1) = " + m2.compareTo(m1));
		
		System.out.println("\n3. �̷��� �� �ϴ� ���� ����(sort)�� ���˴ϴ�.");
		int[] numbers = {56,34,89,45,99,88};
		String[] names = {"����","�質��","�ֻ糪","������","������","�̳���"};
		Arrays.sort(numbers);
		Arrays.sort(names);
		System.out.println("int �迭 ���� ��� = " + Arrays.toString(numbers));
		System.out.println("int �迭 ���� ��� = " + Arrays.toString(names));
		
		Member[] members = new Member[5];
		members[0] = m1;
		members[1] = m2;
		members[2] = new Member("������",22);
		members[3] = new Member("������",21);
		members[4] = new Member("�̳���",25);
		
		//MemberŬ������ �����ǵ� compareTo �����Ƿ� sort �� �� �ֽ��ϴ�.
		System.out.println("Members �迭 �ʱ� ���� = " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("Members �迭 ���� ��� = " + Arrays.toString(members));
		
		//Comparable<Member>�� Member Ŭ������ Comparable �� �ϰڴ�.<T> Ÿ������ ����.
		//������ �ʵ�� CompareTo�� �̸� �ڵ忡 �ۼ��ؾ��ϸ� ���� �ȵ带 �����Ϸ���
		//�ϵ� �ڵ����� �ؾ� �մϴ�. => Comparator �������̽��� sort ���� �������� �ʵ带 ������ �� �ְ� �����մϴ�.
	}
}

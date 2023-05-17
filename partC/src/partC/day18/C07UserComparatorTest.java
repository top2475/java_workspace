package partC.day18;

import java.util.Arrays;
import java.util.Comparator;

public class C07UserComparatorTest {
	//Member ��ü�� compare(��)
	public static void main(String[] args) {
		
		User m1 = new User("����", 23);
		User m2 = new User("�ֻ糪", 20);
		
		System.out.println("\n1. �⺻ Ÿ�� �迭 ����(sort)�� ���˴ϴ�.");
		int[] numbers = {56,34,89,45,99,88};
		String[] names = {"����","�質��","�ֻ糪","������","������","�̳���"};
		Arrays.sort(numbers);
		Arrays.sort(names); //String Ŭ������ �̹� Comparable �������̽� ��������
		System.out.println("int �迭 ���� ��� = " + Arrays.toString(numbers));
		System.out.println("int �迭 ���� ��� = " + Arrays.toString(names));
		
		System.out.println("\n2. User Ÿ�� �迭 ���� �մϴ�. - Comparator(����) �������̽� ���");
		User[] users = new User[5];
		users[0] = m1;
		users[1] = m2;
		users[2] = new User("������",22);
		users[3] = new User("������",21);
		users[4] = new User("�̳���",25);
		
		System.out.println("Members �迭 �ʱ� ���� = " + Arrays.toString(users));
		
		//�߿� : User Ŭ���� ��ü�� sort ����� ���� ���ڸ� �����մϴ�.
		//return int : ������ ����(��ġ)�� ��ȯ���� �ʴ� ���ǽ����� �ۼ��մϴ�. 
		//Comparator �͸� Ŭ������ �����ؼ� �������̽� Ÿ�� ������ ���Խ�Ų �� sort �޼ҵ� 2��° ���ڴ� ������ ����
		Comparator<User> ascName = new Comparator<User>() {
			//���� ���� : ascending
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}//���ڿ� compareTo�� ������ �� o1 < o2�̸� ����, o1 > o2 �̸� ��� ����
		};
		
		Arrays.sort(users,ascName);
		System.out.println("\nascName(name�ʵ� ���� ����) ���� ���� ���� = \n" + Arrays.toString(users));
		//Comparator<User> �������̽��� �͸� ���� ���� Ŭ���� 
		Comparator<User> desName = new Comparator<User>() {
			//���� ���� : descending
			@Override
			public int compare(User o1, User o2) {
				return o2.getName().compareTo(o1.getName());
			}//���ڿ� compareTo�� ������ ��
		};
		
		Arrays.sort(users,desName);
		System.out.println("\nascName(name�ʵ� ���� ����) ���� ���� ���� = \n" + Arrays.toString(users));
		
		
		Comparator<User> ascAge = new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getAge()-o2.getAge(); //o1<o2�� �� ����
			}
		};
		
		Arrays.sort(users,ascAge);
		System.out.println("\nascAge(age�ʵ� ���� ����) ���� ���� ���� = \n" + Arrays.toString(users));
		
		Comparator<User> desAge = new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o2.getAge()-o1.getAge();
			}
		};
		
		Arrays.sort(users,desAge);
		System.out.println("\nascAge(age�ʵ� ���� ����) ���� ���� ���� = \n" + Arrays.toString(users));
		
		users[0].setPoint(1234.23);
		users[1].setPoint(945.33);
		users[2].setPoint(888.11);
		users[3].setPoint(9991.23);
		users[4].setPoint(3456.67);
		
		
		//Comparator ���� Ŭ������ �����ؼ� sort �޼ҵ� 2��° ���ڴ� ���� Ŭ���� ��ü ����(new ����)���� ����
		Arrays.sort(users,new AscendingPointComparator()); //sort �޼ҵ� 2���� ���ڴ� ��ĳ����
		System.out.println("\n ponit �ʵ� �������� ���� AscendingPointComparator Ŭ����\n"
				+Arrays.toString(users));
		
		//�̷��� �ۼ��ϴ� ���� ���� ���� ����ϴ� �����Դϴ�.
		//Comparator Ÿ���� sort �޼ҵ� 2��° ���ڸ� �͸� Ŭ���� ��ü �������� �ٷ� ����
		Arrays.sort(users,new Comparator<User>(){
	                      @Override
	                      public int compare(User o1, User o2) {
		                  return (int)(o2.getPoint()-o1.getPoint());}});
		
		System.out.println("\n ponit �ʵ� �������� ���� AscendingPointComparator Ŭ����\n"
		+Arrays.toString(users));
}
}

package partB.day12;

import java.util.Arrays;

public class B04MemberTest {
	public static void main(String[] args) {
		B04Member momo = new B04Member();
		System.out.println("momo�� ��ü�� �ʱ� ����");
		System.out.println(momo.getId());
		System.out.println(momo.getName());
		System.out.println(momo.getAge());
		System.out.println(momo.getPoint());
		System.out.println(momo.getMessage());
		System.out.println("momo ��ü�� �ʵ尪 set");
		momo.setId("momo");
		momo.setAge(27);
		momo.setName("����");
		momo.setPoint(567.4);
		String[] msg = {"hi","��ο�","hello","����"};
		momo.setMessage(msg);
		System.out.println("==momo ��ü�� ���� ����==");
		System.out.println(momo.getId());
		System.out.println(momo.getName());
		System.out.println(momo.getAge());
		System.out.println(momo.getPoint());
		System.out.println(momo.getMessage());
		
		System.out.println(Arrays.toString(momo.getMessage()));
		System.out.println("===momo ��ü ���� ����===");
		System.out.println(momo.member());
		
		
		
	}

}

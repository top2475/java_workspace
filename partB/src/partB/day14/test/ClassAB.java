package partB.day14.test;

import partB.day14.ClassA;

public class ClassAB extends ClassA {
	
	public void test() {
		//�� �ʵ�(�ڽ� Ŭ������ ���� ���� ����) message�� �ٸ� ��Ű������ ��밡���� ������?
		//     ClassA�� ����߱� ������
		super.message= "�ٸ� ��Ű�� �ڽ� Ŭ�����Դϴ�.";
		this.message= "�ٸ� ��Ű�� �ڽ� Ŭ�����Դϴ�.";
		//message�� �θ��ʵ��̹Ƿ� �ڽ� ���忡���� super, this ��� ��� ����. ��Ȯ���� super
		System.out.println("�޼��� =" + message);
	}
	

}

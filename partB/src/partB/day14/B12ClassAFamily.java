package partB.day14;

public class B12ClassAFamily {
	
	public static void main(String[] args) {
		//�θ� ��ü ����
		ClassA cla1 = new ClassA();
		cla1.title="�θ�"; cla1.num=12; cla1.message="�׽�Ʈ";
		System.out.println("���� �θ� Ŭ���� : " + cla1.classA());
		
		//�ڽ� ��ü ����
		ClassAA claa1 = new ClassAA();
		System.out.println("�θ� Ŭ���� �ʵ忡 �� ����===");
		claa1.title = "���";
		claa1.num = 99;
		System.out.println("�ڽ� Ŭ���� classAA �ʵ忡 �� ����====");
		claa1.point = 101.11;
		
		System.out.println("�θ� Ŭ���� �޼ҵ� ���� =" + claa1.classA());
		System.out.println("num =" + claa1.num);
		claa1.message = "��ο�";
		System.out.println("protected �ʵ� ���� = " + claa1.message);
		//1)�ڽ� Ŭ������ �θ� Ŭ������ �ʵ�� �޼ҵ带 ����� �� ����(��. private�� ��� �ȵ�)
	}

}

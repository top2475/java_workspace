package partC.day17;

public class C01InterfaceATest {
	public static void main(String[] args) {
		System.out.println("1. InterfaceA�� ��� �ʵ� Ȯ��");
		System.out.println("SIZE = " + InterfaceA.SIZE);
		System.out.println("2. �������̽��� ���� ��ü�� �������� �ʽ��ϴ�.");
		//InterfaceA ia = new InterfaceA(); ����
		System.out.println("3. static �޼ҵ� �����ϱ�");
		InterfaceA.methodC();
		System.out.println("4. InterfaceA�� ���� Ŭ������ ��ü �����ϱ�");
		System.out.println("== ���� Ŭ���� Ÿ�� ������ �����ϱ� ==");
		ClassA ca = new ClassA();
		
		System.out.println("== �������̽� Ÿ�� ������ �����ϱ� ==");
		InterfaceA ia = new ClassA();
		
		System.out.println("5. ���� Ŭ������ �������̵� �޼ҵ� �����ϱ�");
		ca.setName("�趯��"); ca.methodA();
		
		//ia.setName("�ֻ糪"); //���� : ���� ������ InterfaceA�̹Ƿ� ����Ŭ������ �޼ҵ� ���� ����.
		System.out.println("== ia ������ Ÿ�� üũ ==" + (ia instanceof ClassA));
		ClassA cia = (ClassA) ia; cia.setName("�ֻ糪");
		ia.methodA(); //���� : InterfaceA�� �߻� �޼ҵ� ������ �� ����
		
		System.out.println("== methodB ���� ==");
		System.out.println(ca.methodB(123));
		System.out.println(ia.methodB(1123));
		
	}

}

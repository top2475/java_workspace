package partC.day17;


//�������̽� ���� ����
//�ڹ� ���̺귯���� ���� �������̽��� �װ��� ����� Ŭ�������� �����ϴ� ���� ����.
//�� �ľִ� �츮�� �������̽��� ����ϰ� ��
public interface InterfaceA {
	
//	1) �ʵ�� ����� ����. public static final ����. �ν��Ͻ� �ʵ� x
	int SIZE = 10; //��� �ʵ�. �ν��Ͻ� �ʵ�� ����� ����
//	2) �߻�޼ҵ带 ���� �ֽ��ϴ�. public abstract ���� ����
	void methodA();
	int methodB(int num);
//	3) static�޼ҵ�� �ν��Ͻ� �޼ҵ带 ����մϴ�.
	static void methodC() {
		System.out.println("���� static �޼ҵ� �Դϴ�.");}
//	4) �ν��Ͻ� �޼ҵ�( �ݵ�� Ű���� default ���)�� ����� �� ����
//	default Ű����� ���� ���� (������) �ƴϰ� �ν��Ͻ� �޼ҵ带 ��Ÿ��
	
default void methodD(int message) {
	System.out.println("���ŵ� �޼����� '" + message + "' �Դϴ�.");
}
}

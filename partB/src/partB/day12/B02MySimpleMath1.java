package partB.day12;

//�ڹ��� Math Ŭ���� �޼ҵ带 ������ �����غ���
//                �� static �޼ҵ� �Ǵ� static �ʵ� : Ŭ���� �̸����� ���
//���࿡ �ʿ��� main �޼ҵ带 �����ϸ� �� Ŭ������ ���̺귯�� Ŭ������ ����� ���ϴ�.

public class B02MySimpleMath1 {
	//�޼ҵ� �ñ״�ó : �޼ҵ� �̸��� �޼ҵ� ����(����, Ÿ�Կ� ���� ����)
	//**�޼ҵ� �����ε�(overloading) : �޼ҵ� �ñ״�ó �� ������ Ÿ�԰� ������ �ٸ���
	//                             ���� ������ ���� ��(��ɾ�� �ٸ� �� ����)
	//                             �޼ҵ� �̸��� �����ϰ� ����ϵ��� �ϴ� ��
	
	public static final double pi=3.14; //���� ����.(�ʵ�)
	                           //static final�� ���(����� �� �ִ� ��)
	public static double test = 1.345;
	                           //static �ʵ�. ����� �� �ִ� ��
	
	//�� ���� �Ǽ��� ���ϱ�
	public static double add(double value1, double value2) {
		return value1 + value2;
	}
	
	//�� ���� �Ǽ� ����
	public static double subtract(double value1, double value2) {
		return value1 - value2;
	}
	
	//�� ���� �Ǽ� ���� 
	public static double multiply(double value1, double value2) {
		return value1 * value2;
	}
	
	//�� ���� �Ǽ� ������ => ��
	public static double divide(double value1, double value2) {
		return value1 / value2;
	}

	//�� ���� �Ǽ� ������ => ������
	public static double remaind(double value1, double value2) {
		return value1 % value2;
	}
	//���ڰ� ���� �޼ҵ� " ����: �޼ҵ忡 ���޵Ǵ� ��, �Ű�����: ���ڰ��� �����ϱ� ���� ����� ����
	//���� �� �Ű������� ���� Ÿ�԰� ������ �޶����� �����ε�
	public static double remaind(double test) {
		return 0.0;}
 
	
	
	//�� ���� ������ ���ϱ�
	public static int add(int value1, int value2) {
		return value1 + value2;
	}
	
	//�޼ҵ� �����ε� ���� ���� : �Ű������� ������ ����(�� �ñ״���)�� ����.
	// ��źŸ�Ը� ����Ǵ� ���� �Ұ���
	//public static long add(int value1, int value2) {
	//	return value1 + value2;
	//}
	
	//�� ���� ���� ����
	public static long subtract(int value1, int value2) {
		return value1 - value2;
	}
	
	//�� ���� ���� ���� => long
	public static long multiply(int value1, int value2) {
		return value1*value2;
	}
	
	
	//�� ���� ���� ������ => ��
	public static int divide(int value1, int value2) {
		return value1 / value2;
	}

	//�� ���� ���� ������ => ������
	public static int remaind(int value1, int value2) {
		return value1 % value2;
	}
	
}

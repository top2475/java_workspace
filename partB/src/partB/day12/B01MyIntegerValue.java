package partB.day12;

public class B01MyIntegerValue {
	//Ŭ������ ����, ��ü�� ������ ���� ���� ��ü
	public static void main(String[] args) {
		//��ü ���� - new ���� ������ ��ü�� �����ϴ� ���� my1, my2
		B01MyIntegerValue1 my1 = new B01MyIntegerValue1();
		//������ �����Ͱ� �ٸ��� �� ��ü ����(���ο� ��ü)
		B01MyIntegerValue1 my2 = new B01MyIntegerValue1();
		
		//�ν��Ͻ� �ʵ忡 �� ����
		my1.value1 =23;    my1.value2 =45;
		my2.value1 = 987;  my2.value2 =345;
		
		
		//�ν��Ͻ� �޼ҵ� ����
		System.out.println("my1 ��� my1.value1 =" + my1.value1 + ", my1.value2 =" + my1.value2);
		int result = my1.add();
		System.out.println("my1.add() = " + result);
		System.out.println("my1.subtract() = " + my1.subtract());
		System.out.println("my1.multiply() = " + my1.multiply());
		System.out.println("my1.divide() = " + my1.divide());
		result = my1.remaind();
		System.out.println("my1.remaind() = " + result);
		
		
		System.out.println();
		System.out.println("my2 ��� my2.value1 =" + my2.value1 + ", my2.value2 =" + my2.value2);
		result = my2.add();
		System.out.println("my2.add() = " + my2.add());
		System.out.println("my2.subtract() = " + my2.subtract());
		System.out.println("my2.multiply() = " + my2.multiply());
		System.out.println("my2.divide() = " + my2.divide());
		result = my2.remaind();
		System.out.println("my2.remaind() = " + result);
		
		//3) private ���� �׽�Ʈ
		//���� �Ұ���. �ڹ� ��ü ���� ���м�(�ʵ� �Ǵ� �޼ҵ带 �ٸ� Ŭ�������� ���� ���� ���ϰ� ����)
		//Ư�� private �ʵ�� �б�/���⸦ ���� �޼ҵ尡 �ʿ�
		System.out.println("=====private ���� �׽�Ʈ=====");
		//my1.name = "����";
		my1.name("����");
		my1.printName();
		System.out.println("my1 ��ü�� name =" + my1.getName());
		
		
	}

}

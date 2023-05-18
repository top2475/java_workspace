package partC.day20;

public class C11StringToScoreList {
//�Լ��� �������̽� �׽�Ʈ	
//  �ڹٸ� ����� �ٸ� ���α׷��� ���� '->' ��ȣ�� �ٿ��� ���ϴ�.(���ٽ�) ������, ���Ἲ�� ���ؼ� ���
//  -> ȭ��ǥ ������ �Ű���������(����), ȭ��ǥ �������� �޼ҵ� ����.
	public static void main(String[] args) {
		
		System.out.println("1. �͸�Ŭ������ �������̽� ����ü ����");
		FunctionEx fex1 = new FunctionEx() {
			
			@Override
			public int exmethod(int a, int b) {
				System.out.println("exmethod ���� ���� a+b*a : a =" +a + ", b =" +b);
				return a+b*a;
			}
		};
		System.out.println("fex1 �Լ� �������̽� ���� ��� =  " + fex1.exmethod(3,4));
		
		System.out.println("2. ���ٽ����� (�͸� Ŭ���� �������̽� ����ä) �޼ҵ� ����");
		FunctionEx fex2 = (int a, int b) -> {
			System.out.println("exmethod ���� ���� a*b*11 : a =" + a + ", b =" + b);
			return a*b*11;
		};
		System.out.println("fex1 �Լ� �������̽� ���� ��� =  " + fex2.exmethod(3,4));
		
		System.out.println("\n3. switch ���� ���ٽ����� �غ��ô�.");
		char op= '+'; int result=0;
		switch (op) {
		  case '+' -> result = 11+22;
		  case '-' -> result = 55-22;
		  case '*' -> result = 11*22;
		  case '/' -> result = 66/22;
			
		}
		System.out.println(result);
		
		System.out.println("\n4. IShape �׽�Ʈ");
		System.out.println("=== �͸� Ŭ���� ����(����ä) �� �ﰢ������ �Ѵٸ� ===");
		IShape triangle = (int a, int b) -> {
			return a*b/2;
			};
		System.out.println("triangle.area(10, 20) = " + triangle.area(10, 20));
		
		System.out.println("=== �͸� Ŭ���� ����(����ä)�� ������ �Ѵٸ� ===");
		IShape circle = (int radius, int dammy) -> {
			return (int)(radius*radius*Math.PI);
		};
		System.out.println("circle.area(10, 0) = " + circle.area(10, 0));
		
	}
		
			
	
	}


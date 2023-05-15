package partB.day15;

import partB.day14.Circle;
import partB.day14.LadderShape;
import partB.day14.Shape;
import partB.day14.Triangle;

public class B14ShapeV2Test {
	
	public static void main(String[] args) {
		
		LadderShape ls = new LadderShape("��� ��ٸ���",7,9,14);
		LadderShape ls2 = new LadderShape("��� ��ٸ���",7,9,14);
		Circle c = new Circle(13);
		
		ls.iamLadder();
		System.out.println();
		c.iamCircle();
		
		//1)Ŭ���� ĳ����1 : �θ� Ÿ������ �ڽ� ��ü�� ������ �� �ֽ��ϴ�.(�ڵ� ĳ����)
		Shape sh1 = new LadderShape("�糪 ��ٸ���", 17, 13, 21);
		Shape sh2 = new Triangle();
		Shape sh3 = new Circle(9);
		
		Shape sh4 = ls;  //���� ��� ��ٸ��� ��ü�� �������� sh4�� ����
		Shape sh5 = c;
		
		//sh4.iamLadder();
		//sh4�� ls�� ������ ��ü�� �����ϰ� �ִ� ��..but, Ÿ�Կ� ���� �޼ҵ� ȣ�� ���� �������ϴ�.
		//sh5.iamCircle(); ����
		//sh1.iamLadder(); ���� : LadderShape ��ü������ �θ�Ÿ�� sh1���� ����
		//sh3.iamCircle();
		
		//2)Ŭ���� ĳ����2 : �ڽ� Ÿ�� ������ �θ�Ÿ�� ���� ��ü�� ��ȯ�� �� �ֳ���? No(���� ĳ����)
		//LadderShape ls2 = sh1; //LadderShape ��ü������ �θ�Ÿ������ ���� ��.
		ls2 = (LadderShape)sh1;		
		ls2.iamLadder();	
		
		System.out.println("�θ� Ÿ�� ��ü�� ������ �����Ͽ� �ڽ�Ÿ�� ������ ������Ű��");
		//LadderShape shape = (LadderShape)new Shape("����",0,0);  //���������δ� ���������� Exception �߻�
		//shape.iamLadder(); //���� ��ü�� Shape �̹Ƿ� ����
		
		//����. �Ʒ� ��ɾ�� ���� ����?
		System.out.println("Circle ��ü�� Shape Ÿ������ �����ϰ� �װ��� �ٽ� LadderShape���� ĳ���� ����?");
		//LadderShape ls3 = (LadderShape)sh5; //���������� ����
		//ls3.iamLadder(); //���� ��ü�� Circle �̹Ƿ� ����
		
		//�ڽ� Ŭ������ �޼ҵ� iamLadder()�� ���� ��ü��  LadderShape �� ���� �������� ����
		
		//3)���� ĳ���ÿ��� Ÿ�� üũ�� �ʿ�. - instance of
		System.out.println("Shape Ÿ������ �����ϴ� ���� sh1~5�� ���� LadderShape ���� �˻�.====");
		System.out.println("sh1 instanceof LadderShape = " + (sh1 instanceof LadderShape));
		System.out.println("sh2 instanceof LadderShape = " + (sh2 instanceof LadderShape));
		System.out.println("sh3 instanceof LadderShape = " + (sh3 instanceof LadderShape));
		System.out.println("sh4 instanceof LadderShape = " + (sh4 instanceof LadderShape));
		System.out.println("sh5 instanceof LadderShape = " + (sh5 instanceof LadderShape));
		
		System.out.println("Shape Ÿ������ �����ϴ� ���� sh1~5�� ���� Circle ���� �˻�.====");
		System.out.println("sh1 instanceof Circle = " + (sh1 instanceof Circle));
		System.out.println("sh2 instanceof Circle = " + (sh2 instanceof Circle));
		System.out.println("sh3 instanceof Circle = " + (sh3 instanceof Circle));
		System.out.println("sh4 instanceof Circle = " + (sh4 instanceof Circle));
		System.out.println("sh5 instanceof Circle = " + (sh5 instanceof Circle));
		
		Shape shape =new Shape("����", 10, 10);
		System.out.println("�θ� Shape ��ü�� LadderShape �Ǵ� Circle ���� �˻� ===");
		System.out.println("shape instanceof LadderShape = " + (shape instanceof LadderShape));
		System.out.println("shape instanceof Circle = " + (shape instanceof Circle));
		//4)��� : instance of�� üũ�� Ÿ���� true�� ��쿡�� �ش� Ŭ������ �ٿ�(����) ĳ������ �� �� �ֽ��ϴ�.
	}

}

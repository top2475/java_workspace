package partB.day14;

public class B13ShapeTest {
	
	public static void main(String[] args) {
		
		
		//Shape,Triangle,Circle ��ü�� 1���� ����. �������� s,t,c
		Shape s = new Shape("����",100,100);
		Triangle t = new Triangle();
		Circle c = new Circle(65.3);
		LadderShape l = new LadderShape("��ٸ���", 10, 10, 20);
		
		System.out.println(s.toString());
		System.out.println(s); //��ü �ڿ� .toString()������ �ڵ�.
		System.out.println(t.toString());
		System.out.println(t);
		System.out.println(c.toString());
		System.out.println(c);
		System.out.println(l.toString());
		System.out.println(l);
		
		//�׽�Ʈ�� Shape�� toString�� �ּ� ó�� �� ����
		//����� toString()�� �ٽ� ������ ���� ���� ���� �Ʒ��� ����
		//���� ���� �ʵ� �� ����ϱ� ���� toString() �޼ҵ带 �ٽ� ������ ��.
		/*partB.day14.Shape@cac736f
          partB.day14.Shape@cac736f
          partB.day14.Triangle@5e265ba4
          partB.day14.Triangle@5e265ba4
          partB.day14.Circle@156643d4
          partB.day14.Circle@156643d4
		 */
		System.out.println("3�� ������ ���̸� ������.");
		System.out.println("s ���� =" +s.area());
		t.setWidth(100); t.setHeigth(78);
		System.out.println("t ���� =" +t.area());
		System.out.println("c ���� =" +c.area());
		System.out.println("l ���� =" +l.area());
		
	
	}

}

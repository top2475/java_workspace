package partB.day14;

public class Circle extends Shape{
	
	//������ ������
	private double radius;

	public double getRadius() {return radius;}

	public void setRadius(double radius) {this.radius = radius;}
	
	//�ڽ� Ŭ���� Ŀ���� ������
	public Circle(double radius) {
		super("��",2*(int)radius,2*(int)radius); //�� ũ���� ������ ������ �ʺ�, ����
		this.radius = radius;}
	
	//day15�� �߰�. �ڽ� LadderShape�� �ν��Ͻ� �޼ҵ�
		public void iamCircle() {
			System.out.println(" I am Circle. -" + super.getShapeName());
			System.out.println("������ = " + radius);
		}
		
	@Override
	public int area() {
		return (int)(Math.PI * radius * radius);}
	//�θ� area()�޼ҵ� ���� Ÿ������ ĳ����.���u Ÿ���� �����ϸ� �������̵��� �ƴ�.
	

}

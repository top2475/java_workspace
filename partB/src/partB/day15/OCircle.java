package partB.day15;

public class OCircle extends AShape {

	private double radius;
	
	public void iamCircle() {
		System.out.println("I am Circle. -" + super.shapeName);
		System.out.println(", ������ = " + this.radius);}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public OCircle() {
		System.out.println("�ڽ�Ŭ���� OCircle�� �⺻ ������ ���� �Ϸ�!");
	}
	
	public OCircle(double radius) {
		super("�⺻����� ��");
		System.out.println("�ڽ�Ŭ���� OCircle Ŀ���� ������ ���� �Ϸ�!!");
		this.radius = radius;
		}
	
	
	@Override
	public void resize(int size) {
		this.radius += size;
	}

	@Override
	public int area() {
		return (int) (Math.PI * radius * radius);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", ������ = " + this.radius;
	}

}

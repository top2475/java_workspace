package partB.day15;

public class OCircle extends AShape {

	private double radius;
	
	public void iamCircle() {
		System.out.println("I am Circle. -" + super.shapeName);
		System.out.println(", 반지름 = " + this.radius);}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public OCircle() {
		System.out.println("자식클래스 OCircle의 기본 생성자 실행 완료!");
	}
	
	public OCircle(double radius) {
		super("기본모양의 뭔");
		System.out.println("자식클래스 OCircle 커스텀 생산자 실행 완료!!");
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
		return super.toString() + ", 반지름 = " + this.radius;
	}

}

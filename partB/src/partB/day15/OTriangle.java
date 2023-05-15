package partB.day15;

public class OTriangle extends AShape{
//The type OTriangle must implement the inherited abstract method AShape.resize(int)
//OTriangle 클래스는 상속받은 추상 메소드resize(int)를 구형해야함
//추상 클래스의 자식 클래스는 쿠상 메소드를 모두 재정의해야한다.
	
	private int angle;
	
	public int getAngle() {return angle;}

	public void setAngle(int angle) {this.angle = angle;}

	public OTriangle() {System.out.println("자식클래스 OTriangle의 기본 생성자 실행 완료!");}
	
	public OTriangle(int angle) {this.angle = angle;}
	
	@Override
	public void resize(int size) {this.angle += size;}
	
	@Override
	public int area() {return width*height/2;}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

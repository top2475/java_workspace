package partB.day15;

public class OTriangle extends AShape{
//The type OTriangle must implement the inherited abstract method AShape.resize(int)
//OTriangle Ŭ������ ��ӹ��� �߻� �޼ҵ�resize(int)�� �����ؾ���
//�߻� Ŭ������ �ڽ� Ŭ������ ��� �޼ҵ带 ��� �������ؾ��Ѵ�.
	
	private int angle;
	
	public int getAngle() {return angle;}

	public void setAngle(int angle) {this.angle = angle;}

	public OTriangle() {System.out.println("�ڽ�Ŭ���� OTriangle�� �⺻ ������ ���� �Ϸ�!");}
	
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

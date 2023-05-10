package partB.day14;

//�ﰢ�� Ŭ����
public class Triangle extends Shape{
	//�ڽ� Ŭ������ �ʵ�� �޼ҵ�
	private int angle;     //�ﰢ���� ����

	public int getAngle() {return angle;}

	public void setAngle(int angle) {this.angle = angle;}
	
	//�����ִ� �⺻ ������
	public Triangle() {
		//super(); ���� : super �⺻�����ڴ� Shape Ŭ������ ����
		super("���� ��",0,0); //super Ŀ���� �����ڸ� ȣ���ϸ� �����ذ�
	}
	
	//�θ� Ŭ������ area()�޼ҵ带 �ﰢ�� ���� �������� ������
	@Override
	public int area() {return super.area()/2;}
	
	//�޼ҵ� ������(Overriding) : �θ� Ŭ������ ������ �޼ҵ� ������ �ڽĿ� �µ���
	//                         �Ǵ� �ʿ��� ó�� ������� �ٽ� �����ϴ� ��
}

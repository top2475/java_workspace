package partB.day14;


public class LadderShape extends Shape{
	
	private int topLength;     //����
	private int bottomLength;  //�Ʒ���
	
	public int getTopLength() {return topLength;}
	public void setTopLength(int topLength) {this.topLength = topLength;}
	public int getBottomLength() {return bottomLength;}
	public void setBottomLength(int bottomLength) {this.bottomLength = bottomLength;}
	
	public LadderShape(String shapName,int height,int topLength,int bottomLength) {
		super(shapName,0,height);
		this.topLength = topLength;
		this.bottomLength = bottomLength;}
	//�θ� Ŭ������ width=0 ���� ������� ����. ������/getter,setter/toString ������
	//��ٸ��� ���� ���ϴ� �������� �޼ҵ� ������ �غ�����(����+�Ʒ���)*����/2
	@Override
	public int area() {
		int sum = topLength + bottomLength;
		return sum*getHeigth()/2;}
	

	
	//toString ������ �ϼ���. Shape�� toString() Ȱ���Ϸ���?
	@Override
	public String toString() {
		return super.toString() + ", ���� : " + topLength + " , �Ʒ��� : " + bottomLength;
	}
	}


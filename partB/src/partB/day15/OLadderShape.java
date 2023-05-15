package partB.day15;

public class OLadderShape extends AShape{
	
	private int topLength;
	private int bottomLength;
	
	
	//day15�� �߰�. �ڽ� LadderShape�� �ν��Ͻ� �޼ҵ�
	public void iamLadder() {
		System.out.println("I am Ladder. -" + super.shapeName);
		System.out.println("���� =" + this.topLength + "�Ʒ��� =" + this.bottomLength);}
	
	public int getTopLength() {return topLength;}
	public int getBottomLength() {return bottomLength;}
	public void setTopLength(int topLength) {this.topLength = topLength;}
	public void setBottomLength(int bottomLength) {this.bottomLength = bottomLength;}
	
	public OLadderShape() {System.out.println("�ڽ�Ŭ���� OLadderShape�� �⺻ ������ ���� �Ϸ�!");}
	
	public OLadderShape(String shapName,int height,int topLength,int bottomLength) {
		System.out.println("�ڽ�Ŭ���� OLadderShape�� Ŀ���� ������ ���� �Ϸ�!");
		this.height = height;
		this.topLength = topLength;
		this.bottomLength = bottomLength;}
	
	@Override
	public void resize(int size) {this.topLength += size;}
	public void resize1(int size) {this.bottomLength += size;}
	@Override
	public int area() {
		int sum = topLength + bottomLength;
		return sum*super.height/2;}
	
	@Override
	public String toString() {
		return super.toString() + ", ���� : " + topLength + " , �Ʒ��� : " + bottomLength;
	}

}

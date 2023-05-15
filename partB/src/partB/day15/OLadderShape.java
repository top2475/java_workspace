package partB.day15;

public class OLadderShape extends AShape{
	
	private int topLength;
	private int bottomLength;
	
	
	//day15에 추가. 자식 LadderShape의 인스턴스 메소드
	public void iamLadder() {
		System.out.println("I am Ladder. -" + super.shapeName);
		System.out.println("윗변 =" + this.topLength + "아랫변 =" + this.bottomLength);}
	
	public int getTopLength() {return topLength;}
	public int getBottomLength() {return bottomLength;}
	public void setTopLength(int topLength) {this.topLength = topLength;}
	public void setBottomLength(int bottomLength) {this.bottomLength = bottomLength;}
	
	public OLadderShape() {System.out.println("자식클래스 OLadderShape의 기본 생성자 실행 완료!");}
	
	public OLadderShape(String shapName,int height,int topLength,int bottomLength) {
		System.out.println("자식클래스 OLadderShape의 커스텀 생성자 실행 완료!");
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
		return super.toString() + ", 윗변 : " + topLength + " , 아랫변 : " + bottomLength;
	}

}

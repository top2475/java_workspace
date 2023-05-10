package partB.day14;


//'���� - �ﰢ��,�簢��,��,...'���� �θ� Ŭ����
public class Shape {
	
	private String shapeName; //���� �̸�
	private int width;        //���� �ʺ�
	private int height;       //���� ����
	
	//������
	public Shape(String shapeName, int width, int height) {
		this.shapeName = shapeName;
		this.width = width;
		this.height = height;}
	
	//���̸� ���ϴ� �ν��Ͻ� �޼ҵ带 ����
	public int area() {
		return width*height;
	}
	
	
	
	//toString�� ������
	@Override //������
	public String toString() {
		return String.format("���� �̸� : %s, �ʺ� : %d, ���� : %d",
				shapeName,width,height);
	}
	
	//getter,setter
	public String getShapeName() {return shapeName;}
	public void setShapeName(String shapeName) {this.shapeName = shapeName;}
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public int getHeigth() {return height;}
	public void setHeigth(int height) {this.height = height;}


	

}

package partB.day13;

//�Һ� ��ü�� �����ϴ� ����
//1. �ʵ�� ��� final 2.Ŀ���� �����ڷ� ��� �ʵ� �ʱ�ȭ  3.getter �޼ҵ常 ����
public class B09User {
	//��� ���� ����
	private static final double MAX_POINT = 10000;  //point �ʵ尪 �ֳ��� 10000
	
	
	//final�� ���� ������ �Ұ���
	private final String id;
	private final String name;
	private final int age;
	private double point;
	
	//Ŀ���� ������
	public B09User(String id, String name, int age, double point) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.point=point;
	}
	
	//��� �ʵ尪 ��� ���ڿ�
	public String user() {
		return String.format("id=%s, name=%s, sge=%d, point=%.2f",
				id,name,age,point); }
	
	//������ �ʿ��� �ʵ� point�� setter�޼ҵ�
	public void setPoint(double point) {
		//if(point <= MAX_POINT) this.point = point; else this.point = MAX_POINT;
		this.point = Math.min(point, MAX_POINT);} //if �Ⱦ��� ����� �ڵ�
	
	//getter,setter
	public String getId() {return id;}

	public String getName() {return name;}

	public int getAge() {return age;}

	public double getPoint() {return point;}
	
	//�Ʒ� setter�� ���� : final �ʵ�� ���� �Ұ�
	//public void setId(String id) {this.id=id;}
	//public void setName(String name) {this.name=name;}
	
	

}

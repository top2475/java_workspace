package partB.day14;

public class ClassA {
	
	public int num;
	String title;
	protected String message;
	private String name;
	
	
	//�⺻ ������ : �ڽ� Ŭ������ �⺻ �����ڳ� ��ü�� ������ �� �ֵ��� �մϴ�.
	public ClassA() {this.message = "hello~";}
	
	//��ü �ʵ� �ʱ�ȭ�ϴ� ����
	public ClassA(int num, String title, String message, String name) {
		this.num=num;
		this.title= title;  //�⺻ package ���� ������ ���� ��Ű�������� ���.
		this.message= message;
		this.name= name;
	}
	
	//private �ʵ�� getter, setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) { //������Ʈ ���� : name�� ���� 0�̸� ���� �߻�
		this.name = name;
	}
	
	//�Ϲ����� �ν��Ͻ� �޼ҵ� : �ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼ҵ带 ����մϴ�.
	public String classA() {
		return name + "," + title + "," + message;
	}
	
	//static �޼ҵ� : ���� �������� ����. �ν��Ͻ� �ʵ带 ������� �ʱ� ������ ����
	public static void family() {
		System.out.println("class �θ� Ŭ�����Դϴ�.");
	}

}

package partC.day19.review;

public abstract class Animal {
	//static : ���� ������(�ڿ�) // �߻�Ŭ�����̴�.
	static final String TYPE ="����";
	
	//�ν��Ͻ� �ʵ�(Ŭ������ ���� Ư��)
	private String color;
	private String name;    //���� �̸� ��)����
	
	//������
	public Animal() {
		System.out.println("���ο� �ݷ����� ������ ������ϴ�.");
	}
	
	public Animal(String color) {
		this();		//�⺻������ �޼ҵ� ȣ��
		this.color=color;
	}
	
	//�߻�޼ҵ�: �������� ���
	public abstract void sound();
	public abstract String getType(); //������. ���� ��� �񱳸� ���ؼ� �ۼ�-�� �ʿ����� ����

	
	//�Ϲ� �ν��Ͻ� �޼ҵ�
	//�ʵ尡 private �̸� �а� ���� -> getter, setter
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

package partC.day17;

//InterfaceA�� ���� Ŭ����(����ü, ��ü)
//InterfaceA�� �߻�޼ҵ带 �� ����(����)�ؾ� �մϴ�.
public class ClassA implements InterfaceA{
	
	//�ν��Ͻ� �ʵ�
	private String name;
	
	//�ν��Ͻ� �޼ҵ�
	public String getName() { return name;}
	public void setName(String name) {  this.name = name;}
	public String hello() {
		return "Hello~" + name;
	}
	
	//InterfaceA�� �߻� �޼ҵ� ����
	@Override
	public String toString() {
		return "[name = " + name + "]";
	}
	
	@Override
	public void methodA() {
		System.out.println("InterfaceA�� methodA ����(����)�մϴ�. =>" + name);
	}
	
	@Override
	public int methodB(int num) {
		System.out.println("InterfaceA�� methodB ����(����)�մϴ�. =>" + name);
		return 999+num;
	}

}

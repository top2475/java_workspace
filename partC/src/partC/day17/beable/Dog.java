package partC.day17.beable;

public class Dog implements Runnable{
	
	private String name;
	
	@Override
	public String run(int speed) {
        return "name = " + name + ", speed = " + speed + "�޸��� ���մϴ�.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//�θ� �������̽� �߻� �޼ҵ� �����ϱ�
	@Override
	public String beAble() {
		return "Runnable";
	}

}

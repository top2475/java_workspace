package partC.day17.beable;

public class Dog implements Runnable{
	
	private String name;
	
	@Override
	public String run(int speed) {
        return "name = " + name + ", speed = " + speed + "달리기 잘합니다.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//부모 인터페이스 추상 메소드 정의하기
	@Override
	public String beAble() {
		return "Runnable";
	}

}

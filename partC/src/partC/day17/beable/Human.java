package partC.day17.beable;

public class Human implements Thinkable, Cookable, Runnable{
	//Runnable
	@Override
	public String run(int speed) {
		// TODO Auto-generated method stub
		return "����� " + speed + " km/h �� �� �޸��ϴ�.";
	}
	@Override
	public void cook(String material) {
		System.out.println("�����" + material + "���� �丮�� �� �մϴ�.");
	}
	@Override
	public void think() {
		System.out.println("����� ������ â�������� �մϴ�.");
		
	}
	@Override
	public int calculate(int a, int b) {
		if(a>=99999 && b>=99999) {
			System.out.println("����� �ϻ����� ������ �� ���� ���Դϴ�.");
			return -99999999;
		}else {
		System.out.println("�������� �ϻ��մϴ�.");	
		return a+b;
		}
	}
	@Override
	public String beAble() {
		return null;
	}

}

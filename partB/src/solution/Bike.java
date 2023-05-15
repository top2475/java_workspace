package solution;

public class Bike extends Product{
	
	@Override
	public String sell(Object oj) {
	    return String.format("�߰� ���� ��� - %d %% ����", oj);
	}
	
	private int speed;
	
	Bike() {
		
	}
	
	
	public Bike(int price, String prdName, int speed) {
		this.price = price;
		this.prdName = prdName;
		this.speed = speed;
	}
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString() {
	    return "������ - " + super.toString() + ", �ӵ�: " + speed + "km/h";
	}

}

class Electronics extends Product{

	
	public String toString() {
	    return "������ǰ - " + super.toString();
	}
	
	@Override
	
	public String sell(Object oj) {
		return String.format("���� ��ǰ - %s(1set)",oj);
	}


		
}

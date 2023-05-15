package solution;

public class Bike extends Product{
	
	@Override
	public String sell(Object oj) {
	    return String.format("추가 할인 행사 - %d %% 인하", oj);
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
	    return "자전거 - " + super.toString() + ", 속도: " + speed + "km/h";
	}

}

class Electronics extends Product{

	
	public String toString() {
	    return "전자제품 - " + super.toString();
	}
	
	@Override
	
	public String sell(Object oj) {
		return String.format("묶음 상품 - %s(1set)",oj);
	}


		
}

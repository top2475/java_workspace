package koreait;
public class Bike extends Product{
	//[5]
		private int speed;
		
		
		public int getSpeed() {
			return speed;
		}


		public void setSpeed(int speed) {
			this.speed = speed;
		}
		//[6]
		public Bike(){}
		
		
		public Bike(int price,String prdName,int speed) {
			super();
			this.price = price;
			this.prdName = prdName;
			this.speed = speed;
		}
		//[8]
			public String ride() {
			return "����� �̰��� �ü� "  + speed + "km�� Ż �� �ֽ��ϴ�.";
			}
			//[10]
			@Override
			public String toString() {
				return super.toString()+ ", ���ǵ� : " + speed;
			}


		//[3]
		@Override
		public String sell(Object object) {
			return String.format("�߰� ���� ��� - %s %% ����", object);
			

		}
	}

	class Electronics extends Product{
		
		//[7]
		private double kwh;
		
		public double getKwh() {
			return kwh;
		}

		public void setKwh(double kwh) {
			this.kwh = kwh;
		}
		//[9]
		public double power() {
			return kwh*24;
		}
		

		//[4]
		@Override
		public String sell(Object object) {
			return String.format("���� ��ǰ - %s(1set)", object);
		}//[10]
		@Override
		public String toString() {
			return super.toString() + String.format(", kwh : %.2f",kwh);
		}
		
	}

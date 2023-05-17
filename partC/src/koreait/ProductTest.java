package koreait;

//理쒗삙由�
public class ProductTest {
	public static void main(String[] args) {
		
		
		//[2-1]
		Product[] cart = new Product[10];
		
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "삼천리", 15);
		
		cart[1] = new Electronics();
		cart[1].price=35000; cart[1].prdName="USB";
		cart[5] = new Electronics();
		cart[5].price=117000; cart[5].prdName="ipad";
		cart[7] = new Electronics();
		cart[7].price=2250000; cart[7].prdName="lg냉장고";
		//실행 예시 출력
		System.out.println("[3]출력>>>" +cart[0].sell(20));
		System.out.println("[4]출력>>>" +cart[1].sell("사운드바"));
		//[2-2]
		Electronics E = (Electronics)cart[7];
		E.setKwh(0.9);
		System.out.println("[2-2] 출력 =>"+ E.power());
		//[2-3]
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] != null && cart[i].price >= 100000) {
				if(cart[i] instanceof Bike) {
					Bike b = (Bike)cart[i];
					System.out.println(b.toString());
				}//bike 캐스팅
				if (cart[i] instanceof Electronics) {
					Electronics e = (Electronics)cart[i];
					System.out.println(e.toString());
				}//Electronics 캐스팅
			}
		}
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] != null && cart[i] instanceof Bike) {
				Bike B = (Bike)cart[i];
				System.out.println("[2-4] 출력 =>" + B.ride());
			}
			
		}
		
		
	}

}
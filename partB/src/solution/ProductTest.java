package solution;

/*
�ۼ��� : XXX  
*/
public class ProductTest {


	public static void main(String[] args) {

		//����1-[3] �׽�Ʈ
		Bike bike = new Bike(); System.out.println(bike.sell(20));
		//����1-[4] �׽�Ʈ
		Electronics elec = new Electronics(); System.out.println(elec.sell("�����"));


		//����2 -[1]
		Product[] cart = new Product[10];

		cart[0] = new Bike(123000,"MTB",25);
		cart[3] = new Bike(99000,"��õ��",25);

		//Electronics Ŀ���� �����ڷ� �ʵ� �ʱ�ȭ
		cart[1] = new Electronics(); 
		cart[1].price=35000; cart[1].prdName="USB";

		cart[5] = new Electronics();
		cart[5].price=117000; cart[5].prdName="ipad";

		cart[7] = new Electronics();
		cart[7].price=2250000; cart[7].prdName="lg �����";

		//����2 -[3]
		for(int i=0;i<cart.length;i++) {
			if(cart[i]!=null && cart[i].price >= 100000) {
				System.out.println("cart index=" + i + ",��ǰ��=" + cart[i].prdName 
						+ ",����=" + cart[i].price);  //toString()�� �������� �ڵ��ϼ���.
			}
		}
	}
}
package partB.day13;

public class B06ProductTest {
	
	public static void main(String[] args) {
		B06Product tv //new �������� ������ ��ü�� �����ϴ� ���� tv ���� 
	= new B06Product(); //new Product();���� new �ڿ� ������ Product() ������ ȣ��

	B06Product audio = new B06Product("LG������� �����");
	System.out.println(audio.product());
	
	B06Product notebook = new B06Product(76763434, "LG�׷�" , 2200000, "LG");
	System.out.println(notebook.product());
	
	B06Product snack = new B06Product(5500, "������");
	System.out.println(snack.product());
	
	B06Product pizza = new B06Product("���̳� ������ũ����",32000, "���̳�");
	System.out.println(pizza.product());
	}
}
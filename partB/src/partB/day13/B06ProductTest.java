package partB.day13;

public class B06ProductTest {
	
	public static void main(String[] args) {
		B06Product tv //new 연산으로 생성된 객체를 참조하는 변수 tv 선언 
	= new B06Product(); //new Product();에서 new 뒤에 나오는 Product() 생성자 호출

	B06Product audio = new B06Product("LG블루투스 오디오");
	System.out.println(audio.product());
	
	B06Product notebook = new B06Product(76763434, "LG그램" , 2200000, "LG");
	System.out.println(notebook.product());
	
	B06Product snack = new B06Product(5500, "오리온");
	System.out.println(snack.product());
	
	B06Product pizza = new B06Product("도미노 스테이크피자",32000, "도미노");
	System.out.println(pizza.product());
	}
}
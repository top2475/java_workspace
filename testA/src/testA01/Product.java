package testA01;

//[2] Product 클래스를 추상클래스로 변경하고
public abstract Product {
	//[1] Product 클래스에 문자열 타입 ‘상품명’ 필드와 정수형 타입 ‘가격’ 필드를 각각 선언하세요.
	//필드명은 prdName, price 입니다.
	// 필드 접근 한정자를 protected로 합니다
	protected String prdName;
	protected int price;
	
        public Product() {}  //기본 생성자
	
     	public Product(String prdName, int price) { //커스텀 생성자
		super();
		this.prdName = prdName;
		this.price = price;
	}
	
	//sell 이라는 추상메소드를 pubic 으로 선언하세요. : 메소드의 리턴타입은 String, 인자는 Object 1개 입니다
	public abstract String cell(Object object);
	
	
	
}

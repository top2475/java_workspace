package partB.day13;

import java.util.Arrays;

//쇼핑몰에서 구입할 상품정보를 저장하는 예시로 클래스 정의. 생성자 메소드 오버로딩이 핵심
public class B06Product {
	//인스턴스 필드 (전역 변수)
	private long code;
	private String productName;
	private long price;
	private String company;
	
	//생성자는 클래스와 이름이 같은 메소드 입니다. 리턴 타입은 없는 형식.
	//클래스 내부에 생산자 선언을 생략했다면, 컴파일러는 중괄효{}블럭 내용이
	//비어있는 기본 생성자(Default Constructor)를 바이트 코드에 자동으로 추가
	//생성자도 메소드이므로 오버로딩이 가능합니다.
	//this() 또는 this(매개변수들) 와 같이 생성자 호출도 가능합니다.
	public B06Product() { //기본생성자, code 필드의 초기값 변경
		this.code = 999999999L; //맨뒤에 L은 long 타입 리터럴 표시}
	}
	
	public B06Product(String productName) {//생성자 역활은 초기화
		this(); //기본 생성자 호출. 다른 생성자 메소드 호출은 항상 맨앞에
		this.productName = productName;
	}
	
	//public Product(String company) {this.company=company;}
	//메소드 시그니처(인자 형식과 개수) 동일한 2개가 동시에 존재 못함
	
	public B06Product(long price) {this.price=price;}
	
	public B06Product(long price, String company) {
		this.price = price;
		this.company = company;
	}
	
	public B06Product(String productName, long price, String company) {
		this.productName = productName;
		this.price = price;
		this.company = company;
	}
	
	//모든 필드값을 초기화하는 생성자를 만들어 보세요. 매개변수 4개 모두 받는 형식
	public B06Product(long code, String productName, long price, String company) {
		super();
		this.code = code;
		this.productName = productName;
		this.price = price;
		this.company = company;
	}
	//getter
	public long getCode() { return this.code;}
	public String getProduckName() {return this.productName;}
	public long getPrice() {return this.price;}
	public String getCompany() {return this.company;}
	
	//setter
	public void setCode(long code) {this.code = code;}
	public void setProductName(String productName) {
		this.productName = productName;}
	public void setPrice(long price) {this.price = price;}
	public void setCompany(String company) {this.company = company;}
	
	//모든 필드값으로 문자열 생성
	public String product() {
		return String.format("code(상품코드)=%s, productName(제품명)=%s, price(가격)=%d, company(제조사)=%s",
				code,productName,price,company);
	}
	
	

}

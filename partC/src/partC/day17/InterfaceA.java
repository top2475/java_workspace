package partC.day17;


//인터페이스 형식 연습
//자바 라이브러리의 많은 인터페이스와 그것을 사용한 클래스들을 이해하는 것이 목적.
//그 후애는 우리도 인터페이스를 사용하게 됨
public interface InterfaceA {
	
//	1) 필드는 상수만 있음. public static final 생략. 인스턴스 필드 x
	int SIZE = 10; //상수 필드. 인스턴스 필드는 사용을 못함
//	2) 추상메소드를 갖고 있습니다. public abstract 생략 가능
	void methodA();
	int methodB(int num);
//	3) static메소드와 인스턴스 메소드를 사용합니다.
	static void methodC() {
		System.out.println("나는 static 메소드 입니다.");}
//	4) 인스턴스 메소드( 반드시 키워드 default 사용)를 사용할 수 있음
//	default 키워드는 접근 권한 (한정자) 아니고 인스턴스 메소드를 나타냄
	
default void methodD(int message) {
	System.out.println("수신된 메세지는 '" + message + "' 입니다.");
}
}

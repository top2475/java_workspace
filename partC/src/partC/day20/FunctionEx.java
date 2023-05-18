package partC.day20;

//함수형 인터페이스 정의
//인터페이스 중에 *추상메소드가 1개인 것*은 다른 프로그래밍 언어에서 사용되는 __함수__의 형식으로 표현 할 수 있습니다.
//   함수와 메소드 공통점은 인자와 리턴값이 있다는 것. 다른 점은 메소드는 클래스(또는 객체)에 구성 요소로 포함
//   자바를 비롯한 다른 프로그래밍 언어에서 '->' 기호로 줄여서 씁니다.(람다식) 가독성, 간결성을 위해서 사용
//   -> 화살표 왼쪽은 매개변수선언(인자), 화살표 오른쪽은 메소드 내용.
//자바 라이브러리에는 인자의 형식과 개수와 리턴 타입 등 여로 유형에 따라 Consume, Product, Function, Predicate 등의
//함수형 인터페이스가 미리 정의되어 있습니다.
@FunctionalInterface //함수형 인터페이스에 사용합니다. 애노테이션이라는 주석으로 '코드를 체크하는 기능'을 합니다.
public interface FunctionEx {
	int exmethod(int a, int b);
	
	//void print(String abc); 오류 : 추상메소드 2개이면 @FunctionalInterface 체크에서 규칙 위반
}

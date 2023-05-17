package partC.day18;

import partC.day17.InterfaceA;
import partC.day17.beable.Runnable;
import partC.day17.beable.Thinkable;

public class C06AnonymousTest {
	
	public static void main(String[] args) {
		
		//new InterfaceA()하면서 inner type (내부 타입)의 구현 클래스를 정의
		// => 객체 생성. ia는 객체 를 참조하는 변수명.
		
		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println("InterfaceA의 익명 클래스 구현 methodB");
				return 777 + num;
			}
			
			@Override
			public void methodA() {
				System.out.println("InterfaceA의 익명 클래스 구현 methodA");
				
			}
		};
		
		Thinkable chatGPT = new Thinkable() {
			
			@Override
			public String beAble() { //Thinkable 인터페이스의 익명 구현 클래스
				return null;
			}
			
			@Override
			public void think() {
			}
			
			@Override
			public int calculate(int a, int b) {
				return 0;
			}
		};
		
		//참고 : inner class는 클래스안에 클래스가 정의되는 형식.
		Runnable run1 = new Runnable() { //Runnable 인터페이스의 익명 구현 클래스
			
			@Override
			public String beAble() {
				return "Anonymous";
			}
			
			@Override
			public String run(int speed) {
				return "Anonymous run!!";
			}
		};
		System.out.println(run1.beAble());
		System.out.println(run1.run(50));
			
	}

}

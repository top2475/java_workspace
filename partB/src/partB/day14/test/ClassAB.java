package partB.day14.test;

import partB.day14.ClassA;

public class ClassAB extends ClassA {
	
	public void test() {
		//ㅊ 필드(자식 클래스를 위한 접근 권한) message는 다른 패키지에서 사용가능한 이유는?
		//     ClassA를 상속했기 때문에
		super.message= "다른 패키지 자식 클래스입니다.";
		this.message= "다른 패키지 자식 클래스입니다.";
		//message는 부모필드이므로 자식 입장에서는 super, this 모두 사용 가능. 정확히는 super
		System.out.println("메세지 =" + message);
	}
	

}

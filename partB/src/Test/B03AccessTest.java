package Test;

import partB.day12.B01MyIntegerValue1;

public class B03AccessTest {

	public static void main(String[] args) {
		//MyINtegerValue의 필드 접근 범위 확인
		B01MyIntegerValue1 my = new B01MyIntegerValue1(); 
		//my1.value1 =23;    my1.value2 =45;
		//오류 : 패키지 접근 한정 필드 value1,2는 다른 패키지에서 접근 불가
		System.out.println("my.message 초기 상태 = "+ my.message);
		my.message = "hi~~!!";
		System.out.println("my.message 값 대입 후 = "+ my.message);
		System.out.println(my.message);
		System.out.println(my.result);
		System.out.println(my.isOK);
	}
}

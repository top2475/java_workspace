package Test;

import partB.day12.B01MyIntegerValue1;

public class B03AccessTest {

	public static void main(String[] args) {
		//MyINtegerValue�� �ʵ� ���� ���� Ȯ��
		B01MyIntegerValue1 my = new B01MyIntegerValue1(); 
		//my1.value1 =23;    my1.value2 =45;
		//���� : ��Ű�� ���� ���� �ʵ� value1,2�� �ٸ� ��Ű������ ���� �Ұ�
		System.out.println("my.message �ʱ� ���� = "+ my.message);
		my.message = "hi~~!!";
		System.out.println("my.message �� ���� �� = "+ my.message);
		System.out.println(my.message);
		System.out.println(my.result);
		System.out.println(my.isOK);
	}
}

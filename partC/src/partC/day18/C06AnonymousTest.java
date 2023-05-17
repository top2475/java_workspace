package partC.day18;

import partC.day17.InterfaceA;
import partC.day17.beable.Runnable;
import partC.day17.beable.Thinkable;

public class C06AnonymousTest {
	
	public static void main(String[] args) {
		
		//new InterfaceA()�ϸ鼭 inner type (���� Ÿ��)�� ���� Ŭ������ ����
		// => ��ü ����. ia�� ��ü �� �����ϴ� ������.
		
		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println("InterfaceA�� �͸� Ŭ���� ���� methodB");
				return 777 + num;
			}
			
			@Override
			public void methodA() {
				System.out.println("InterfaceA�� �͸� Ŭ���� ���� methodA");
				
			}
		};
		
		Thinkable chatGPT = new Thinkable() {
			
			@Override
			public String beAble() { //Thinkable �������̽��� �͸� ���� Ŭ����
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
		
		//���� : inner class�� Ŭ�����ȿ� Ŭ������ ���ǵǴ� ����.
		Runnable run1 = new Runnable() { //Runnable �������̽��� �͸� ���� Ŭ����
			
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

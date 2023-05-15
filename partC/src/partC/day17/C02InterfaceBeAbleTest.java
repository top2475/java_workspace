package partC.day17;

import partC.day17.beable.AI;
import partC.day17.beable.Dog;
import partC.day17.beable.Human;
import partC.day17.beable.Runnable;
import partC.day17.beable.Thinkable;

public class C02InterfaceBeAbleTest {
	public static void main(String[] args) {
		Thinkable th1= new Human();
		Thinkable th2= new AI();
		//Thinkable th3= new Human(); ���� : Dog�� Thinkable�� ���� Ŭ������ �ƴ�
		Runnable run = new Dog();
		//Runnable run = new AI(); ���� : AI�� Runnable�� ���� Ŭ������ �ƴ�
		
		Thinkable[] thinks = new Thinkable[2];
		thinks[0] = th1;
		thinks[1] = th2;
		
		//������ ���� : Human, AI��ü�� ���� �����Ǿ����� ���� �������̽� Thinkable�� �����մϴ�.
		//           �̶� calculate �޼ҵ�� ���� �ٸ� �������� �����մϴ�.
		for (Thinkable t : thinks) {
			System.out.println("==Thinkable �������̽��� calculate �޼ҵ� ���� ���==");
			if(t instanceof Human)
				System.out.println("�� �޸� ��� ���Դϴ�....");
			else if(t instanceof AI)
				System.out.println("�� AI ��� ���Դϴ�....");
			else {
				System.out.println("�� �� ���� ��ü�Դϴ�.");
				break;
			}
			System.out.println("��� = " + t.calculate(999999, 1234567)); 
			
		}
	}

}

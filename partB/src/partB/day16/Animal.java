package partB.day16;

import java.util.Arrays;

import partB.day12.Member;

//Object Ÿ������ �ʵ� �Ǵ� �޼ҵ��� ���ڿ� ���� Ÿ������ ����ϴ� ����.
public final class Animal {
	
	Object name;
	
	void iamAnimal(Object object) { //�޼ҵ� ���ڸ� object Ÿ������ �޽��ϴ�.
		if(object instanceof Member) {
			Member member = (Member)object;
		    System.out.println("���� Object = " + member.member() + ", name = " + name);
	    }else if(object instanceof String[]) {
	    	String[] temp = (String[]) object;
		    System.out.println("���� Object = " + Arrays.toString(temp) + ", name = " + name);
		
	    }else
	    	System.out.println("���� Object = " + object + ", name = " + name);


}
}
//��Ʃ : Animal�� final�̹Ƿ� ����� �ȵǴ� Ŭ����
//class Puppby extends Animal{}

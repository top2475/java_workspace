package partB.day16;

import partB.day12.Member;

public class B16ObjetTypeTest {
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name = "�۸���"; //Object �ʵ忡 ���ԵǴ� �����ʹ� String
		
		Animal cat = new Animal();
		cat.name = 99999; //Object �ʵ忡 ���ԵǴ� �����ʹ� Int(Integer)
		
		Animal people = new Animal();
		people.name = new Member(); //Object �ʵ忡 ���ԵǴ� �����ʹ� Member
		
		System.out.println("object ���ڰ� �Ǽ� Ÿ��==");
		dog.iamAnimal(3.4567);
		
		System.out.println("object ���ڰ� �迭 ��ü Ÿ��==");
		cat.iamAnimal(new String[] {"helli","~����"});
		
		System.out.println("object ���ڰ� Member Ÿ��==");
		Member member = new Member(); member.setId("momo");member.setName("����");
		people.iamAnimal(member);
		
		System.out.println("object ���ڰ� ���ڿ�==");
		people.iamAnimal("�ڹٸ�");
		
	}

}

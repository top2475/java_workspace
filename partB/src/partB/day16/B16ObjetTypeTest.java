package partB.day16;

import partB.day12.Member;

public class B16ObjetTypeTest {
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name = "멍멍이"; //Object 필드에 대입되는 데이터는 String
		
		Animal cat = new Animal();
		cat.name = 99999; //Object 필드에 대입되는 데이터는 Int(Integer)
		
		Animal people = new Animal();
		people.name = new Member(); //Object 필드에 대입되는 데이터는 Member
		
		System.out.println("object 인자가 실수 타입==");
		dog.iamAnimal(3.4567);
		
		System.out.println("object 인자가 배열 객체 타입==");
		cat.iamAnimal(new String[] {"helli","~냥이"});
		
		System.out.println("object 인자가 Member 타입==");
		Member member = new Member(); member.setId("momo");member.setName("김모모");
		people.iamAnimal(member);
		
		System.out.println("object 인자가 문자열==");
		people.iamAnimal("자바맨");
		
	}

}

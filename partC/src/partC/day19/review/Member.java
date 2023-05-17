package partC.day19.review;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name,int age) {
		this.name =name;
		this.age=age;
	}
	
	boolean isAdopt(Animal animal) { //�޼ҵ� ���ڰ� Animal Ÿ�� ���ڷ� ���� ������ �о� �ڰ��� �ִ���
// �䱸���� :�������� 15���̻�, ����̴� 18���̻�, �䳢�� 13�� �̻� �о���� �� �ֽ��ϴ�. �� �� ������ 20�� �̻�
//Animal Ÿ���� ���� ��ü�� ���������� ? ���� ��. ���� �������� �� �� ����. unknown
		if(animal instanceof Puppy && age >=15)  
	//instanceof ���� : ���� ��ü Ÿ���� �˻�. Ŭ���� ��Ӱ�ü�鿡�� ����ϴ� ����.
			return true;
		else if(animal instanceof Cat && age >=18)
			return true;
		else if(animal instanceof Rabbit && age >=13)
			return true;
		else if(animal instanceof Animal && age >=20)
			return true;
		else 
			return false;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}

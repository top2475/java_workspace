package partB.day13;

public class B09UserTest {
	
	public static void main(String[] args) {
		
		B09User momo =
				new B09User("twice","����",26,100);
		System.out.println(momo.user());
		System.out.println("���̵� ="+momo.getId());
		System.out.println("�̸� ="+momo.getName());
		System.out.println("���� ="+momo.getAge());
		System.out.println("����Ʈ ="+momo.getPoint());
		
		momo.setPoint(11000);
		System.out.println("����Ʈ ="+momo.getPoint());
		

}}

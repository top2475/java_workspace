package partC.day17;

//�ڹ� ���̺귯���� �� ��� �������̽��� Ȱ���� ���� ���� ����
public class C03ComparToTest {
	
	//�񱳴� sort(����) �޼ҵ忡�� ����ϰ� �˴ϴ�.
	public static void main(String[] args) {
		
			int num1= 23; int num2 =45;
			
			System.out.println("1. int �⺻ �ڷ��� �� �����?");
			System.out.println("num1 =" + num1 + ", num2 =" + num2);
			System.out.println(num1-num2 < 0 ); //23-45=-22 => num1<num2
			System.out.println(num1-num2 < 0 ? "num1�� num2���� �۽��ϴ�." : "num1�� num2���� ũ�ų� �����ϴ�");
			
			num1=45; num2=23;
			System.out.println("num1 =" + num1 + ", num2 =" + num2);
			System.out.println(num1-num2 < 0 ); //45-23=22 => num1>num2
			System.out.println(num1-num2 < 0 ? "num1�� num2���� �۽��ϴ�." : "num1�� num2���� ũ�ų� �����ϴ�");
			
			System.out.println("\n=== ��� : �⺻ �ڷ����� ���� �񱳸� �� ���� �E�� ����� 0�� ���ؼ� �Ǵ��մϴ�. ===");
			
			String na = "kim"; String you = "momo";
			System.out.println("na.CompareTo(you) =" + na.compareTo(you));
			System.out.println("��� : ���ڿ��� ���� ������ ��. kim�� 'k'�� momo�� 'm'�� ���� ���");
			System.out.println("'k'-'m'= " + ('k'-'m')); //�����? -2
			System.out.println("you.CompareTo(na) =" + you.compareTo(na));
			System.out.println("'m'-'k'= " + ('m'-'k')); //�����? 2
			you = "kang";
			System.out.println("kim�� kang�� �񱳴� ù���� k�� �����Ƿ� i�� a�� ���մϴ�.");
			System.out.println("na.compareTo(you) = " + na.compareTo(you));
			System.out.println("\n��� : ���ڿ� compareTo(you) ����� \n"
			        + "�����̸�\n"
					+ "���� ������ na�� ���ڿ��� you�� ���ڿ����� �տ� ���ɴϴ�.\n"
			        + "����̸�\n"
			        + "���� ������ na�� ���ڿ��� you�� ���ڿ����� �ڿ� ���ɴϴ�.\n");
		
	}

}

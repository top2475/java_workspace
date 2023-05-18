package partC.day20;

//Ŭ���� �̸�. ������ ���� static
public class C08CharSequenceTest {
//CharSequenceTest(������� ������ ����) �������̽� : String, StringBuffer, StringBuilder�� ���� Ŭ����
	public static void main(String[] args) {
	//���� : �ؽ��ڵ�� ��ü�� �ּҷ� ��������� ��ü�� �ĺ��� ���� ���Դϴ�.	
		//Integer,toHexString�� ����(����)�� 16������ ��ȯ�Ͽ� ���ڿ� ����
		System.out.println("1. String Ŭ������ ��ü");
		String result = new String();
		System.out.println("�ʱ� result :" + result);
		for (int i = 0; i < 5; i++) {
			result += i + "/"; //result = result+ i + "/";
			System.out.println("�߰� ��� result : " + result);
			System.out.println(String.format("�߰� ��� result ��ü �ؽ��ڵ� �� \n 10���� = %d , 16���� = 0x%8s\n" ,
					result.hashCode(), Integer.toHexString(result.hashCode())));
			
		}
		//�ؽ��ڵ� ���� ���ٸ� ������ ��ü�� ���� ���°� �ٲ�� ���̰� �׷��� ������ ��ü�� ���� ��������� ��
		System.out.println("=== String ��ü�� ���ڿ��� ����Ǹ� �������� ����˴ϴ�.(�Һ� ��ü)===\n");
		
		System.out.println("\n2. StringBuffer Ŭ������ ��ü");
		StringBuffer sb = new StringBuffer();
		System.out.println("�ʱ� sb : " + sb);
		for (int i = 0; i < 5; i++) {
			sb.append(i).append(":");
			System.out.println("�߰� ��� sb : " + sb);
			System.out.println(String.format("�߰� ��� sb ��ü �ؽ��ڵ� �� \n 10���� = %d , 16���� = 0x%8s\n" ,
					sb.hashCode(), Integer.toHexString(result.hashCode())));
			
	}
		System.out.println(
				"===StringBuffer(StringBuilder) ��ü�� ��ü�� ���ڿ��� ������ �� �ֽ��ϴ�..(���� ��ü) \n" +
		"���ڿ� �߰� append �޼ҵ尡 �ֽ��ϴ�.");
		System.out.println("���ڿ��� delete(����), insert(�߰� ����) ��ɵ� �ֽ��ϴ�.===");
		System.out.println("sb.insert(2, (\"***\") = " + sb.insert(2, "***")); //���ڿ��� 2�� �ε��� ��ġ�� ����
		System.out.println("sb.delete(2,4)  = " + sb.delete(2, 4)); //2�� �ε�������(4-2)���� �����ϱ�
		//StringBuilder�� StringBuffer�� ���� �������� ������ Ŭ�����Դϴ�.
		//             ��, StringBuffer�� ��Ƽ�����忡 �����մϴ�(��Ƽ������� �ڿ��� ���� ����)
		
		System.out.println("\n3. String Ŭ������ contains �޼ҵ� ���ڴ� CharSequence Ÿ���Դϴ�.");
		String sample = "abc0/1/2/3/4/xyz";
		CharSequence cs = result; //CharSequence �������̽� Ÿ������ ��ĳ����
		System.out.println("sample.contains(result) =" + sample.contains(cs));
		cs = sb;
		System.out.println("sample.containe(sb)" + sample.contains(cs));
		
}
}
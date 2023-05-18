package partC.day20;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C10StringToScore {
	
	//���ڿ� 1���� ��ũ�������� �и��Ͽ� Score ��ü �����
	public static void main(String[] args) {
		String str = "���:90/88/99";
		String[] temp = new String[4]; //������� "���"."90","88","99" ����
		
		//Score ��ü ���� �� �ʵ� name : ���, java : 90, python : 88, html : 99
		
		//1)��ũ������ �и���ȣ ���Խ�?
		StringTokenizer stk = new StringTokenizer(str,":/");
		int i=0;
		while (stk.hasMoreElements()) {
			//temp[i++] = stk.nextToken(); //�迭�� ���� �� ����
			//i++;
			temp[i] = stk.nextToken();
			System.out.println("temp[" + i + "] =" + temp[i++]);
		}
		System.out.println(Arrays.toString(temp));
		
		//2)�и��� ��ū�� ��ü�� �ʵ�� �ִ� ���?
		//  ���ڿ��� ������ ��ȯ�ϴ� ���� Integer.parseInt(���ڿ�) ���� ���� ����
		Score momo = new Score(temp[0],
				Integer.parseInt(temp[1]), //java
				Integer.parseInt(temp[2]), //pythom
				Integer.parseInt(temp[3]));//html
		
		//3)������ ��ü�� �ʵ� �� ���(toString)
		System.out.println("��ȯ�� Score ��ü" + momo);
		System.out.println("momo ��� = " + momo.average() + ", ���� =" + momo.getGrade());
		
		//�Ʒ� str�� 1)�� while ���� 2,3 ���ļ� while ���� �غ���
		str = "����:92/77/85";
		stk = new StringTokenizer(str,":/");
		Score zuwi = new Score(stk.nextToken(),
				Integer.parseInt(stk.nextToken()),
				Integer.parseInt(stk.nextToken()),
				Integer.parseInt(stk.nextToken()));
		
//		String zuwi = stk.nextToken();
//		int num = Integer.parseInt(str);
//		int num1 = Integer.parseInt(str);
//		int num2 = Integer.parseInt(str);
//		
	}

}
;
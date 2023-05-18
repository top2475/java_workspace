package partC.day20;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C09StringSplitTest {
	//���ڿ� �ɰ���
	public static void main(String[] args) {
		String temp = "��� 90 88 79 "; //Ư�� ���ڿ��� �߽�(����)���� �и��ϱ�
		String[] result = temp.split(" "); //split �޼ҵ� ���� Ÿ���� String[], ���ڴ� �и����� ���ڿ�

	      System.out.println("1. temp ���ڿ� �и� split ��� : "+ Arrays.toString(result));
	      System.out.println("result.length = "+result.length);
	      for(String t : result)
	         System.out.println(t);
	   
	     //temp = "���xy90xy88xy79xy33"; 1)
	      temp = "���xy90xy88xy79xy33xy1111"; //2)
	      result = temp.split("xy"); //2)���� ��Ȯ�� ���ڿ� "xy" ���� ���θ� �и�. �迭 ũ�� 5
	      System.out.println("temp ���ڿ� �и� ��� �迭 : "+ Arrays.toString(result));
	      System.out.println("result.length = "+result.length);
	      for(String t : result)
	         System.out.println(t);
	      
	      //split �޼ҵ�� �и��� ����� �迭�� ��Ÿ��. ��ũ�������� nextToken()���� ���� �ϳ��� ��������
	      System.out.println("\2n.���ڿ� ��ũ������(��ū: ���� �м��� ������ ����Ű�� ��ǻ�� ����̴�.");
	      temp = "��� 90 88 79";
	      
	      StringTokenizer stk = new StringTokenizer(temp); //���� ��ȣ ���� : ����� �ٹٲ�
	      System.out.println("1.nextToken() �޼ҵ� ���");
	      System.out.println(stk.nextToken()); //�ڵ�(�⺻)���� ���� ���� ���
	      System.out.println(stk.nextToken()); //90
	      System.out.println(stk.nextToken()); //88
	      System.out.println(stk.nextToken()); //79
//	      System.out.println(stk.nextToken()); ���� : next�� ������ ������ ����
	      
	      //��ũ�������� ���� �������� �ٽ� ����
	      stk = new StringTokenizer(temp);
	      System.out.println("\n2. �ݺ������� �����ϱ� : hasMoreToken - �� ������ ���� �־�?");
	      int count = 0;
	      while (stk.hasMoreElements()) {
	    	  System.out.println("count = " + count++ + ", ���� ��ū �� = " + stk.nextToken());
	    	  //count++�� println �Ŀ� 1�� ����(++)
		}
	      System.out.println("�� ��ū �� ���� = " + count); //���� ���� 4
	      
	      //
	      System.out.println("\n3. ���� ���ڿ�(delimiter)�� ������ �ƴ� ��");
	  //    temp = "���xy90xy88xy79xy33"; //1
	      temp = "���xy90xy88xy79xy33xy999xy1111"; //2
	      stk = new StringTokenizer(temp,"xy"); //2���� ��ū ���� : 7 "xy"���Խ� ǥ��
	      count = 0;
	      while (stk.hasMoreElements()) {//ģ������
			System.out.println("count = " + count++ + ", ���� ��ū �� = " + stk.nextToken());
			
			
		}
	    System.out.println("�� ��ū �� ���� = " + count); // ���� �� 1=5, 2=7		  

		
	}

}

package partC.day18;

import java.util.Scanner;

public class RedPenMain {
		
	 public static void main(String[] args) {

	      System.out.println("�ʵ��б� 2�г��� ���� 2�ڸ� ��Ģ���� ���� ���α׷� ������ �Դϴ�.");
	      System.out.println("---------------------------");
	      System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
	      System.out.println("---------------------------");
	      
	      Scanner sc = new Scanner(System.in);
	      RedPen[] redPens = new RedPen[5];
	      int result = 0;
	      int count = 0;
	      
	      System.out.println("�����մϴ�.");
	      //ù��° �ݺ��� ���� ������ŭ
	      //1.RedPen ��ü �����ؼ� �������� �迭�� ����
	      for (int i = 0; i < redPens.length; i++) {
	         redPens[i] = new RedPen('+'); //Ŀ���� ������ char�� �Է¹޾Ƽ� �����ڸ� '+'�� �ذ�.
	         redPens[i].make();   //make() �޼ҵ忡 ������ �����Ѱ�.
	         //2.1���� ��ü�� �̿��ؼ� ������ ����� ȭ�鿡 ���
	         System.out.print(redPens[i].problem());
	         //3.����� �� �Է��ϱ�
	         result = sc.nextInt();
	         //4.3���� �Է°����� ���� ���θ� �Ǵ��ؼ� isCorrect �ʵ忡 ���� ����
	         //(������ true, ������ false)
	         //�ι�°(�׳� �ѹ��� ������) �ݺ��� �迭�� ����� ���� �߿� ���丸 ������ ������ ����ϱ�
	         if(result == redPens[i].answer()) {
	            redPens[i].setCorrect(true);
	            count+=1;
	         }else {
	            redPens[i].setCorrect(false);
	         }
	      }//ù��° for��
	      System.out.println("ä���մϴ�. ���� ���� "+count+"("+count*20+")��");
	      System.out.println(":::Ʋ�� ���� ���亸��:::");
	      for (int i = 0; i < redPens.length; i++) {
	         if(redPens[i].isCorrect() == false) {
	            System.out.println("����"+(i+1)+". "+redPens[i].problem()+redPens[i].answer());
	            //n1 + " " + op + " " + n2 + " = ";
	            //ù��°�� ��ȣ �ι�°�� =
	            // 1+2=
	         }
	         
	     }
	
	 }
	}



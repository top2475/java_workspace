package partC.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import partC.day18.RedPen;

public class RedPenMain {
		//day18 �������� �迭 ����� ArrayList�� �ٲٰڽ��ϴ�.
	 public static void main(String[] args) {
		  
		 
	      System.out.println("�ʵ��б� 2�г��� ���� 2�ڸ� ��Ģ���� ���� ���α׷� ������ �Դϴ�.");
	      System.out.println("---------------------------");
	      System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
	      System.out.println("---------------------------");
	      
	      Scanner sc = new Scanner(System.in);
	      RedPen[] redPens = new RedPen[5];
	      //������ List ������ �������̽� Ÿ������ ����
	     List<RedPen> probs =new ArrayList<>(); //��ĳ���� . �� ��ü�� List�� ���ǵ� �޼ҵ常 ���� ����
	      int result = 0;
	      int count = 0;
	      
	      System.out.println("�����մϴ�.");
	      //ù��° �ݺ��� ���� ������ŭ
	      //1.RedPen ��ü �����ؼ� �������� �迭�� ����
	      for (int i = 0; i < redPens.length; i++) {
	         //redPens[i] = new RedPen('+'); //Ŀ���� ������ char�� �Է¹޾Ƽ� �����ڸ� '+'�� �ذ�.
	         probs.add(new RedPen('+'));
	    	  //redPens[i].make();   //make() �޼ҵ忡 ������ �����Ѱ�.
	         probs.get(i).make();
	         //2.1���� ��ü�� �̿��ؼ� ������ ����� ȭ�鿡 ���
	         System.out.print("����"+(i+1)+"�� : " + probs.get(i).problem());
	      //   System.out.print(String.format("���� %d. �� �Է� >>>", i+1,probs.get(i).make()));
	         //3.����� �� �Է��ϱ�
	         result = sc.nextInt();
	         //4.3���� �Է°����� ���� ���θ� �Ǵ��ؼ� isCorrect �ʵ忡 ���� ����
	         //(������ true, ������ false)
	         //�ι�°(�׳� �ѹ��� ������) �ݺ��� �迭�� ����� ���� �߿� ���丸 ������ ������ ����ϱ�
	         if(result == probs.get(i).answer()) {
	        	 probs.get(i).setCorrect(true);
	            count+=1;
	         }else {
	        	 probs.get(i).setCorrect(false);
	         }
	      }//ù��° for��
	      System.out.println("ä���մϴ�. ���� ���� "+count+"("+count*20+")��");
	      System.out.println(":::Ʋ�� ���� ���亸��:::");
	      for (int i = 0; i < redPens.length; i++) {
	         if(probs.get(i).isCorrect() == false) {
	            System.out.println("����"+(i+1)+". "+probs.get(i).problem()+probs.get(i).answer());
	            //n1 + " " + op + " " + n2 + " = ";
	            //ù��°�� ��ȣ �ι�°�� =
	            // 1+2=
	         }
	         
	     }
	
	 }
	}



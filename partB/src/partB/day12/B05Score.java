package partB.day12;

import java.util.Arrays;

//sum(), average() �޼ҵ�� �ν��Ͻ� �ʵ�� ����� ����� �����ϴ� �ν��Ͻ� �޼ҵ�
public class B05Score {
	//Score
	//  ������ �� name,korea,english,science
	//  �ʵ�� ��� private. getter/setter �ʿ�
	//  ��� �ʵ尪 ���ڿ��� �����ϴ� �޼ҵ�
	//  sum(),averge()�޼ҵ�
	//B05ScoreTest
	//  Score ��ü�� �����ϰ�
	//  �� �ʵ��� ���� Ű����� �Է¹޾� ����
	//  ����, ���(�Ҽ��� 2�ڸ�)���ϱ�
	//  ��� �ʵ尪, ����, ��� ����ϱ�

		private String name;
		private int korea;
		private int english;
		private int science;
		
		//�����ڸ� day13���� ������ ���� , ����� �⺻ �����ڰ� ������ ����
		//��ü �����ÿ��� �⺻ �����ڸ� �����մϴ�.
		
		public String getName() {return name;}
		public int getKorea() {return korea;}
		public int getEnglish() {return english;}
		public int getScience() {return science;}
		
		
		public void setName(String name) {this.name=name;}
		public void setKorea(int korea) {this.korea=korea;}
		public void setEnglish(int english) {this.english=english;}
		public void setScience(int science) {this.science=science;}
		
		//�ν��Ͻ� �޼ҵ�� ����ϴ�.
		public int sum(){
			return korea+english+science;
		}
		
		public double averge(){
			return (double) sum()/3;}
		
		public String member(){
			return String.format("name=%s, korea=%d, english=%d, science=%d, sum=%d, averge=%.2f",
					name,korea,english,science,sum(),averge());
		
		
		}
	

}
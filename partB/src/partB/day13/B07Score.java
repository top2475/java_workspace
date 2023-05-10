package partB.day13;

import java.util.Arrays;

//day12 Score Ŭ������ ������ ���� Ȯ��.
//�⺻ ������ ���ۿ����� day12�� ScoreŬ������ �񱳰� �ٽ�
public class B07Score {
	
		private String name;
		private int korea;
		private int english;
		private int science;
		
		//�Ű������� �ִ� �����ڸ� ������ٸ�(�����ε�) �⺻�����ڸ� ����ϰ� ������ �� ���Ǹ� �ؾ���
		//�� Score Ŭ������ �⺻ �����ڷ� ��ü�� ������ �� ����
		public B07Score(String name, int korea, int english, int science) {
			//this(); //this ���� : �⺻�����ڰ� ����.
			this.name = name;
			this.korea = korea;
			this.english = english;
			this.science = science;
		}
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
		
		public String score(){
			return String.format("name=%s, korea=%d, english=%d, science=%d, sum=%d, averge=%.2f",
					name,korea,english,science,sum(),averge());
		
		
		}
	

}
package partB.day13;

import java.util.Arrays;

//day12 Score 클래스로 생성자 동작 확인.
//기본 생성자 동작여부을 day12의 Score클래스와 비교가 핵심
public class B07Score {
	
		private String name;
		private int korea;
		private int english;
		private int science;
		
		//매개변수가 있는 생성자를 만들었다면(오버로딩) 기본생성자를 사용하고 싶으면 꼭 정의를 해야함
		//이 Score 클래스는 기본 생성자로 객체를 생성할 수 없다
		public B07Score(String name, int korea, int english, int science) {
			//this(); //this 오류 : 기본생성자가 없다.
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
		
		//인스턴스 메소드로 만듭니다.
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
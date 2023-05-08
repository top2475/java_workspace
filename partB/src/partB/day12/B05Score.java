package partB.day12;

import java.util.Arrays;

//sum(), average() 메소드는 인스턴스 필드로 계산한 결과를 리턴하는 인스턴스 메소드
public class B05Score {
	//Score
	//  저장할 값 name,korea,english,science
	//  필드는 모두 private. getter/setter 필요
	//  모든 필드값 문자열로 리턴하는 메소드
	//  sum(),averge()메소드
	//B05ScoreTest
	//  Score 객체를 생성하고
	//  각 필드의 값을 키보드로 입력받아 저장
	//  총점, 평균(소수점 2자리)구하기
	//  모든 필드값, 총점, 평균 출력하기

		private String name;
		private int korea;
		private int english;
		private int science;
		
		//생성자를 day13에서 배우고나서 보니 , 여기는 기본 생성자가 생략된 상태
		//객체 생성시에는 기본 생성자만 실행합니다.
		
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
		
		public String member(){
			return String.format("name=%s, korea=%d, english=%d, science=%d, sum=%d, averge=%.2f",
					name,korea,english,science,sum(),averge());
		
		
		}
	

}
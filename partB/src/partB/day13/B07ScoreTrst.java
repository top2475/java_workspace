package partB.day13;

public class B07ScoreTrst {
	//Score 클래스는 객체를 기본 생성자로 못만듭니다.
	public static void main(String[] args) {
		
		//Score score = new Score();
		B07Score my = new B07Score("김떙떙",90,78,88);
		System.out.println(my.score());
	}

}

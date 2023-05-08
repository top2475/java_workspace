package partB.day12;

import java.util.Arrays;
import java.util.Scanner;

public class B05ScoreTest {
//인스턴스 필드와 인스턴스 메소드는 객체를 생성해야 사용 가능
	public static void main(String[] args) {
		B05Score hyerim = new B05Score();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요. >>>>");
		hyerim.setName(sc.next());
		System.out.println("국어 점수를 입력하세요. >>>>");
		hyerim.setKorea(sc.nextInt());
		System.out.println("영어 점수를 입력하세요. >>>>");
		hyerim.setEnglish(sc.nextInt());
		System.out.println("과학 점수를 입력하세요. >>>>");
		hyerim.setScience(sc.nextInt());
		System.out.println("===해당 학생의 점수===");
		System.out.println(hyerim.member());
		System.out.println("총점 =" + hyerim.sum());
		System.out.println(String.format("평균 = %.2f\n",hyerim.averge()));

		

	}
}

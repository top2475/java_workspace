package partC.day20;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C10StringToScore {
	
	//문자열 1개를 토크나이저로 분리하여 Score 객체 만들기
	public static void main(String[] args) {
		String str = "모모:90/88/99";
		String[] temp = new String[4]; //순서대로 "모모"."90","88","99" 저장
		
		//Score 객체 생성 후 필드 name : 모모, java : 90, python : 88, html : 99
		
		//1)토크나이저 분리기호 정규식?
		StringTokenizer stk = new StringTokenizer(str,":/");
		int i=0;
		while (stk.hasMoreElements()) {
			//temp[i++] = stk.nextToken(); //배열에 대입 후 증가
			//i++;
			temp[i] = stk.nextToken();
			System.out.println("temp[" + i + "] =" + temp[i++]);
		}
		System.out.println(Arrays.toString(temp));
		
		//2)분리된 토큰을 객체의 필드로 주는 방법?
		//  문자열을 정수로 변환하는 것은 Integer.parseInt(문자열) 리턴 값을 정수
		Score momo = new Score(temp[0],
				Integer.parseInt(temp[1]), //java
				Integer.parseInt(temp[2]), //pythom
				Integer.parseInt(temp[3]));//html
		
		//3)생성된 객체의 필드 값 출력(toString)
		System.out.println("변환된 Score 객체" + momo);
		System.out.println("momo 평균 = " + momo.average() + ", 학점 =" + momo.getGrade());
		
		//아래 str을 1)위 while 문과 2,3 합쳐서 while 없이 해보기
		str = "쯔위:92/77/85";
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
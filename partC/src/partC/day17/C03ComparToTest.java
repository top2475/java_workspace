package partC.day17;

//자바 라이브러리의 비교 기능 인터페이스를 활용학 위한 선행 연습
public class C03ComparToTest {
	
	//비교는 sort(정렬) 메소드에서 사용하게 됩니다.
	public static void main(String[] args) {
		
			int num1= 23; int num2 =45;
			
			System.out.println("1. int 기본 자료형 비교 방식은?");
			System.out.println("num1 =" + num1 + ", num2 =" + num2);
			System.out.println(num1-num2 < 0 ); //23-45=-22 => num1<num2
			System.out.println(num1-num2 < 0 ? "num1이 num2보다 작습니다." : "num1이 num2보다 크거나 같습니다");
			
			num1=45; num2=23;
			System.out.println("num1 =" + num1 + ", num2 =" + num2);
			System.out.println(num1-num2 < 0 ); //45-23=22 => num1>num2
			System.out.println(num1-num2 < 0 ? "num1이 num2보다 작습니다." : "num1이 num2보다 크거나 같습니다");
			
			System.out.println("\n=== 결론 : 기본 자료형은 값의 비교를 두 값의 뺼셈 결과와 0을 비교해서 판답합니다. ===");
			
			String na = "kim"; String you = "momo";
			System.out.println("na.CompareTo(you) =" + na.compareTo(you));
			System.out.println("결론 : 문자열은 사전 순서로 비교. kim의 'k'와 momo의 'm'의 뺄셈 결과");
			System.out.println("'k'-'m'= " + ('k'-'m')); //결과값? -2
			System.out.println("you.CompareTo(na) =" + you.compareTo(na));
			System.out.println("'m'-'k'= " + ('m'-'k')); //결과값? 2
			you = "kang";
			System.out.println("kim과 kang의 비교는 첫글자 k가 같으므로 i와 a를 비교합니다.");
			System.out.println("na.compareTo(you) = " + na.compareTo(you));
			System.out.println("\n결론 : 문자열 compareTo(you) 결과가 \n"
			        + "음수이면\n"
					+ "사전 순으로 na의 문자열이 you의 문자열보다 앞에 나옵니다.\n"
			        + "양수이면\n"
			        + "사전 순으로 na의 문자열이 you의 문자열보다 뒤에 나옵니다.\n");
		
	}

}

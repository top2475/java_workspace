package partB.day12;

public class B02MySimpleMathExam {
	public static void main(String[] args) {
		//자바의 Math 클래스처럼 MySimpleMath 테스트하기
		// - 클래스 메소드 정의해서 테스트 - 메소드 오버로딩
		
		int result = B02MySimpleMath1.add(23, 45);
		System.out.println("MySimpleMath.add() = " + result);
		System.out.println("MySimpleMath.subtract(23, 45)=" + B02MySimpleMath1.subtract(23, 45));
		System.out.println("MySimpleMath.multiply(23, 45)=" + B02MySimpleMath1.multiply(23, 45));
		System.out.println("MySimpleMath.divide(23, 45)=" + B02MySimpleMath1.divide(23, 45));
		System.out.println("MySimpleMath.remaind(23, 45)=" + B02MySimpleMath1.remaind(23, 45));
		
		double dresult = B02MySimpleMath1.add(23.54, 45.19);
		System.out.println("MySimpleMath.add() = " + dresult);
		System.out.println("MySimpleMath.subtract()=" + B02MySimpleMath1.subtract(23.54, 45.19));
		System.out.println("MySimpleMath.multiply()=" + B02MySimpleMath1.multiply(23.54, 45.19));
		System.out.println("MySimpleMath.divide()=" + B02MySimpleMath1.divide(23.54, 45.19));
		
		System.out.println("static 필드 확인");
		System.out.println("MySimpleMath.pi =" + B02MySimpleMath1.pi);
		//MySimpleMath.pi = 3.15; 오류
		
		System.out.println("MySimpleMath.test =" + B02MySimpleMath1.test);
		B02MySimpleMath1.test = 3.15;  //변경 가능
		System.out.println("MySimpleMath.test(변경 후) =" + B02MySimpleMath1.test);
		
		//String 클래스 메소드의 오버로딩 확인하기
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(1234));
		System.out.println(String.valueOf(12.34));
		String doubleToString = String.valueOf(12.34);
		System.out.println(doubleToString); //String 으로 만들어 짐
		char[] testArray = {'a','1','*',' '};
		System.out.println(String.valueOf(testArray));
		System.out.println(String.valueOf(testArray,2,1));
		
	}

}

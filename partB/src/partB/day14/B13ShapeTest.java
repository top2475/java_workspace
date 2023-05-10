package partB.day14;

public class B13ShapeTest {
	
	public static void main(String[] args) {
		
		
		//Shape,Triangle,Circle 객체를 1개씩 생성. 변수명은 s,t,c
		Shape s = new Shape("도형",100,100);
		Triangle t = new Triangle();
		Circle c = new Circle(65.3);
		LadderShape l = new LadderShape("사다리꼴", 10, 10, 20);
		
		System.out.println(s.toString());
		System.out.println(s); //객체 뒤에 .toString()생략된 코드.
		System.out.println(t.toString());
		System.out.println(t);
		System.out.println(c.toString());
		System.out.println(c);
		System.out.println(l.toString());
		System.out.println(l);
		
		//테스트를 Shape에 toString을 주석 처리 후 실행
		//결과는 toString()을 다시 정의한 것이 없을 때는 아래와 같다
		//보기 좋게 필드 값 출력하기 위해 toString() 메소드를 다시 정의한 것.
		/*partB.day14.Shape@cac736f
          partB.day14.Shape@cac736f
          partB.day14.Triangle@5e265ba4
          partB.day14.Triangle@5e265ba4
          partB.day14.Circle@156643d4
          partB.day14.Circle@156643d4
		 */
		System.out.println("3개 도형의 넓이르 구하자.");
		System.out.println("s 넓이 =" +s.area());
		t.setWidth(100); t.setHeigth(78);
		System.out.println("t 넓이 =" +t.area());
		System.out.println("c 넓이 =" +c.area());
		System.out.println("l 넓이 =" +l.area());
		
	
	}

}

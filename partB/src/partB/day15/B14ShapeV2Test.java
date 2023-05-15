package partB.day15;

import partB.day14.Circle;
import partB.day14.LadderShape;
import partB.day14.Shape;
import partB.day14.Triangle;

public class B14ShapeV2Test {
	
	public static void main(String[] args) {
		
		LadderShape ls = new LadderShape("모모 사다리꼴",7,9,14);
		LadderShape ls2 = new LadderShape("모모 사다리꼴",7,9,14);
		Circle c = new Circle(13);
		
		ls.iamLadder();
		System.out.println();
		c.iamCircle();
		
		//1)클래스 캐스팅1 : 부모 타입으로 자식 객체를 참조할 수 있습니다.(자동 캐스팅)
		Shape sh1 = new LadderShape("사나 사다리꼴", 17, 13, 21);
		Shape sh2 = new Triangle();
		Shape sh3 = new Circle(9);
		
		Shape sh4 = ls;  //위에 모모 사다리꼴 객체의 참조값을 sh4에 대입
		Shape sh5 = c;
		
		//sh4.iamLadder();
		//sh4와 ls는 동일한 객체를 참조하고 있는 중..but, 타입에 따라 메소드 호출 여부 정해집니다.
		//sh5.iamCircle(); 오류
		//sh1.iamLadder(); 오류 : LadderShape 객체이지만 부모타입 sh1으로 참조
		//sh3.iamCircle();
		
		//2)클래스 캐스팅2 : 자식 타입 변수로 부모타입 참조 객체를 변환할 수 있나요? No(강제 캐스팅)
		//LadderShape ls2 = sh1; //LadderShape 객체이지만 부모타입으로 참조 중.
		ls2 = (LadderShape)sh1;		
		ls2.iamLadder();	
		
		System.out.println("부모 타입 객체를 생성르 생성하여 자식타입 변수로 참조시키기");
		//LadderShape shape = (LadderShape)new Shape("도형",0,0);  //문법적으로는 가능하지만 Exception 발생
		//shape.iamLadder(); //실제 객체가 Shape 이므로 오류
		
		//문제. 아래 명령어는 실행 가능?
		System.out.println("Circle 객체를 Shape 타입으로 참조하고 그것을 다시 LadderShape으로 캐스팅 가능?");
		//LadderShape ls3 = (LadderShape)sh5; //문법적으로 가능
		//ls3.iamLadder(); //실제 객체가 Circle 이므로 오류
		
		//자식 클래스의 메소드 iamLadder()는 실제 객체가  LadderShape 일 때만 오류없이 실행
		
		//3)강제 캐스팅에는 타입 체크가 필요. - instance of
		System.out.println("Shape 타입으로 참조하는 변수 sh1~5에 대해 LadderShape 인지 검사.====");
		System.out.println("sh1 instanceof LadderShape = " + (sh1 instanceof LadderShape));
		System.out.println("sh2 instanceof LadderShape = " + (sh2 instanceof LadderShape));
		System.out.println("sh3 instanceof LadderShape = " + (sh3 instanceof LadderShape));
		System.out.println("sh4 instanceof LadderShape = " + (sh4 instanceof LadderShape));
		System.out.println("sh5 instanceof LadderShape = " + (sh5 instanceof LadderShape));
		
		System.out.println("Shape 타입으로 참조하는 변수 sh1~5에 대해 Circle 인지 검사.====");
		System.out.println("sh1 instanceof Circle = " + (sh1 instanceof Circle));
		System.out.println("sh2 instanceof Circle = " + (sh2 instanceof Circle));
		System.out.println("sh3 instanceof Circle = " + (sh3 instanceof Circle));
		System.out.println("sh4 instanceof Circle = " + (sh4 instanceof Circle));
		System.out.println("sh5 instanceof Circle = " + (sh5 instanceof Circle));
		
		Shape shape =new Shape("도형", 10, 10);
		System.out.println("부모 Shape 객체를 LadderShape 또는 Circle 인지 검사 ===");
		System.out.println("shape instanceof LadderShape = " + (shape instanceof LadderShape));
		System.out.println("shape instanceof Circle = " + (shape instanceof Circle));
		//4)결론 : instance of로 체크한 타입이 true인 경우에만 해당 클래스로 다운(강제) 캐스팅을 할 수 있습니다.
	}

}

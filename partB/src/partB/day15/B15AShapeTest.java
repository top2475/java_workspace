package partB.day15;

import partB.day14.LadderShape;
import partB.day14.Shape;

public class B15AShapeTest {
	
	public static void main(String[] args) {
		//AShape aShape = new AShape();  *오류: 추상클래스는 객체 생성 못함
		
		AShape otri = new OTriangle();
		System.out.println("=================================");
		AShape ocir = new OCircle(16.5);
		System.out.println("=================================");
		AShape oladder = new OLadderShape("모모 사다리꼴",11,13,23);
		System.out.println("=================================");
		
		AShape[] shapes = new AShape[5]; //AShape 구현 객체를 참조할 배열
		
		//위 객체 참조값을 배열 요소에 저장하기
		shapes[0] = otri;
		shapes[1] = ocir;
		shapes[2] = oladder;
		shapes[3] = new OCircle(22);
		System.out.println("=================================");
		shapes[4] = new OLadderShape("사나 사다리꼴",15,22,25);
		System.out.println("=================================");
		
		otri.shapeName = "삼각형";  shapes[0].width =20; shapes[0].height=16;
		
		System.out.println("AShape 배열에 저장된 도형 객체 출력1======");
		for(int i=0;i<shapes.length;i++)
			System.out.println(shapes[i].toString());
		
		System.out.println("AShape 배열에 저장된 도형 객체 출력2======");
		for(AShape s : shapes) {//shapes 자료 구조에서 순서대로 1개씩 가져와 변수 s에 참조. 향상된 for문
			//System.out.println(s.toString());
			System.out.println("넓이 = " + s.area());}
		
		
		System.out.println("instenceof 복습");
		//1)OLadder 객체인 경우 iamLadder()메소드를 실행 .index를 사용하는 for문 사용
		for(int i=0; i<shapes.length;i++) {
			if(shapes[i] instanceof OLadderShape) {
				OLadderShape temp = (OLadderShape)shapes[i];
				temp.iamLadder();
				
			}
		}
		//2)OCircle 객체인 경우 iamCircle()메소드를 실행 .향상된 for문 사용
		System.out.println("========0번 인덱스 객체 바꾸기========");
		shapes[0] = new OCircle();
			System.out.println("================================");
			for(AShape s : shapes) {
				if(s instanceof OCircle) {
					OCircle temp = (OCircle) s;
					temp.iamCircle();
				}
		
			
		}
	}

}

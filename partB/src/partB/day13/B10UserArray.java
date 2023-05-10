package partB.day13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//참고 : 객체의 배열 연습. String 배열을 참고
public class B10UserArray {
	
	public static void main(String[] args) {
		
		//클래스 타입으로 선언된 변수는 객체의 참조값을 저장!!
		B09User momo = new B09User("twice","김모모",27,100);
		B09User nayeon = new B09User("twice2","나연",25,110);
		B09User dahyeon = new B09User("twice3","다현",28,120);
		B09User zuwi = new B09User("twice4","쯔위",24,133);
	

		//1. 위의 4개 객체를 저장할 배열을 배열크기7로 선언. 배열이름은 twice
	    //   선언된 배열에 4개의 객체를 저장
		B09User[] twice = new B09User[7];
		
		twice[0] = momo;
		twice[1] = nayeon;
		twice[2] = dahyeon;
		twice[3] = zuwi;
		
		//객체 참조변수값을 배열에 전달항 결과 확인
		System.out.println(twice[0]);
		System.out.println(momo);
		System.out.println(twice[0].user());
		System.out.println(momo.user());
		System.out.println("결론 : twice[0]과 momo가 저장한 값은 동일하다. \n" +
		"즉, 같은 객체를 참조하고 있다.");
		
		//2. 위의 선언한 배열의 요소를 모든 필드값 출력. 오류없이 해결
		System.out.println("==배열의 객체 참조 상태 확인==");
		for(int i=0; i<twice.length; i++) {
		System.out.println(twice[i]);}
		
		System.out.println("==배열의 객체 참조 필드값 출력==");
		for(int i=0; i<twice.length; i++) {
			if(twice[i] !=null)
			//객체 null일 때는 메소드 실행 오류**
			System.out.println(twice[i].user());}
		
		//3. 새로운 객체를 생성. 배열 인덱스 4에 저장
		B09User jungyeon = new B09User("twice5","정연",28,150);
		twice[4] = jungyeon;
		//twice[4] = new User("twice5","정연",28,150);
		//객체 참조 변수를 선언하지 않고 바로 배열 요소로 대입
		System.out.println("==새로운 객체를 인덱스4에 대입한 결과==");
		for(int i=0; i<twice.length; i++) {
			if(twice[i] !=null)
				System.out.println(twice[i].user());}
		
		//4.배열에서 참조하는 객체는 User 타입 - User객체의 name필드만 출력하기
		System.out.println("==twice 배열에 저장된 User 객체의 name 필드 출력==");
		for (int i=0; i<twice.length;i++) {
			if(twice[i] != null)
				System.out.println(twice[i].getName());}
		
		//5. User가 불변 객체로 정의되었으므로, 키보드 입력값으로 객체를 생성한다면?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 >>>");
		String id = sc.nextLine();
		System.out.println("이름 입력 >>>");
		String name = sc.nextLine();
		System.out.println("나이 입력 >>>");
		int age = sc.nextInt();
		System.out.println("포인트 입력 >>>");
		int point = sc.nextInt();
		
		twice[5] = new B09User(id,name,age,point);
		System.out.println(twice[5].user());
		
		twice[6] = nayeon; //이미 생성된 객체를 6번으로 인덱스 참조
		
		//6. twice 배열에 저장된 객체들의 age 필드 값 평균을 구해보자.
		double sum = 0.0;
		for(int i=0;i<twice.length;i++) {
			if(twice[i] != null)
				sum += twice[i].getAge();
		}
		System.out.println("나이 합 =" + sum + ", 평균은 = " + sum/twice.length);
		
		System.out.println("==배열 요소 2개를 임의로 null로 변경한 후==");
		twice[4] =null; twice[6]=null;
		sum=0;
		int count =0;
		for(int i=0;i<twice.length;i++) {
			if(twice[i] != null) {
				count++;
				sum += twice[i].getAge();}
			}
		System.out.println("나이 합 =" + sum);
		System.out.println("null이 아닌 객체의 개수 = " + count);
		System.out.println("평균 = " + sum/count);
		
		
		
		
	}
}

# 수업내용요약

##day12 (5.8)

### B02MySimpleMath1
+ 자바의 Math 클래스 메소드를 간단히 구현해보기
                ㄴ static 메소드 또는 static 필드 : 클래스 이름으로 사용
+ 실행에 필요한 main 메소드를 제외하며 이 클래스를 라이브러리 클래스로 만들어 봅니다.
+ 메소드 초버로딩(overloading) : 메소드 시그지처에서 메소드 이름은 같고
인자(매개변수)의 형식과 개수가 다른 형식이 여러개 만들어질 수 있습니다.

### B01MyIntegerValue
+ 데이터를 저장하고 그 데이터에 처리 기능을 갖는 메소드로 구성되는 클래스
+ __인스턴스 필드__ 와  __인스턴스 메소드__ 로 구성 (static 아님)
+ 인스턴스는 새로운 객체를 생성해서 데이터를 저장, 실행
           ㄴ new 연산으로 생성
+ 접근 한정자 테스트 : public, default(package), private

### B04Member
+ 웹에서회원 가입할 때 사용하는 회원 정보를 예시로 클래스를 정의
+ private 필드에 대한 접근 메소드 : getter(읽기), setter(쓰기)
  +getter : 현재 필드값을 리턴하는 형식이 필요
  +setter : 인자값을 받은 매개변수 선언 필요

### Score : 연습 문제
<hr/>

##day13 (5.9)

### Product.java
+ 생성자는 클래스 이름과 동일하며 리턴 타입이 없는 메소드.
+ 기본 생성자만 사용할 떄는 생략하고 명시적으로 정의하지 않음.
+ 생성자는 오버로딩이 가능한 메소드

### Score.java
+ day12의 Score 클래스는 기본 생성자로 동작
+ day13의 Score 클래스는 매개 변수 4개를 받아 초기화하는 생성자만 동작.
+ 기본 생성자의 명시적 정의가 없으므로 기본 생선자 사용 못함
   
### B08StringContructor.java
+ 자바 라이브러리의 String 클래스 생성자들 테스트하기.



## day14 (5.10)

### B11ScoreArray.java
+ 5.9 과제 : Score 객체 배열에 (*객체 참조값)저장하는 연습
+ Score[] studunts = new Score[7];
+ studunts 배열에 저장되는 참조값은 Score 객체를 참조하는 값이다. 다른 객체는 참조할 수 없습니다.
 예를 들면 User 객체는 참조할 수 없는 배열입니다.
+ *이 명령은 Score 객체 7개를 참조할 수 있는 배열을 선언함니다.*

### B12ClassAFamily.java
+ Class.java의 자바 클래스를 생성. 테스트
+ 자식 클래스 partB.day14.ClassAA.java
+ 자식 클래스 partB.day14.ClassAB.java는 protected 테스트
	+ partB.day14.test.B12ClassAFamily.java는 접근 한정자 public,private,default,protected 테스트
 
### B13ShapeTest.java
+ 상속 예시
	+ Shape 부모 클래스
	+ Triangle, circle, LadderShape 자식클래스
+ 상속의 큭징
	+ 자식 객페를 생성할 때 부모 생성자 실행후 자식 생성자 실행. -부모 생성자에서 사용가능한 것을 호출하지 않으면 오류
	+ 자식 클래스는 부모의 메소드를 재정의(overriding)할 수 없다.@override로 표시.(@는 애노테이션)

![v2](./src/partB/partB..day14/상속1.png)

## day15 (5.12)

### 참고 : 다형성 구현(다형성을 애플리케이션에서 구현한다면 필요한 개념들)
+ 상속 또느 인터페이스
+ 메소드 오버라이딩(재정의 또는 구현)
+ 업케스팅 : 자깃 클래스 또는 인터페이스의 구현 클래스 객체를 부모 타입 변수(배열) 또는 인트페이스 타입 변수(배열)에 참조. 배열은 이후에 다양한 자료 구조오 변경되어 데이터를 저장
+ 다운 캐스팅 : 업캐스팅했던 객체를 실제 객체 타입으로 변환.(타입 체크는 instanceof 연산)


### 형변환(Casting)
 + 기본 자료형 변환 : int, double, char,... 자동형변환 / 강제형변환
 + 클래스 타입의 자료형변환 : 상속관계에서 부모와 자식 클래스 사이의 형변환.upcasting,
 
### B14ShapeV2Test.java
+ 형변환(Casting) 
	+ 기본 자료형끼리 변환 : int,double,..., 자동 형변환/강제 캐스팅(명시적 형변환)
	+ 클래스 타입의 자료현 변환 : 상속관계에서 부모와 자식 클래스 사이의 형변환
+ UpCasting : 부모타입 변수에 자식 객체 대입하기(자동 캐스팅)
+ DownCasting : 업캐스팅했던 객체를 다시 자신(자식 클래스) 타입 변수로 참조 시킬 때
+ 다운 캐스팅 할 때에는 instanceof 연산으로 타입체크를 꼭 하고, 결과가 참 일 때만 실행하도록 합니다. sh instanceof Circle은 sh 참보 객체는 new Circle(~~) 생성자로 생성된 것?
sh instance Circle 결과 값이 참 일 떄만 Circle로 다운 캐스팅 합니다. 그렇지 않으면 오류.

### ASape.java
+ 추상 클래스로 선언. 추상 클래스는 직접 객체 생성 안함.
+ 추상메소드를 반드시 선언하는 킇래스.
+ 추상 메소드는 자식 클래스가 반드시 구현(implements). 모든 추상 메소드는 구현해야 합니다.
+ OCircle, OTriangle, OLadderShape 자식 클래스를 구현(AShape 클래스의 구현체)

### B15AShapeTest.java
+ AShape 배열을 생성해서 구현체를 참조 시키고, 업캐스팅/다운캐스팅 연습

### 참고 : 상속의 효과(장점)
+ 반복된 코드 작성은 줄일 수 있습니다.(코드 재사용성 증가)
+ 유지 보수가 쉬워집니다.(클래스의 코그 변경이 공통된 필드/ 메소드에 대해 쉬워짐)
+ 객체 지향의 다형성 실현

### 참고1 : 다형성? poㅣymorphism의 사전적 의미는 동질 이상.
메소드 재정의로 구현할 수 있습니다. area() 메소드는 시그니처가 (동일)같고 실행 내용은 다름.
자식 객체 참조를 업캐스팅해서 __부모 타입으로 참조해서 동일 비단__으로 그룹화 할 수 있기 때문에 가능.

### 참고2 : FINAL 키워드
+ 필드에 사용할 때 static  final 은 상수, final은 값 변경 못하는 인스턴스 필드
+ 메소드에 사용할 때는 자식 클래스가 재정의 할 수 없는 메소드
+ 클래스에 사용할 때는 상속할 수 없는 클래스.
  public final Animal{} 클래스라면 자식 클래스가 만들어 질 수 없다.
  
### 참고3 : Object 클래스
+ 모든 클래스들(자바 라이브러리 블래스와 개발자가 만든 클래스)의 부모 클래스.
+ 상속은 n차 상속이 가능합니다. n차 상속에서 가장 꼭대기에 있는 클래스 object 클래스
 toString() 재정의릏 했던 것은 object의 메소드이다.

### Animal.java
+ 필드 타입과 인스턴스 메소드 인자가 object 클래스인 예시
+ 인스턴스 메소드 iamAnimal은 Object 이니자의 타입을 검사하여 그에 맞는 다운 캐스팅과 메소드 실행을 합니다

### B16ObjectTypeTest.java
+ Animal 클래스의 iamAnimal 메소드 테스트

### solution 패키지
+ Product 쿠상 클래스를 이용한 복습 문제

### B17ArrayLIstTest.java
+ 배열과 ArrayLList 자료 구조 비교

## day17(5.15)

### InterfaceA.java
+ 인터페이스 정의 형식
+ 상수 필드 public static final, 추상메소드는 public abstract : 키워드 생략
+ 인스턴스 메소드 : default 키춰드 작성
+ 상수, *추상 메소드, 인스턴스 메소드, static 메소드만 포함하여 모두 접근 한정자 public임
(*인스턴스 필드는 인터페이스에 사용하지 않습니다)

### ClassA.java
+ InterfaceA의 구현 클래스 정의
+ 추상 메소드는 모두 정의(구현, implements) 했습니다.
 
###C01InterfaceATest,java
+ ClassA 객체 생성
+ 인터페이스 타입으로 변수 선언하는 연습

### beable 패키지
+ Runnable, thinkable, Cookable 인터페이스 정의
+ 구현 클래스 AI, Dog, People 정의
+ BeAble 인터페이스 정의하여 Runnable, thinkable, Cookable의 부모 인터페이스로 수정. 테스트
+ BeAble 인터 페이스의 default 메소드 역활 테스트(소스 파일 주석 참고)

### C02BeAbleTest.java
+ beable 패키지의 구현 클래스 객체 생성
+ 인터페이스를 사용한 다형성 연습 : 구형 클래스의 타입 체크

### C03ComparToTest.java
+ 기본형 타입 데이터 비교 : 관계 연산 <,>
+ String 타입 데이터 비교 : comparTo 메소드

### C04MemberCompareTest.java
+ 기본형, String 타입처럼 객체의 비교를 위한 연습
+ Comparable 인터페이스의 compareTo 메소드를 재정의하는 연습
	+ Member 클래스에서 연습 - 비교할 큭정 필드를 지정.
	+ 단점 : 비교할 필드를 고정시켜야 한다 (name 또는 age 필드 선택)
	+ 수정 사항 : 비교 실행 지점에서 (Runtime)에서 필드를 정하도록 다른 인터페이스를 사용할 예정
+ Member 클래스 객체를 compareTo 메소드로 비교

### C05MySort.java
+ 비교를 사용하는 대표적인 메소드 sort(정렬)  알고리즘 연습
+ 선택 정렬. 인덱스 0부터 시작해서 가장 작은 값을 순서대로 찾는 방법
+ 정렬 방식 : 기본은 오름차순(작=>큰값), 내림차순(큰 =>작은값)

## day 18 (5.16)

### 참고 : 침조 타입 배열(또는 리스트)의 sort 알고리즘
+ 비교와 교환이다.
+ 비교는 참조 타입의 경우 어떤 기준으로 할 것 인지 필드을 정해야 한다.(기본형 C03ComparToTest.java 참고)
  + String 클래스는 필드가 value 변수 1개 이므로 이를 이용하여 이미 재정의 되어있다.
  + 개발자가 만든 클래스는 특정 필드를 정해 주어야 한다.
 
+ Comparable 인터페이스는 비교할 객체의 클래스에 미리 comparTo를 재정의 해야한다.
+ Comparator 인터페이스는 실행 시점에서 비교 기준 필드를 compare 메소드에서 정한다.
	+ Comparator 익명 클래스로 구현해서 인터페이스 타입 변수에 대입시킨 후 sort 메소드 2번째 인자는 변수로 지정
		+ Comparator 구현 클래스로 정의해서 sort 메소드 2번째 인자는 구현 클래스 객체 생성(new 연산)으로 지정
		+ Comparator 타입의 sort 메소드 2번째 인자를 익명 클래스 객체 생성으로 바로 지정


 
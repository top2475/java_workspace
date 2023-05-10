package partB.day14;

public class ClassA {
	
	public int num;
	String title;
	protected String message;
	private String name;
	
	
	//기본 생성자 : 자식 클래스가 기본 생성자노 객체를 생성할 수 있도록 합니다.
	public ClassA() {this.message = "hello~";}
	
	//전체 필드 초기화하는 생정
	public ClassA(int num, String title, String message, String name) {
		this.num=num;
		this.title= title;  //기본 package 접근 권한은 같은 패키지에서만 사용.
		this.message= message;
		this.name= name;
	}
	
	//private 필드는 getter, setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) { //업데이트 예정 : name과 같이 0이면 오류 발생
		this.name = name;
	}
	
	//일반적인 인스턴스 메소드 : 인스턴스 필드 또는 인스턴스 메소드를 사용합니다.
	public String classA() {
		return name + "," + title + "," + message;
	}
	
	//static 메소드 : 객페 생성없이 동작. 인스턴스 필드를 사용하지 않기 때문에 가능
	public static void family() {
		System.out.println("class 부모 클래스입니다.");
	}

}

package partC.day20;

public class Score {
	private final String name;
	private final int java;
	private final int python;
	private final int html;
	private char grade; //�� �ʿ��� �ʵ� x getGrade()�� ���
	
	public Score(String name, int java, int python, int html) {
		this.name=name;
		this.java=java;
		this.python=python;
		this.html=html;
		
	}
	public int sum() {
		return java+python+html;
	}
	public double average() {
		return (double)sum() /3;
	}
	public char getGrade() {
		if(average() >= 90) this.grade='A';
		else if(average() >=80) this.grade='B';
		else if(average() >=70) this.grade='C';
		else this.grade='D';
		return this.grade;
	}
	@Override
	public String toString() {
		return "Score [�̸�=" + name + ", java=" + java + ", python=" + python
				+ ", html=" + html + ", grade=" + (grade==' '? getGrade():grade)
				+ "]";
	}
	
	
}

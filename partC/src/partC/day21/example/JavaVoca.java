package partC.day21.example;

public class JavaVoca { //�ڹ� ���α׷��ֿ� ���̴� ���� �ܾ� 1���� ��� ������ ����(��ü)�� Ŭ���� ����
	
	private String english; //���� �ܾ�
	private String korean; //�ǹ�. ��
	private String level; //Beginner, Intermediate, Advanced �� �ϳ��� ���ڿ��� �����ϱ�
	
    //setLevel(String Level)�� ���ڷ� "1","2","3"�� �޾� �׿� �´� ���ڿ��� �ʵ尪 �����ϱ�

@Override
public String toString() {
return english+"\t"+korean+"_"+level;   //�� ���ڿ��� ����Ǵ� ����
}

public JavaVoca(String english, String korean, String level) {
this.english = english;
this.korean = korean;
this.level = level;
//setLevel(level);
}


//getter, setter ����
public String getEnglish() {
return english;
}
public void setEnglish(String english) {
this.english = english;
}

public String getKorean() {
return korean;
}
public void setKorean(String korean) {
this.korean = korean;
}

public String getLevel() {
return level;
}
public void setLevel(String level) {//����ڴ� �޴� ���� 1,2,3 ���ö�� �� ���� ���� level ���ڿ� ���� ���ϱ�
	this.level = switch(level){         //�ڹ� 12���� ����
    case "1" -> "Beginner";
    case "2" -> "Intermediate";
    case "3" -> "Advanced";
    default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3) : "+level);
    };








}//main class end
	

}

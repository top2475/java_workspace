package partB.day14;

import java.util.Scanner;

class Score {
    private String student;
    private String name;
    private int korea;
    private int english;
    private int science;

    public Score(String student, String name, int korea, int english, int science) {
        this.student = student;
        this.name = name;
        this.korea = korea;
        this.english = english;
        this.science = science;}

    public String getStudent() {return student;}

    public String getName() {return name;}

    public int getKorea() {return korea;}

    public int getEnglish() {return english;}

    public int getScience() {return science;}

    public int sum() {return korea + english + science;}

    public double average() {return (double) sum() / 3;}

    public String toString() {
        return String.format("name=%s, korea=%d, english=%d, science=%d, sum=%d, average=%.2f",
                name, korea, english, science, sum(), average());}
}

public class B11ScoreArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        Score[] students = new Score[10];
        int count = 0;
        while (status) {
            System.out.println("학생번호 입력하세요. >>>> (end=>종료)");
            String student = sc.nextLine();
            if (student.equals("end")) {
                break;}
            
            System.out.println("학생 이름을 입력하세요. >>>>");
            String name = sc.nextLine();
            System.out.println("국어 점수를 입력하세요. >>>>");
            int korea = sc.nextInt();
            System.out.println("영어 점수를 입력하세요. >>>>");
            int english = sc.nextInt();
            System.out.println("과학 점수를 입력하세요. >>>>");
            int science = sc.nextInt();
            students[count] = new Score(student, name, korea, english, science);
            count++;
            sc.nextLine();}
        
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);}
    }
}


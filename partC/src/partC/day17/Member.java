package partC.day17;

//Member Ŭ������ ��ü�� �� �����ϵ��� ���� ���̽� ����ϱ�
public class Member implements Comparable<Member>{//compareTo�� String���� ���� 
		private String id;
		private String name;
		private int age;
		private double point;
		
		public Member(String name,int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getId() {return id;}
		public String getName() {return name;}
		public int getAge() {return age;}
		public double getPoint() {return point;}
		
		//��ü �ʵ尪 ���� ����
		
		public String toString() {
			return String.format("id=%s, name=%s, age=%d, point=%.1f\n",
					id,name,age,point);
		}
        //Comparable<Member> �������̽��� �߻� �޼ҵ� �����ϱ�
		@Override
		public int compareTo(Member o) { //this,name�� ���� ��ü�� o�� name���� ��
			//name �ʵ�� ��
			//return this.name.compareTo(o.getName());
			//age �ʵ�� ���Ѵٸ�? //age �ʵ�� int���̹Ƿ� ���������� ����
			return this.age-o.age; //������ ���
		}

}

package partC.day18;

//day17 Member Ŭ������ �� : Comparable �������̽� ������� ���� => �� �ʵ带 ������Ű�� ����
public class User{
		private String id;
		private String name;
		private int age;
		private double point;
		
		public User(String name,int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getId() {return id;}
		public String getName() {return name;}
		public int getAge() {return age;}
		public double getPoint() {return point;}
		
		
		public void setPoint(double point) {
			this.point = point;
		}

		public String toString() {
			return String.format("id=%s, name=%s, age=%d, point=%.1f\n",
					id,name,age,point);
		}

}

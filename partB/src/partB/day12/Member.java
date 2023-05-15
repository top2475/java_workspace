package partB.day12;

import java.util.Arrays;

//������ȸ�� ������ �� ����ϴ� ȸ�� ������ ���÷� Ŭ������ ����
public class Member {
		private String id;
		private String name;
		private int age;
		private double point;
		private String[] message; //getter�� setter
		
		//private �ʵ忡 ���� ���� �޼ҵ� : getter(�б�), setter(����)
		
		//getter : ���� �ʵ尪�� �����ϴ� ������ �ʿ�
		public String getId() {return id;}
		public String getName() {return name;}
		public int getAge() {return age;}
		public double getPoint() {return point;}
		public String[] getMessage() {return message;}
		
		
		//setter : ���ڰ��� ���� �Ű����� ���� �ʿ�
		public void setId(String id) {this.id=id;}
		public void setName(String name) {this.name=name;}
		public void setAge(int age) {this.age=age;}
		public void setPoint(double point) {this.point=point;}
		public void setMessage(String[] message) {this.message=message;}
		
		//��ü �ʵ尪 ���� ����
		public String member() {
			return String.format("id=%s, name=%s, age=%d, point=%.1f, message=%s\n",
					id,name,age,point,Arrays.toString(message));
		}

}

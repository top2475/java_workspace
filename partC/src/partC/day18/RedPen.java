package partC.day18;

import java.util.Random;

public class RedPen {
	private int n1; //����
	private int n2; //����
	private char op; // +.-,*,/ �� �ϳ��� ����
	private boolean isCorrect; //�⺻�� false. ��������
	
	//Ŀ���� ������
	public RedPen(char op) {
		this.op = op; //op �ʵ�(������)�� �ʱ�ȭ�ϴ� ������
	}
	
	public RedPen() {
	}

	public boolean isCorrect() {  //isCorrect getter
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {  //isCorrect setter
		this.isCorrect = isCorrect;
	}
	
	public void make() {//n1,n2 �ʵ尪 ������ �����Ͽ� ����
		
		Random r = new Random();
		//���ο� ���� ���� Ŭ����. r.nextInt(50)�̸� 50���� ���� ������ ������ ������.
		
		//���� ���� n1�� min1~max1, n2�� min2~max2
		int max1=0, min1=0, max2=0, min2=0;
		
		//�����ڿ� ���� n1, n2 ���� ������ �ٸ��� �սô�(�ּ��� �䱸���� ����)
		switch(op) {
		case '+' : //case �ڿ� ����, ����, ���ڿ�
			max1=99; min1=11; max2=99; min2=11;
			break;
		case '-' : //n1>n2 (���� ����� ����� �������� �մϴ�.)
			max1=99; min1=11; max2=11; min2=3;
			break;
		case '*':   //n2 �������� ���� ũ�⸦ �۰� �մϴ�.
			max1=77;min1=11;max2=11;min2=3;
			break;
		case '/' : //n1 �������� ���� ũ��, n2 ���� �۰�
			max1=99; min1=50; max2=30; min2=11;
			break;
		}
		n1 = r.nextInt(max1-min1+1)+min1; //n1�� min1~max1 ������ ����
		n2 = r.nextInt(max2-min2+1)+min2; //n1�� min1~max1 ������ ����
	}
		public String problem() { //������ ���ڿ��� ����.
			return n1 + " " + op + " " + n2 + " = ";
		}
		public int answer() {		//������ int ����
			int result=0;

			switch (op) {
			case '+':
				result = n1+n2;
				break;
			case '-':
				result = n1-n2;
				break;
			case '*':
				result = n1*n2;
				break;
			case '/':
				result = n1/n2;
				break;	
			default:
				throw new IllegalArgumentException("�߸��� �������̹Ƿ� ó�� ���մϴ�.");
			}
			return result;
		}
		@Override
		public String toString() {
			return "RedPen [n1=" + n1 + ", n2=" + n2 + ", op=" + op + 
					"] isCorrect=" + (isCorrect? "����" :"����") + "]";
		}


}

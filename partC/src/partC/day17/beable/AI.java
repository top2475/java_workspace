package partC.day17.beable;

public class AI implements Thinkable{
	
	protected char op;
	
	@Override
	public int calculate(int a, int b) {
		int result =0;
		switch (op) {
		
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
		default:
			result=a+b;
			//�߸��� op�ʵ尪�� ���� �߻� op�ʵ� �ʱⰪ? '  ' �Դϴ�.
			//throw new IllegalArgumentException("Unexpected value: " + op);
	}
		return result;
	}

	@Override
	public String beAble() {
		return null;
	}

	@Override
	public void think() {
		
	}
}
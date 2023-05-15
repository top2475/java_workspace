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
			//잘못된 op필드값은 오류 발생 op필드 초기값? '  ' 입니다.
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
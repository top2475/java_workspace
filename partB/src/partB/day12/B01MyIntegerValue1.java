package partB.day12;

//�����͸� �����ϰ� �� �����Ϳ� ó�� ����� ���� �޼ҵ�� �����Ǵ� Ŭ����
//          �ν��Ͻ� �ʵ�� �ν��Ͻ� �޼ҵ�� ���� (static �ƴ�)
//          �ν��Ͻ��� ���ο� ��ü�� �����ؼ� �����͸� ����, ����
public class B01MyIntegerValue1 {

	//1)Ŭ������ Ư�� �� �ν��Ͻ� �ʵ� ����
	int value1;   //default �Ǵ� package ���� ����
	int value2;
	
	
	//2)ó�� ���(����) �� �ν��Ͻ� �޼ҵ� ����
	public int add()
	{return value1 + value2;}	
	public int subtract()
	{return value1 - value2;}	
	public int multiply()
	{return value1 * value2;}	
	public int divide()
	{return value1 / value2;}	
	public int remaind()
	{return value1 % value2;}	

    //3)private ���� ����� �׽�Ʈ
	
	private String name;
	
	//private ������ ������ �޼ҵ�
	public void name(String name) {
		this.name = name; //����(this) �� ��ü�� name �ʵ� ���� �簳���� name ���� ������ �� �޾ƶ�.
	}//name = name; ��밡�� ������ ��� name���� Ȯ��
	
	//private ������ ������ �޼ҵ�
    public String getName() {
    	return name;
    }
	
	//private ������ ����� �޼ҵ�
	public void printName() {
		//int count; 4���� ��. ���� ������ �ʱⰪ �� �ʿ�
		System.out.println("�� ��ü�� name = " + name);
		//System.out.println(count); ���� : �ʱⰪ ����
	}
	
	//4) public ���� ����� �⺻�� �׽�Ʈ
	public String message;
	public int result;
	public boolean isOK;
	
	//private test �� �޼ҵ�
	
	
	
}
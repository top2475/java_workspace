package testA01;

//[2] Product Ŭ������ �߻�Ŭ������ �����ϰ�
public abstract Product {
	//[1] Product Ŭ������ ���ڿ� Ÿ�� ����ǰ�� �ʵ�� ������ Ÿ�� �����ݡ� �ʵ带 ���� �����ϼ���.
	//�ʵ���� prdName, price �Դϴ�.
	// �ʵ� ���� �����ڸ� protected�� �մϴ�
	protected String prdName;
	protected int price;
	
        public Product() {}  //�⺻ ������
	
     	public Product(String prdName, int price) { //Ŀ���� ������
		super();
		this.prdName = prdName;
		this.price = price;
	}
	
	//sell �̶�� �߻�޼ҵ带 pubic ���� �����ϼ���. : �޼ҵ��� ����Ÿ���� String, ���ڴ� Object 1�� �Դϴ�
	public abstract String cell(Object object);
	
	
	
}

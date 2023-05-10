package partB.day13;

import java.util.Arrays;

//���θ����� ������ ��ǰ������ �����ϴ� ���÷� Ŭ���� ����. ������ �޼ҵ� �����ε��� �ٽ�
public class B06Product {
	//�ν��Ͻ� �ʵ� (���� ����)
	private long code;
	private String productName;
	private long price;
	private String company;
	
	//�����ڴ� Ŭ������ �̸��� ���� �޼ҵ� �Դϴ�. ���� Ÿ���� ���� ����.
	//Ŭ���� ���ο� ������ ������ �����ߴٸ�, �����Ϸ��� �߰�ȿ{}�� ������
	//����ִ� �⺻ ������(Default Constructor)�� ����Ʈ �ڵ忡 �ڵ����� �߰�
	//�����ڵ� �޼ҵ��̹Ƿ� �����ε��� �����մϴ�.
	//this() �Ǵ� this(�Ű�������) �� ���� ������ ȣ�⵵ �����մϴ�.
	public B06Product() { //�⺻������, code �ʵ��� �ʱⰪ ����
		this.code = 999999999L; //�ǵڿ� L�� long Ÿ�� ���ͷ� ǥ��}
	}
	
	public B06Product(String productName) {//������ ��Ȱ�� �ʱ�ȭ
		this(); //�⺻ ������ ȣ��. �ٸ� ������ �޼ҵ� ȣ���� �׻� �Ǿտ�
		this.productName = productName;
	}
	
	//public Product(String company) {this.company=company;}
	//�޼ҵ� �ñ״�ó(���� ���İ� ����) ������ 2���� ���ÿ� ���� ����
	
	public B06Product(long price) {this.price=price;}
	
	public B06Product(long price, String company) {
		this.price = price;
		this.company = company;
	}
	
	public B06Product(String productName, long price, String company) {
		this.productName = productName;
		this.price = price;
		this.company = company;
	}
	
	//��� �ʵ尪�� �ʱ�ȭ�ϴ� �����ڸ� ����� ������. �Ű����� 4�� ��� �޴� ����
	public B06Product(long code, String productName, long price, String company) {
		super();
		this.code = code;
		this.productName = productName;
		this.price = price;
		this.company = company;
	}
	//getter
	public long getCode() { return this.code;}
	public String getProduckName() {return this.productName;}
	public long getPrice() {return this.price;}
	public String getCompany() {return this.company;}
	
	//setter
	public void setCode(long code) {this.code = code;}
	public void setProductName(String productName) {
		this.productName = productName;}
	public void setPrice(long price) {this.price = price;}
	public void setCompany(String company) {this.company = company;}
	
	//��� �ʵ尪���� ���ڿ� ����
	public String product() {
		return String.format("code(��ǰ�ڵ�)=%s, productName(��ǰ��)=%s, price(����)=%d, company(������)=%s",
				code,productName,price,company);
	}
	
	

}

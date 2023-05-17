package koreait;
//理쒗삙由�
public abstract class Product {
	
	//[1]
	protected String prdName;
	protected int price;
	
	
	//[2]
	public abstract String sell(Object object);
	
	
	@Override
	public String toString() {
		return String.format("가격 : %d, 상품명 : %s" ,price,prdName);
	}

}

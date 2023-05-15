package solution;

public abstract class Product {
	protected int price;
	protected String prdName;
	
	public Product() {}
	
	public Product(int price, String prdName) {
		this.price = price;
		this.prdName = prdName;}
	
	public abstract String sell(Object oj);

	public int getPrice() {
		return price;
	}

	public String getPrdName() {
		return prdName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	
	@Override
	public String toString() {
		return "力前疙 : " + prdName + ", 力前 啊拜 : " + price;
	}
}

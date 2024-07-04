package lx.com.storeMange;
import java.util.ArrayList;

public class Store {
	
	String name;
	ArrayList<Customer> customerList = new ArrayList();
	ArrayList<Product> productList =  new ArrayList();
	
	public void setCustomer(Customer customer) {
		customerList.add(customer);
	}
	
	public void setProduct(Product product) {
		productList.add(product);
	}
	
	public void pay(Customer customer, Product product) {
		
		customerList.add(customer);
		productList.add(product);
		
		// 구매 금액 추가
		Customer.totalBuyFee += product.getPrice();
		
		// 판매 금액 추가
		Product.totalSellFee += product.getPrice();
	}
}

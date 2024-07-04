package lx.com.storeMange;
import java.util.ArrayList;

public class Store {
	
	String name;
	ArrayList<Customer> customers = new ArrayList();
	ArrayList<Product> productList =  new ArrayList();
	
	public void setCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void setProduct(Product product) {
		productList.add(product);
	}
	
	public ArrayList<Customer> getCustomerList () {
		return customers;
	}
	
	public ArrayList<Product> getProductList() {
		return productList;
	}
	
	public void pay(Customer customer, Product product) {
		
		// 구매하면 store에 customer 추가, 해당고객 product list에 상품 추가
		this.setCustomer(customer);
		customer.setCustoemrProduct(product);
		
		// 구매 금액 추가
		Customer.totalBuyFee += product.getPrice();
		
		// 판매 금액 추가
		Product.totalSellFee += product.getPrice();
		
		System.out.println("토탈고객 구매 가격" + Customer.totalBuyFee);
		System.out.println("총금액" + Product.totalSellFee);
	}
}

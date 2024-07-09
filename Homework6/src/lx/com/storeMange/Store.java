package lx.com.storeMange;
import java.util.ArrayList;
import java.util.HashMap;

public class Store {
	
	String name;
	ArrayList<Customer> customerList = new ArrayList();
	ArrayList<Product> productList =  new ArrayList();
	ArrayList<Product> sellProductList = new ArrayList();
	
	// 키: 날짜 / 팔린제품
	HashMap<String, ArrayList<Product>> dayToSoldProductList = new HashMap<String, ArrayList<Product>>();
	
	// 키: 날짜 / 팔린 총 금액
	HashMap<String, Integer> dayToTotal = new HashMap<String, Integer>();
	
	public void setCustomerList(Customer customer) {
		customerList.add(customer);
	}
	
	// 스토어에 발주될 목록임
	public void setProduct(Product product) {
		productList.add(product);
	}
	
	public ArrayList<Customer> getCustomerList () {
		return customerList;
	}
	
	public ArrayList<Product> getProductList() {
		return productList;
	}
	
	public void setDayToSoldProductList(String date, Product proudct) {
		this.sellProductList.add(proudct);
		this.dayToSoldProductList.put(date, this.sellProductList);
	}
	
	public HashMap<String, ArrayList<Product>> getDayToSoldProductList() {
		return dayToSoldProductList;
	}
	
	public void setDayToTotal(String date, int totalFee) {
		this.dayToTotal.put(date, totalFee);
	}
	
	public HashMap<String, Integer> getDayToTotal() {
		return dayToTotal;
	}
	
	public void pay(Customer customer, Product product) {
		
		// 구매하면 store에 customer 추가, 해당고객 product list에 상품 추가
		if (this.customerList.contains(customer)) {
			this.setCustomerList(customer);
		}
		
		customer.setCustoemrProduct(product);
		
		// 내가 산 총금액 추가
		customer.setBuyTotalFee(product.getPrice());
		
		// 판매 금액 추가
		Product.totalSellFee += product.getPrice();
		
		// 구매할 때 날짜: 물건들이 쌓여야함
		String today = Util.makeToday();
		this.setDayToSoldProductList(today, product);
	}
	
	public void  calculateMoney() {
		// 구매할 때 날짜: 정산금액
		String today = Util.makeToday();
		this.setDayToTotal(today, Product.totalSellFee);
	}
	
	
}

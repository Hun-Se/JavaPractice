package lx.com.storeMange;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.text.SimpleDateFormat;


public class Util {
	
	public static Product makeProduct(Store store, String name, int price) {
		Product product = new Product();
		product.setNmae(name);
		product.setPrice(price);
		
		store.setProduct(product);
		
		return product;
	}
	
	public static void printListSize(Store store) {
		ArrayList<Customer> customerList = store.getCustomerList();
		ArrayList<Product> productList = store.getProductList();
		System.out.println("등록된 고객 수 "+ customerList.size());
		System.out.println("등록된 제품 수 " + productList.size());
	}

	public static void printTotalFee(Customer customer) {
		System.out.println(customer.name);
		System.out.println("구매 가격: " + customer.getBuyTotalFee());
		System.out.println("총금액: " + Product.totalSellFee);
	}
	
	public static void makeExample(Store store) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
	    calendar.add(Calendar.DATE, -1);
		int yesterday = calendar.get(Calendar.DATE);

		for (int i = yesterday; i > 0; i--) {
			if (i == 0) { return; }
			System.out.println(i);
		    SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
		    String dateStr = format.format(calendar.getTime());
		    System.out.println(dateStr);
		    
		    store.sellProductList.clear();
			int totalFee = 0;
		    ArrayList<Product> productList = store.getProductList();
		    for (Product product : productList) {
		    	store.setDayToSoldProductList(dateStr, product);
		    	totalFee += product.getPrice();
		    }
		    store.setDayToTotal(dateStr , totalFee);

		    calendar.add(Calendar.DATE, -1);

		    
		}
	
	}
	
	public static String makeToday() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
		String dateStr = format.format(date);
		
		return dateStr;
	}
}

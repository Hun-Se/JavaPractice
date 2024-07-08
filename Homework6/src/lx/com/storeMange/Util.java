package lx.com.storeMange;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.io.DataInputStream;
import java.text.SimpleDateFormat;

public class Util {
	
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
	
	public static void makeExample() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		
		// 이번달 날짜 생성하기
		for (int i = 0; 1 < calendar.DATE; i++) {
			System.out.println(i);
			SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
			calendar.add(calendar.DATE, -1);
			String dateStr = format.format(calendar.getTime());
			System.out.println(dateStr);
		}		
	
	} 
}

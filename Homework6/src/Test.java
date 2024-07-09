import java.util.ArrayList;
import java.util.HashMap;

import lx.com.storeMange.Customer;
import lx.com.storeMange.Product;
import lx.com.storeMange.Store;
import lx.com.storeMange.Util;

public class Test {

	public static void main(String[] args) {
				
		Store store1 = new Store();
		
		Customer customer1 = new Customer();		
		customer1.setName("짱구");
		customer1.setAge(10);
		customer1.setPhone("010-1111-1111");
		
		store1.setCustomerList(customer1);
		
		Customer customer2 = new Customer();
		customer2.setName("맹구");
		customer2.setAge(5);
		customer2.setPhone("111-1111-1111");
		
		Product product1 = Util.makeProduct(store1, "초코파이", 1000);
		Product product2 = Util.makeProduct(store1, 
				
				
				"죠스바", 2000);
		Product product3 = Util.makeProduct(store1, "스크류바", 700);
		Product product4 = Util.makeProduct(store1, "하리보", 500);
		
		store1.pay(customer1, product1);
		store1.pay(customer1, product2);
		store1.pay(customer2, product1);
		
		Util.makeExample(store1);
		
		// 정산하기
		store1.calculateMoney();
		
		HashMap<String, ArrayList<Product>> DayToSoldProductList = store1.getDayToSoldProductList();
		HashMap<String, Integer> dayToTotal = store1.getDayToTotal();
		
		System.out.println(DayToSoldProductList.keySet());
		
		for (String key : DayToSoldProductList.keySet()) {
			System.out.println(key);
			System.out.println(DayToSoldProductList.get(key).size());
			for (Product product : DayToSoldProductList.get(key)) {
				System.out.println(product.getName() + ": " + product.getPrice());
			}
			System.out.println("총합계: " + dayToTotal.get(key));;
			System.out.println("---------------------------------------------------------------");
		}
		


		
		Util.printTotalFee(customer1);
		Util.printTotalFee(customer2);
		Util.printListSize(store1);
		

	}

}

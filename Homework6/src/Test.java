import java.util.ArrayList;

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
		
		Product product1 = new Product();
		product1.setNmae("초코파이");
		product1.setPrice(1000);
		
		Product product2 = new Product();
		product2.setNmae("죠스바");
		product2.setPrice(2000);
		
		store1.setCustomerList(customer1);
		store1.setProduct(product1);
		
		Customer customer2 = new Customer();
		customer2.setName("맹구");
		customer2.setAge(5);
		customer2.setPhone("111-1111-1111");
		
		
		store1.pay(customer1, product1);
		store1.pay(customer1, product2);
		store1.pay(customer2, product1);
		
//		Util.printTotalFee(customer1);
//		Util.printTotalFee(customer2);
//		Util.printListSize(store1);
		
		Util.makeExample();

	}

}

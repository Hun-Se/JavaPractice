import java.util.ArrayList;

import lx.com.storeMange.Customer;
import lx.com.storeMange.Product;
import lx.com.storeMange.Store;

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
		
		store1.setCustomer(customer1);
		store1.setProduct(product1);
		
		
		store1.pay(customer1, product1);
		store1.pay(customer1, product2);
		
		
		ArrayList<Customer> customerList = store1.getCustomerList();
		ArrayList<Product> productList = store1.getProductList();
		
		System.out.println(customerList.size());
		System.out.println(productList.size());
		
		
		

	}

}

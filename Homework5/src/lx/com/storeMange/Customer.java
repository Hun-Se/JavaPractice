package lx.com.storeMange;

import java.util.ArrayList;

public class Customer {
	
	String name;
	int age;
	String phone;
	ArrayList<String> productList;
	static int totalBuyFee;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhohne() {
		return phone;
	}

}

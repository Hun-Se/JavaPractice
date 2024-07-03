package com.lx;

import java.util.ArrayList;

public class Fish {
	
	public String name;
	
	public ArrayList<String> children = new ArrayList<>();

	
	public void setName(String name) {
		if (name.length() < 2) {
			System.out.println("붕어빵의 이름은 두 글자 이상이여야 합니다.");
		}
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Fish(String name) {
		this.name = name;
		
		children.add("붕어빵1");
		children.add("붕어빵2");
	}


	public void swim() {
		System.out.println("물고기가 헤엄칩니다.");
	}
	
}

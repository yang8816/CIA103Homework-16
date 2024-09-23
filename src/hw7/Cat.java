package hw7;

import java.io.Serializable;

public class Cat extends HW7_05 implements Serializable,Animal{
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}

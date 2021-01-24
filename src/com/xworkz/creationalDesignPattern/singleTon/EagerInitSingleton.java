package com.xworkz.creationalDesignPattern.singleTon;

public class EagerInitSingleton {
	
	static final EagerInitSingleton instance = new EagerInitSingleton();
	
	private EagerInitSingleton() {
		System.out.println("Invoking private constructor of "+this.getClass());
	}

	public static EagerInitSingleton getinstance() {
		return instance;
	}
	
}

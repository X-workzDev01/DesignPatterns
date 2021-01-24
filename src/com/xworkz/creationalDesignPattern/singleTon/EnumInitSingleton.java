package com.xworkz.creationalDesignPattern.singleTon;

public enum EnumInitSingleton {

	INSTANCE;
	
	private EnumInitSingleton() {
		System.out.println("invoking "+this.getClass().getSimpleName());
	}
}

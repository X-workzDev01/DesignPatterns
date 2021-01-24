package com.xworkz.creationalDesignPattern.singleTon;

public class StaticBlockSingleton {
	static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
		System.out.println("Invoking private constructor of " + this.getClass());
	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			System.err.println(e.getMessage().getClass());
		}
	}

	public static StaticBlockSingleton getinstance() {
		return instance;
	}
}

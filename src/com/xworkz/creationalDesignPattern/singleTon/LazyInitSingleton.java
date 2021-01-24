package com.xworkz.creationalDesignPattern.singleTon;

public class LazyInitSingleton {

	static LazyInitSingleton lazyInitSingleton;

	private LazyInitSingleton() {
		System.out.println("invoke " + this.getClass().getSimpleName());
	}

	public static synchronized LazyInitSingleton getlazyInitInstance() {
		if (lazyInitSingleton == null)
			lazyInitSingleton = new LazyInitSingleton();
		return lazyInitSingleton;
	}
}
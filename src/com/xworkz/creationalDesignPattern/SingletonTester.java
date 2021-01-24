package com.xworkz.creationalDesignPattern;

import com.xworkz.creationalDesignPattern.singleTon.EagerInitSingleton;
import com.xworkz.creationalDesignPattern.singleTon.EnumInitSingleton;
import com.xworkz.creationalDesignPattern.singleTon.LazyInitSingleton;
import com.xworkz.creationalDesignPattern.singleTon.StaticBlockSingleton;

public class SingletonTester {

	public static void main(String[] args) {

		System.out.println(EnumInitSingleton.INSTANCE);
		//System.out.println(EagerInitSingleton.getinstance());
		//System.out.println(StaticBlockSingleton.getinstance());
		//System.out.println(LazyInitSingleton.class);
		//System.out.println(LazyInitSingleton.getlazyInitInstance());
		//System.out.println("instance 2"+LazyInitSingleton.getlazyInitInstance());
	}
}

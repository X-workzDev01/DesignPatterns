package com.xworkz.structuralDesignPattern;

import com.xworkz.structuralDesignPattern.adapterDesignPattern.SocketAdapter;
import com.xworkz.structuralDesignPattern.adapterDesignPattern.SocketAdapterIml;
import com.xworkz.structuralDesignPattern.adapterDesignPattern.Volt;

public class AdapterTest {

	public static void main(String[] args) {
		SocketAdapter adapter = new SocketAdapterIml();
		
		Volt volt3=getVolt(adapter, 3);
		Volt volt12=getVolt(adapter, 12);
		Volt volt120=getVolt(adapter, 120);
		Volt volt50=getVolt(adapter, 50);
		
		System.out.println("volt3 = "+volt3.getVolts());
		System.out.println("volt12 = "+volt12.getVolts());
		System.out.println("volt120 = "+volt120.getVolts());
		System.out.println("volt50 = "+volt50.getVolts());
		
	}

	private static Volt getVolt(SocketAdapter adapter, int i) {
		switch (i) {
		case 3:
			return adapter.get3volt();
		case 12:
			return adapter.get12volt();
		case 120:
			return adapter.get120volt();
		default :
			return adapter.get120volt();
		}
	}
}

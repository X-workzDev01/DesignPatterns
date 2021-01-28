package com.xworkz.structuralDesignPattern.adapterDesignPattern;

public class Socket {
	
	public Volt getVolt(){
		return new Volt(120);
	}
}
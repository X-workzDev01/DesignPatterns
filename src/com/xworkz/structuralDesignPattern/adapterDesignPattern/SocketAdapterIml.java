package com.xworkz.structuralDesignPattern.adapterDesignPattern;

public class SocketAdapterIml implements SocketAdapter{
	
	Socket sock = new Socket();

	@Override
	public Volt get3volt() {
		Volt v =sock.getVolt();
		return convertVolte(v , 40);
	}

	@Override
	public Volt get12volt() {
		Volt v =sock.getVolt();
		return convertVolte(v , 10);
	}

	@Override
	public Volt get120volt() {
		
		return sock.getVolt();
	}
	
	private Volt convertVolte(Volt v , int i) {
		return new Volt(v.getVolts()/i);
	}

}

package com.adapter;

public class Adapter implements Json {

	Xml xml;

	public Adapter(Xml xml) {
		
		this.xml = xml;
	}

	@Override
	public void test3() {
		xml.test1();
		
	}

	@Override
	public void test4() {
		xml.test2();
	}
	
	
}

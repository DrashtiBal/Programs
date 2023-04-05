package com.adapter;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		
		
		Xml class1=new XmlClass();
		Json class2=new JsonClass();
		
		Json json=new Adapter(class1);
		
		System.out.println("xml");
		class1.test1();
		class1.test2();
		
		System.out.println("json");
		class2.test3();
		class2.test4();
		
		System.out.println("With adapter calss");
		json.test3();
		json.test4();
	}
}

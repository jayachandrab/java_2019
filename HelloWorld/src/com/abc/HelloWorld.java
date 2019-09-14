package com.abc;

class A{
	static int y;
	int x;
	A(int a){
		x=2;
		System.out.println("parameterized a constructor " + a);
	}
	
	A(){
		x=0;
		System.out.println("Default");
	}
	
	public void m1() {
		System.out.println("m1");
	}
	
	public static void myMethod() {
		y=20;
		System.out.println("Static method in A");
	}
	
}


public class HelloWorld {

	//This is the access modifier of the main method. It has to be public so that java runtime can execute this method. 
	//When java runtime starts, there is no object of the class present
	//Java programming mandates that every method provide the return type. Java main method doesn’t return anything
	//This is the name of java main method. It’s fixed and when we start a java program
	HelloWorld(){
		
		System.out.println("constructor");
		
	}
	
HelloWorld(int a){
		
		System.out.println("constructor " + a);
		
	}
	public static void main(String[] args) 
	{
		
		A ob1=new A();
		
		A ob=new A(66);
		
		ob1.m1();
		ob.m1();
		
		
//		HelloWorld obj1=new HelloWorld();
//		
//		HelloWorld obj=new HelloWorld(5);
//		
//		obj.myMethod1();
//		obj1.myMethod1();
//		
//		obj.myMethod2();
//		
//		obj1.myMethod3(2, 3);
//		obj.myMethod3(5,30);
//		
//		HelloWorld.myMethod2();
//		
//		//int res=obj.returnMethod(30, 30);
//		System.out.println(obj.returnMethod(30, 30));
//		String res=obj.returnString(30, 30);
//		System.out.println(res);
	}
	
	
	public void myMethod1() {

		System.out.println("My method");
	}
	
	
	public void myMethod3(int a,int b) {
		System.out.println(a+b);
	} 
	
	public int returnMethod(int a,int b) {
		return a+b;
	} 
	
	public String returnString(int a,int b) {
		
		
		return "result "+(a+b);
	} 
	
	public static void myMethod2() {
		System.out.println("static method");
	}
	

	
	
}



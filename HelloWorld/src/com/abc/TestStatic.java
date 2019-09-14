package com.abc;

class stat{
	static int a;
	int b;
	void main() {
		a++;
		b++;
		System.out.println("Static "+a);
		System.out.println("Non static"+b);
	}
	
	void main2() {
		a++;
		b++;
		System.out.println("Static "+a);
		System.out.println("Non static"+b);
	}
}
public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		stat ob=new stat();
		ob.main();
		ob.main2();
		
		stat ob1=new stat();
		ob1.main();
		ob1.main2();
	}

}

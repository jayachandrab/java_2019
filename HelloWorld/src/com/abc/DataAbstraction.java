package com.abc;


interface Ab{
	
	 abstract void hello(); // it doent have any body
	
	
}

class implement implements Ab
{
	public void hello() {
		System.out.println("abstract hello world");
	}
	
	void hi() {
		
	}
	
	
	
	
}
public class DataAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ab ob=new implement(); 
		
		implement ob1=new implement();
		
		ob.hello();
		
		

	}

}



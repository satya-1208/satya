package polymorphism;

public class JNTU20  extends JNTU19 {

	int i=12;
	
	void sum(){
		int a;
		int b;
		int t;
		a=20;
		b=40;
		t=a+b;
		
		System.out.println(t+super.i);
		System.out.println(t+this.i);
	}
	
	void  multiply(){
		
		int a;
		int b;
		int t;
		a= 12;
		b=4;
		t=a*b;
		System.out.println(t);
	
		
	}
	
	void display (){
		
		this.sum();
		
		
		
	}
	
	void display2(){
		
		super.sum();
	}
	
	
	
}

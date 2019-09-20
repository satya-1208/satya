package polymorphism;

public class Example1 {

	void add (int a, int b) {
			int t;
		t=a+b;
	
		System.out.println(t);
			
	}
	
	void add (int a, int b, int c){
		
		int t;
		t=b+c-a;
		
		System.out.println(t);
		
	}
	
	void add (float a, float b){
		
		float t;
		t=a+b;
		System.out.println(t);
		
	}
	
	
}

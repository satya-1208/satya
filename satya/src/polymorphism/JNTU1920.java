package polymorphism;

public class JNTU1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JNTU19 row1_19 = new JNTU19();
		row1_19.sum();
		JNTU20 row1_20 = new JNTU20();
		row1_20.sum();
			
		JNTU19 row2 = new JNTU20();
		row2.sum();
		row1_20.multiply();
		row1_20.display();
		row1_20.display2();
			
			
	}

}


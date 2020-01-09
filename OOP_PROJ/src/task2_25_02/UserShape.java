package task2_25_02;

public class UserShape {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.r = 5;
		c1.findS();
		c1.findP();
		System.out.println("P = " + c1.p);
		System.out.println("S = " + c1.s);
		System.out.println("STOP");
	}

}

package task2_25_02;

public class Circle extends Shape{

	double r;
	
	@Override
	double findP() {
		p = Math.PI * 2 * r ;
		return p;
	}
	
	@Override
	double findS() {
		s = Math.PI * Math.pow(r, 2);
		return s;
	}
}

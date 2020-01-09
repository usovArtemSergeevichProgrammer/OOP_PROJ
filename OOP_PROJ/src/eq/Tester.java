package eq;

import java.util.Date;

public class Tester {

	public static void main(String[] args) {
		

//		Object o = new Object();	
//		boolean b1 = o.equals(o);
//		Object o_copu = o;
//		boolean b1_ = o_copu.equals(o);
//		System.out.println(b1);
//		System.out.println(b1_);
//		
//		Object o2 = new Object();
//		boolean b2 = o.equals(o2);
//		System.out.println(b2);
		
		Company c1 = new Company(123, new Date(), "IBM");
		Company c2 = new Company(123, new Date(), "IBM");
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		Employee e1 = new Employee(23, "Dimon", "Petrov", c1, "Twester", 1200, 23);
		Employee e2 = new Employee(23, "Dimon", "Petrov", c2, "Tester", 1200, 23);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}

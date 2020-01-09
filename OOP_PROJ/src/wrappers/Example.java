package wrappers;

public class Example {

	static void test1(int a) {
		System.out.println(a);
	}

	static void test2(Object a) {
		System.out.println(a);
	}

	public static void main(String[] args) {

		int i = 7;
		int ii = 8;
		Integer obj_i = new Integer(i);// since 1-5
		Integer obj_ii = ii;// since 5->.....autoboxing- автоупаковка,примитив
							// станет объектом

		// try {
		// Integer from_str = new Integer("as123");
		// } catch (NumberFormatException e) {
		// e.printStackTrace();
		// }

		Integer obj_from_str = new Integer("123");

		int z = Integer.parseInt("123");
		System.out.println(z);

		int zz_old = obj_from_str.intValue();
		int zz = obj_from_str;

		test1(obj_ii);
		test2(i);

		Object o = obj_ii;

		test1((Integer) o);

		int array[] = { i, ii, obj_from_str, obj_ii, (Integer) o };
		Boolean b = new Boolean(false);
		Boolean b2 = new Boolean("TRUE");
		Boolean b3 = new Boolean("YES");
		Boolean b4 = new Boolean(!b2);
		Boolean b5 = new Boolean(!(!b4));
		boolean bb = true;

		Boolean flags[] = { b, b2, b3, b4, b5, new Boolean(bb).booleanValue() };
		for (Boolean flag : flags) {
			System.out.println(flag);
		}
	}

}

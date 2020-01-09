package wrappers;

public class Task {

	static long summa(String a, String b) {

		Long result = null;
		try {
			result = Long.parseLong(a) + Long.parseLong(b);
		} catch (NumberFormatException e) {
			System.err.println("Bad input. A = " + a + " B = " + b);
			e.printStackTrace();
		}

		return result;

	}

	static Boolean isSmart(String marks[], Integer iq) {
		int sum = 0;
		int count = 0;
		for (String m : marks) {
			int val = 0;
			try {
				val = Integer.parseInt(m);
				if (val >= 0 && val <= 10) {
					sum += val;
					count++;
				} else {
					System.err.println("Not valid mark = " + val);
				}

			} catch (NumberFormatException e) {
				System.err.println("Not parseble String");
			}
		}

		double avg = 0.0;
		if (count > 0) {
			avg = sum / (double) count;
		}

		return avg >= 8 && iq >= 120;

	}

	static void printDoubleOnle(Object o) {
		if (o instanceof Object[]) {
			Object arr[] = (Object[]) o;
			for (Object obj : arr) {
				if (obj != null) {
					try {
						if (obj instanceof String) {
							System.out.println(Double.parseDouble((String) obj));
						} else if (obj instanceof Number) {
							System.out.println(obj);
						} 
					} catch (Exception e) {
						System.out.println("Something goes wrong : " + e.getClass());
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		String a = "100";
		String b = "200";
		System.out.println(summa(a, b));

		String marks[] = { "8", "8", "8", "8", "8" };
		int iq = 130;
		System.out.println(isSmart(marks, iq));

		Object arr[] = { new Double("12.3"),true, 112.47, 56.72, new String("77.0"), new Object(), Integer.MAX_VALUE };
		printDoubleOnle(arr);
	}

}

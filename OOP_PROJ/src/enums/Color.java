package enums;



public enum Color {

	RED("#f40") {
		@Override
		void action(int a) {
			System.out.println(a * (-1));

		}
	},
	GREEN("#f50") {
		@Override
		void action(int a) {

			System.out.println(a + 1);
		}
	},
	BLACK("#f60") {
		@Override
		void action(int a) {

			System.out.println(a + a);
		}
	};

	Color(String code) {
		this.code = code;
	}

	abstract void action(int a);

	private String code;

	public String getCode() {
		return code;
	}

}

class EnumTester {
	public static void main(String[] args) {
		Color color = Color.BLACK;
		int x = 100;
		switch (color) {

		case BLACK:
			color.getCode();
			color.action(x);
			break;
		case GREEN:
			color.getCode();
			color.action(x);
			break;
		case RED:
			color.getCode();
			color.action(x);
			break;

		default:
			break;
		}
	}
}
package enums;

public enum Days {

	MONDAY(1) {
		@Override
		void action(int n) {
			System.out.println("Hello");

		}
	},
	TUESDAY(2) {
		@Override
		void action(int n) {
			// TODO Auto-generated method stub

		}
	},
	WEDNESDAY(3) {
		@Override
		void action(int n) {
			// TODO Auto-generated method stub

		}
	},
	THURSDAY(4) {
		@Override
		void action(int n) {
			// TODO Auto-generated method stub

		}
	},
	FRIDAY(5) {
		@Override
		void action(int n) {
			// TODO Auto-generated method stub

		}
	},
	SATURDAY(6) {
		@Override
		void action(int n) {
			// TODO Auto-generated method stub

		}
	},
	SUNDAY(7) {
		@Override
		void action(int n) {
			// TODO Auto-generated method stub

		}
	};

	private int num;

	private Days(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	abstract void action(int n);

	Days getDay(int key) {
		switch (key) {
		case 1:
			return MONDAY;
		case 2:
			return TUESDAY;
		case 3:
			return WEDNESDAY;
		case 4:
			return THURSDAY;
		case 5:
			return FRIDAY;
		case 6:
			return SATURDAY;
		case 7:
			return SUNDAY;

		default:
			return null;
		}

	}
}

class DayTester {
	public static void main(String[] args) {
		Days day = null;
		day.getDay(1);
	}
}

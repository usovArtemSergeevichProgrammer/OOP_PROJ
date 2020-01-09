package tester25_02;

public class Zoo {

	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.age = 5;
		l1.name = "Alex";
		l1.isWild = true;
		l1.weight = 150;
		l1.numOfLifes = 7;
		l1.isKing = true;
		
		Lion l2 = new Lion();
		l2.age = 1;
		l2.name = "Simba";
		l2.isWild = true;
		l2.weight = 120;
		l2.numOfLifes = 3;
		l2.isKing = false;

		Lion pride[]= {l1,l2};
		for (Lion lion : pride) {
			System.out.println(lion.toString());
			lion.toString(3);
		}
		
		Tiger t = new Tiger();
		t.name = "Alex";
		Tiger t_copy = null;
		try {
			t_copy = (Tiger) t.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t_copy.eat();
		food(t_copy);
		food(l2);
	}
	
	static void food(Eatable e){
		e.eat();
	}

}

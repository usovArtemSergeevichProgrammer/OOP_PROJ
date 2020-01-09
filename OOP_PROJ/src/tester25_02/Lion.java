package tester25_02;

public class Lion extends Cat{

	boolean isKing;

	@Override
	public String toString() {
		return "Lion [isKing=" + isKing + ", weight=" + weight + ", numOfLifes=" + numOfLifes + ", isWild=" + isWild
				+ ", name=" + name + ", age=" + age + "]";
	}
	
	//Overloading - перегрузка метода.В большинстве случаев разширает базовый функционал.Сигнатура метода не совпадает с СУППЕР методов
	public String toString(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(toString().toUpperCase());
		}
		return "Lion [isKing=" + isKing + ", weight=" + weight + ", numOfLifes=" + numOfLifes + ", isWild=" + isWild
				+ ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void eat() {
		
		System.out.println("Lion -> eat");
		
	}

	@Override
	public int compareTo(Animal o) {
		
		return 0;
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
}

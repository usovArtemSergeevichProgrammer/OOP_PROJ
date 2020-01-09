package tester25_02;

public abstract class Cat extends Animal{
	
	double weight;
	int numOfLifes;
	boolean isWild;
	@Override
	public String toString() {
		return "Cat [weight=" + weight + ", numOfLifes=" + numOfLifes + ", isWild=" + isWild + ", name=" + name
				+ ", age=" + age + "]";
	}

	
}

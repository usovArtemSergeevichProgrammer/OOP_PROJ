package tester25_02;

public class Tiger extends Cat{

	int numOfLine;

	@Override
	public String toString() {
		System.out.println("NOT Supported");
		return null;
	}

	@Override
	public void eat() {
		
		System.out.println("Tiger -> eat");
		
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

package tester;

public class CarsFactor {

	public static void main(String[] args) {
		Cars c1 = new Cars();
		Cars c2 = new Cars();
		Cars c3 = new Cars();
		Cars c4 = new Cars();
		Cars c5 = new Cars();

		c1.model = "BMW";
		c1.color = "Black";
		c1.maxSpead = 240;
		c1.price = 50000;
		c1.vEnjener = 5.5;

		c2.model = "Audi";
		c2.color = "White";
		c2.maxSpead = 290;
		c2.price = 70000;
		c2.vEnjener = 3.0;

		c3.model = "BMW X6";
		c3.color = "Black";
		c3.maxSpead = 240;
		c3.price = 50000;
		c3.vEnjener = 5.8;

		c4.model = "Mersedes";
		c4.color = "Red";
		c4.maxSpead = 340;
		c4.price = 150000;
		c4.vEnjener = 6.6;

		c5.model = "Ferrary";
		c5.color = "Red";
		c5.maxSpead = 500;
		c5.price = 550000;
		c5.vEnjener = 9.1;
		
		Person p2 = new Person();
		p2.age = 55;
		p2.iq = 30;
		p2.lastName = "Tyson";
		p2.name = "Mike";	
		
		c1.owner = p2;
		c2.owner = p2;
		c3.owner = p2;
		c4.owner = p2;
		c5.owner = p2;
		

		Cars arr[] = { c1, c2, c3, c4, c5 };
		for (Cars cars : arr) {
			System.out.println("COLOR is " + cars.color);
			System.out.println("MODEL is " + cars.model);
			System.out.println("SPEAD is " + cars.maxSpead);
			System.out.println("V ENGINE is " + cars.vEnjener);
			System.out.println("PRICE is " + cars.price);
			System.out.println("OVNER INFO: " );
			Test.printPersonInfo(cars.owner); 
			System.out.println("=========================");
		}
	}

}

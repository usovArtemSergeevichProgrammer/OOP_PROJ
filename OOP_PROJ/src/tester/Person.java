package tester;

public class Person {

	int iq;
	int age;
	String name;
	String lastName;

	// char gender;
	// Person personsRel[];

	public void sayHallo() {
		System.out.println("Person -> sayHello()");
	}

	public void dance() {
		System.out.println("Person -> dance()");
	}

	public void printInfo() {
		System.out.println("IQ is " + iq);
		System.out.println("AGE is " + age);
		System.out.println("NAME is " + name);
		System.out.println("LAST NAME is " + lastName);
		// System.out.println("GENDER " + gender);

	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int iq, int age, String name, String lastName) {
		super();
		this.iq = iq;
		this.age = age;
		this.name = name;
		this.lastName = lastName;
	}
}

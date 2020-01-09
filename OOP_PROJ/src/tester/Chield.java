package tester;

public class Chield extends Person{
	
	int hobby[];
	boolean school;
	int classNumber;
	String plays[];
	
	
	public void play(){
		System.out.println("Chield -> play()");
	}

	public void goToSchool(){
		System.out.println("Chield -> goToSchool()");
	}
	
	public void makeHomeWork(){
		System.out.println("Chield -> makeHomeWork()");
	}
	
	public void printInfo(){
		super.printInfo();
		System.out.println("Class number is " + classNumber);
		System.out.println("HOBBY is ");
		Utils.printArray(hobby, true);
		System.out.println("SCHOOL is " + school);
		}
}

package tester;

public class Student extends Person implements Cloneable{
    
    double avg;
    String groupNumber;
    int[] marks;
    int course;
    boolean isBRSM;
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    }
    
    
    
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Student(int iq, int age, String name, String lastName, double avg, String groupNumber, int[] marks, int course, boolean isBRSM) {
        super(iq, age, name, lastName);
        this.avg = avg;
        this.groupNumber = groupNumber;
        this.marks = marks;
        this.course = course;
        this.isBRSM = isBRSM;
    }



    


    public void printInfo() {
        super.printInfo();
        System.out.println("AVG is " + avg);
        System.out.println("Group Number is " + groupNumber);
        System.out.print("MARKS is ");
        Utils.printArray(marks, true);
        System.out.println("Take a part BRSM? -> " + isBRSM);
        
    }
    
    
    public void drink() {
        System.out.println("Student : " + " -> drink()");
    }
    
    public void learn() {
        System.out.println("Student : " + name + " -> learn()");
    }
    

    public void dance() {
        drink();
        System.out.println("Dance like Studen!Yahoo!");
    }
    
}
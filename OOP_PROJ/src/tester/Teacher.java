package tester;

public class Teacher extends Person{
    
    double salary;
    int exp;
    String groups[];
    String tech[];
    Cars car;
    
    
    
    
    
    
    public Teacher() {
        super();
        // TODO Auto-generated constructor stub
    }



    public Teacher(int iq, int age, String name, String lastName, double salary, int exp, String[] groups, String[] tech, Cars car) {
        super(iq, age, name, lastName);
        this.salary = salary;
        this.exp = exp;
        this.groups = groups;
        this.tech = tech;
        this.car = car;
    }



    

    public void teach() {
        System.out.println("Teacher : " + name + " -> teach()");
    }
    
    public void beLate() {
        System.out.println("Teacher : " + name + " -> beLate()");
    }
    
}

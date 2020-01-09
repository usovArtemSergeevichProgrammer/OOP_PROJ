package tester;

public class Univer {

	public static void clubEnter(Person p) {
		System.out.println("Person : " + p.name + " / " + p.lastName + " in club!");	
	}
		//DMI - dynamic method invocation(Вызов методов
	//DMD - dynamic method dispatch
		static void test(Person p){
			System.out.println("------------------------------------");
			p.sayHallo();
			p.dance();
			p.printInfo();
			
			//вернет true если тип р относится к студенту
			if(p instanceof Student){
				((Student)p).drink();
			}else if(p instanceof Teacher){
				((Teacher)p).beLate();
			}
			System.out.println("via classes");
			if(p.getClass()== Student.class){
				((Student)p).drink();
			}else if(p.getClass() == Teacher.class){
				((Teacher)p).beLate();
			}
		
	}

	public static void main(String[] args) {

//		Student st1 = new Student();
//		st1.age = 20;
//		st1.avg = 9;
//		st1.course = 2;
//		st1.groupNumber = "J1819";
//		st1.iq = 120;
//		st1.isBRSM = false;
//		st1.lastName = "Jordan";
//		st1.name = "Mike";
//		st1.marks = new int[4];
//		st1.marks[0] = 8;
//		st1.marks[1] = 9;
//		st1.marks[2] = 9;
//		st1.marks[3] = 7;
//		st1.gender = 'm';
//
//		Teatcher t1 = new Teatcher();
//		t1.age = 43;
//		t1.exp = 10;
//		t1.iq = 122;
//		t1.groups = new String[4];
//		t1.groups[0] = "J1819";
//		t1.groups[1] = "X1819";
//		t1.groups[2] = "Y1819";
//		t1.groups[3] = "Z1819";
//		t1.lastName = "Ivanov";
//		t1.name = "Ivan";
//		t1.salary = 2000;
//		t1.tech = new String[2];
//		t1.tech[0] = "Math";
//		t1.tech[0] = "Programming";
//		t1.car = new Cars();
//		t1.car.model = "BMW";
//		t1.car.color = "White";
//		t1.car.owner = t1;
//		t1.gender = 'w';
//		t1.personsRel = new Person[1];
//		t1.personsRel[0]= st1;
//		
//		
//		Chield ch1 = new Chield();
//		ch1.age = 17;
//		ch1.classNumber = 11;
//		ch1.hobby = new int[2];
//		ch1.hobby[0] = 10;
//		ch1.hobby[1] = 20;
//		ch1.iq = 79;
//		ch1.lastName = "Taison";
//		ch1.name = "Mike";
//		ch1.school = true;
//		ch1.gender = 'm';
//
//		// int arrayOfMarks[] = st1.marks;
//
////		st1.learn();
////		st1.drink();
////		t1.beLate();
////		t1.teach();
////
////		st1.sayHallo();
////		t1.sayHallo();
//		
//		clubEnter(st1);
//		clubEnter(t1);
//		clubEnter(ch1);
		

		
        String groups[] = {"J1819", "J1919"};
        String tech[] = {"Math", "Programming"};
        Cars c = new Cars();
        c.color = "Black";
        c.model = "BMW";
        c.price = 50000;
        
        Teacher t = new Teacher(90,50,"John", "Johnson", 5000,
                10,groups, tech, c);
        int marks[] = {9, 9, 9, 10};
        Student s = new Student(77, 22, "Mike", "Tyson" , 9.52, 
                "J1819", marks, 3, true  );
                
		//UPCASTING(не меняет сам обект)
        
        Person p1 = t;
        Person p2 = (Person)s;
        
        test(p1);
        test(p1);
        
        //DOWNCASTING-небезопасен в JAVA.может бросать исключения(ClassCastException).требует явного приведения.после приведения обьект возврощает себе его интерфейс
        Teacher t1 = (Teacher)p1;
        Student s1 = (Student)p2;//UPCASTING - операция проведения типов к суперклассу,всегда безопасно в JAVA/после этой опперации у этого опьекта интерфейс будет сужен к интерфейсу СУПЕРКЛАССА

//        System.out.println(t);
//        System.out.println(s);
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(t1);
//        System.out.println(s1);
        
        test(t1);
        test(s1);
        
        
        Student s2 = new Student(77, 22, "Mike", "Tyson" , 9.52, "J1819", marks, 3, true  );
        System.out.println(s2.lastName);
        Student s3 = null;
		try {
			s3 = (Student) s2.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        s2.lastName = "Jordan";
        System.out.println(s3.lastName);
	}
	

}

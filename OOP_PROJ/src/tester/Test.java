package tester;

public class Test {

	public static void printPersonInfo(Person p) {
		System.out.println("NAME IS " + p.name);
		System.out.println("LAST NAME IS " + p.lastName);
		System.out.println("AGE IS " + p.age);
		System.out.println("IQ IS " + p.iq);
	}

	public static void main(String[] args) {

		// TYPE=CLASS=TEMPLATE=������----------���� � ����

		// 1.��������� ���������� ���� Person,"p" ����� ��������� ����������
		// ���� Person
		// 2.new Person() ------ �������� ���������� � ����(� ����)
		// 3. = ------ ����������

		Person p;
		p = new Person();// Instance(object) creation => ���������

		// ����������....�������������
		// ������������� ����� �������� ����� ����������
		// <.> ------ ���������
		// <var_name><field_name><val_of_field_type>
		// FIED = PROPERTIES = ���� = ��������
		
		p.age = 31;
		p.iq = 89;
		p.name = "Bob";
		p.lastName = "Dylan";
		//printPersonInfo(p);
		
		Person p2 = new Person();
		p2.age = 55;
		p2.iq = 30;
		p2.lastName = "Tyson";
		p2.name = "Mike";	
		printPersonInfo(p2);
		
		Person arr[] = {p,p2};
		for (Person person : arr) {
			printPersonInfo(person);
			System.out.println("================");
		}
		

	}

}

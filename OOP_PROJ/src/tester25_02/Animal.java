package tester25_02;

public abstract class Animal implements Eatable,Cloneable,Comparable<Animal>{

	String name;
	int age;
	//@Override- ��������������� ������ ������������� ������,������������ �������� ����� ���������� ��������� ������.� ���� �� �������� ��������� ��� ��������� � �����.������
	@Override
	public String toString(){
		return "Animal[name=" + name + ",age = " + age +"]";
	}
	
}

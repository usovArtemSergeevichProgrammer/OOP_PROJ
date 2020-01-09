package tester25_02;

public abstract class Animal implements Eatable,Cloneable,Comparable<Animal>{

	String name;
	int age;
	//@Override- переопределение метода родительского класса,обязательным условием будет соблюдение сигнатуры метода.А сама же анотация проверает эту сигнатуру у родит.класса
	@Override
	public String toString(){
		return "Animal[name=" + name + ",age = " + age +"]";
	}
	
}

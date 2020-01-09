package casting;

import tester.Student;
import tester.Teacher;

public class Store {
	
	static void test(Player p){
		System.out.println("Start testing.");
		p.play();
		System.out.println("End testing.");

	}
	
	static void test2(Object o){
		System.out.println("Object ");
		if(o instanceof Player){
			((Player)o).play();
		}
		if(o.getClass()== Player.class){
			((Player)o).play();
		}
	}

	static void test3(Player p){
		System.out.println("TEST 3");
		
		if(p.getClass()== Mp3Player.class){
			((Mp3Player)p).restart();
		}else if(p.getClass()== DVDPlayer.class){
			((DVDPlayer)p).start();
		}else if(p.getClass()== TypePlayer.class){
			((TypePlayer)p).replay();
		}else{
			System.out.println("NOT NOT NOT");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Object o = new Player();
		
		Player p1 = new Player();
		// CASTING -приведение типов
		test(p1);
		test3(p1);
		//UPCASTING
		Player p2 = new Mp3Player();
		test(p2);
		test3(p2);
		//DOWN CASTING
		//Mp3Player p3 = (Mp3Player)new Player();
		
		Mp3Player p4 = (Mp3Player) p2;
		test(p4);
		test3(p4);
		
		Object p5 = p1;
		test2(p5);
		

	}

}

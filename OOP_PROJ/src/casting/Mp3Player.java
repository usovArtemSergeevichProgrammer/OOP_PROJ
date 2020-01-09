package casting;

public class Mp3Player extends Player{

	@Override
	public void play() {
		System.out.println("Mp3Player -> play()");
	}
	
	public void restart(){
		System.out.println("Restart Mp3 -> ");
	}
}

package casting;

public class TypePlayer extends Player{

	@Override
	public void play() {
		System.out.println("TypePlayer -> play()");
	}
	
	public void replay(){
		System.out.println("Replay -> TapePlayer");
	}
}

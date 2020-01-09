package casting;

public class DVDPlayer extends Player{
	
	@Override
	public void play() {
		System.out.println("DVDPlayer -> play()");
	}
	
	public void start(){
		System.out.println("Start DVD ->");
	}

}

package day49;

public class AudioBook extends Book{

	int audioLengt;
	
	public void play() {
		System.out.println("we are playing "+ "<"+author+"'s> "+"book and it's" +" <"+audioLengt+">"+" hour long");
	}
}

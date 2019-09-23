
public class Preperation {
	private static int $;
	
	public static void main(String[] main) {
		Puma puma = new Puma(); System.out.println(puma.getTailLength());
}
	}
interface HasTail { int getTailLength(); }
abstract class Puma implements HasTail {
protected int getTailLength() {
	return 4;}
}
 public class Cougar extends Puma {

}
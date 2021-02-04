package interfaceSegregationPrinciple;

/**
 * An penguin is an animal which can swim then implements {@link ISwimmer}.
 * Also it's alive then implements {@link IAlive}.
 * @author 4lejandroRojas
 *
 */
public class Penguin implements IAlive, ISwimmer{

	@Override
	public void swim() {
		System.out.println("It can swim.");
	}

	@Override
	public void breath() {
		System.out.println("It's an animal, then it can breath.");
	}

}

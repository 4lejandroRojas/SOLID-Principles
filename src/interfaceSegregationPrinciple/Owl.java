package interfaceSegregationPrinciple;

/**
 * An owl is an animal which can fly, then implements {@link IFlyer}.
 * Also it is alive, then implements {@link IAlive}.
 * @author 4lejandroRojas
 *
 */
public class Owl implements IAlive, IFlyer{

	@Override
	public void fly() {
		System.out.println("It can fly.");
	}

	@Override
	public void breath() {
		System.out.println("It's an animal, then it can breath.");
	}

}

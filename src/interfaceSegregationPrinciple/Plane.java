package interfaceSegregationPrinciple;

/**
 * A plane is an object that just can fly, then implements {@link IFlyer}.
 * @author 4lejandroRojas
 *
 */
public class Plane implements IFlyer{

	@Override
	public void fly() {
		System.out.println("It can fly.");
	}
}

package interfaceSegregationPrinciple;

/**
 * A human just is alive, then implements {@link IAlive}.
 * Of course a human can fly but not in a natural way.
 * Just for this example, this human never learn to swim.
 * @author 4lejandroRojas
 *
 */
public class Human implements IAlive{

	@Override
	public void breath() {
		System.out.println("This human can breath.");
	}

}

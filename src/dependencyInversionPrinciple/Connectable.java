package dependencyInversionPrinciple;

/**
 * This interface establish that a connection is conectable to our classes.
 * Also it implements Liskov substitution principle.
 * @author 4lejandroRojas
 *
 */
public interface Connectable {
	void getData();
	void setData();
	//Something else
}

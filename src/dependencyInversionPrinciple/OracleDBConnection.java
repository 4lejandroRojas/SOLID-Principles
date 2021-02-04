package dependencyInversionPrinciple;

/**
 * This is our implementation of Oracle Database.
 * @author 4lejandroRojas
 *
 */
public class OracleDBConnection implements Connectable{

	@Override
	public void getData() {
		System.out.println("logic to get data  in Oracle");
	}

	@Override
	public void setData() {
		System.out.println("Logic to set data in oracle");
	}

}

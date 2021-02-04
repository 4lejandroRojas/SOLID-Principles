package dependencyInversionPrinciple;

/**
 * Maybe next sprint we have to change to MySQL database. 
 * Then with this principle we don't have to change our main code. 
 * @author 4lejandroRojas
 *
 */
public class MySQLDBConnection implements Connectable{

	@Override
	public void getData() {
		System.out.println("logic to get data  in MySQL");
	}

	@Override
	public void setData() {
		System.out.println("Logic to set data in MySQL");
	}

}

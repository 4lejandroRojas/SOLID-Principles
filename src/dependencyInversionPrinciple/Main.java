package dependencyInversionPrinciple;

class Conexion{
	private Connectable connectable;
	
	public Conexion(Connectable connectable) {
		this.connectable = connectable;
	}
	
	public void getData() {
		connectable.getData();
	}
}

public class Main {

	public static void main(String[] args) {
		//This allows to create a conexion to Oracle.
		Conexion conexionOracle = new Conexion(new OracleDBConnection());
		conexionOracle.getData();
		
		//But also when we have to change to MySQL. It will be easy to change
		Conexion conexionMySQL = new Conexion(new MySQLDBConnection()); 
		conexionMySQL.getData();
	}
	
	/*
		Output:
		logic to get data  in Oracle
		logic to get data  in MySQL
	*/
}

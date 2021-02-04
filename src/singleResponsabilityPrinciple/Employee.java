package singleResponsabilityPrinciple;
/**
 * Single responsability is the principle which indicates that a class have only a responsability. This prevents spaggethi code.
 * Employee has to manage responsabilities like add, get, modify but not calculate salary or something like that.
 * @author 4lejandroRojas
 *
 */
public class Employee {
	private String id;
	private String name;
	private Double dailySalary; 
	
	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Double getDailySalary() {
		return dailySalary;
	}

	void setDailySalary(Double dailySalary) {
		this.dailySalary = dailySalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dailySalary=" + dailySalary + "]";
	}
	
	public void addEmployee(String id, String name, String dailySalary) {
		//Create an employee
	}
	
	public void updateEmployee(String id, String name, String dailySalary) {
		//update an employee
	}
	
	
	private Employee getEmployee(String id) {
		//Get employee's data
		return new Employee();
	}
	
	//Calculate monthly salary must be at another class 
	
}

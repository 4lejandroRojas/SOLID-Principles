package liskovSubstitutionPrinciple;

public class Bird extends Animal{

	@Override
	void getDetails() {
		System.out.println("This is a bird, it has wings");
	}
	
}

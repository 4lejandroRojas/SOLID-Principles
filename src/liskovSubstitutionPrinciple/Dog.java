package liskovSubstitutionPrinciple;

/**
 * Subclass of {@link Animal}. 
 * @author 4lejandroRojas
 *
 */
public class Dog extends Animal{

	@Override
	void getDetails() {
		System.out.println("This is a dog, it has 4 paws.");
	}

}

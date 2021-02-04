package liskovSubstitutionPrinciple;

public class Main {

	public static void main(String[] args) {
		//This is better than create an specific method at each class.
		Animal[] animals = {new Dog(), new Bird()};
		
		for(Animal animal: animals) {
			animal.getDetails();
		}
	}
	/*
		Output
		This is a dog, it has 4 paws.
		this is a bird, it has wings
	*/
}

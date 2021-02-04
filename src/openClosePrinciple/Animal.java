package openClosePrinciple;
/** 
 * Open close principles said that a class is open for extension but close for modification.
 * Animal was developed in first iteration, at this time, we don't know that Dolphin will need to implemented.
 * 
 * @author 4lejandroRojas
 *
 */
public class Animal {
	//Correct form, in this way, Dolphin just need extends of Animal and override it sound.
	public void getSound() {
		System.out.println("Animal's sound");
	}
	
	//Incorrect form. What happen if we need a Dolphin?  
	public void getSound(Animal animal) {
		if(animal instanceof Dog) {
			System.out.println("Woof-bad");
		}else if( animal instanceof Duck) {
			System.out.println("Quack-bad");
		}
	}
}

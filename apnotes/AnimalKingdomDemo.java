/* Program AnimalKingdomDemo.java
 * Demonstrates the functionalities of the javastudies.animalkingdom package.
 */

package javastudies.apnotes;

import javastudies.animalkingdom.*;
import java.util.ArrayList;

public class AnimalKingdomDemo
{
	public static void main(String[] args)
	{
		Animal myAnimal = new Animal();
		myAnimal.printStats();
		myAnimal.run(100.0);
		myAnimal.printStats();
		myAnimal.run(0.1);
		myAnimal.printStats();

		Feline myFeline = new Feline();
		myFeline.printStats();
		myFeline.pet();
		myFeline.hunt();
		myFeline.run(20);
		myFeline.printStats();

		Ocelot myOcelot = new Ocelot();
		myOcelot.printStats();
		myOcelot.hunt();
		myOcelot.printStats();
		myOcelot.run(100);
		myOcelot.printStats();
		myOcelot.pet();

		Animal myMaybeOcelot = new Ocelot();
		System.out.println("This is an Animal-reference Ocelot; you can't call Ocelot methods from it.");
		myMaybeOcelot.printStats();
		myMaybeOcelot.run(5);
		myMaybeOcelot.printStats();
		System.out.println("This Ocelot has an Animal reference, but polymorphism lets it lose hunger like an Ocelot.");

		ArrayList<Animal> myAnimalList = new ArrayList<>();
		for (int i = 0; i < 10; i++)
		{
			Animal newAnimal = null;
			switch ((int) (Math.random() * 4))
			{
				case 0:
					newAnimal = new Animal();
					break;
				case 1:
					newAnimal = new Feline();
					break;
				case 2:
					newAnimal = new Ocelot();
					break;
				case 3:
					newAnimal = new Fish();
					break;
			}
			myAnimalList.add(newAnimal);
		}
		for (Animal a : myAnimalList)
		{
			a.eat(20);
			a.printStats();
		}
	}
}

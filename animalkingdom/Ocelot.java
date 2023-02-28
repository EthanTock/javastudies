/* Class Ocelot.java
 * Is a faster animal than Animal, eats less, and can roar.
 */

package javastudies.animalkingdom;

public class Ocelot extends Feline
{
	private static final String ROAR = "ROOOOOAAAAAAAAAARRRRRRR!!!!!!!!!!!!";

	public Ocelot()
	{
		super(20 + Math.random() * 5, 12 + Math.random() * 7, 7, .4 + Math.random() * .1, .7 + Math.random() * .1);
	}

	public void roar()
	{
		System.out.println(this + "says: " + ROAR);
	}

	/* This is an example of polymorphism.
	 * Ocelot.run() will call Animal.addToDistanceTraveled() and Animal.addToTimeTaken(),
	 * but it will also use Ocelot.loseHunger() due to it using this.loseHunger() in Animal's declaration.
	*/
	void loseHunger(int amount)
	{
		System.out.print("HOLY CRAP I DIDN'T LOSE AS MUCH HUNGER!!! I mean ");
		this.roar();
		super.loseHunger((int) (amount * (0.5 + Math.random() * 0.25)));
	}
}


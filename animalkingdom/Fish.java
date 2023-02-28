/* Class Fish.java
 * An Animal that can swim very fast. It can't hold much food, though.
 */

package javastudies.animalkingdom;

public class Fish extends Animal
{
	private static final String BLUB = "BLUB!! blblb bb";
	private double waterDepth;

	public Fish()
	{
		super(18.0, 0.1, 5);
		this.waterDepth = 50;
	}

	public void loseHunger(int amount)
	{
		super.loseHunger(amount / (int) (this.waterDepth / .9));
	}

	public void eat(int pounds)
	{
		if (this.getHunger() + pounds < 15)
			super.eat(pounds);
	}

	public void blub()
	{
		System.out.println(this + " says " + BLUB);
	}
}

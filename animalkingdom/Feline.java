/* Class Feline.java
 * Defines a general set of traits for feline animals. Extends Animal.
 */

package javastudies.animalkingdom;

public class Feline extends Animal
{
	private double fluffiness;
	private double hearingAcuteness;

	public Feline()
	{
		super(2.0, 13.0, 7);
		this.fluffiness = .70 + Math.random() * .10;
		this.hearingAcuteness = .50 + Math.random() * .10;
	}

	public Feline(double swimSpeedPm, double runSpeedPm, int hungerPm, double fluffinessPm, double hearingAcutenessPm)
	{
		super(swimSpeedPm, runSpeedPm, hungerPm);
		this.fluffiness = fluffinessPm;
		this.hearingAcuteness = hearingAcutenessPm;
	}

	public void pet()
	{
		System.out.print("You pet " + this + ". ");
		if (this.fluffiness < 0.20)
			System.out.println("It's not awfully comfortable.");
		else if (this.fluffiness < 0.40)
			System.out.println("You feel small patches of fluff glide along your hands.");
		else if (this.fluffiness < 0.60)
			System.out.println("It brings a little bit of warmth to your soul.");
		else if (this.fluffiness <  0.80)
			System.out.println("You vigorously rub its fur until you can't anymore!");
		else if (this.fluffiness < 1.00)
			System.out.println("Your hands get tangled in the overgrowth of its hair!");
	}

	public void hunt()
	{
		if (this.hearingAcuteness < Math.random())
			System.out.println(this + " hunts but catches nothing.");
		else
		{
			System.out.println(this + " hunts and catches a few small rodents. +5 to hunger!");
			this.eat(5);
		}
	}

	public void printStats()
	{
		super.printStats();
		System.out.printf("Fluffiness: %.2f%nHearing Acutness: %.2f%n%n", this.fluffiness, this.hearingAcuteness);
	}

	public double getFluffiness()
	{
		return this.fluffiness;
	}

	public double getHearingAcuteness()
	{
		return this.hearingAcuteness;
	}
}

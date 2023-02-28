/* Class Animal.java
 * The base class for any animal in the animalkingdom package.
 */

package javastudies.animalkingdom;

public class Animal
{
	private double swimSpeed;
	private double runSpeed;
	private double distanceTraveled;
	private double timeTaken;
	private int hunger;
	private boolean isDead;

	public Animal()
	{
		this.swimSpeed = 5.0 + Math.random() * 2;
		this.runSpeed = 10.0 + Math.random() * 4;
		this.hunger = 5;
	}

	public Animal(double swimSpeedPm, double runSpeedPm, int hungerPm)
	{
		this.swimSpeed = swimSpeedPm;
		this.runSpeed = runSpeedPm;
		this.hunger = hungerPm;
	}

	public void run(double distance)
	{
		if (!this.isDead)
		{
			this.distanceTraveled += distance;
			this.timeTaken += distance / this.runSpeed;
			this.loseHunger((int) distance / 5);
			this.checkIfNoHunger();
		}
	}

	public void swim(double distance)
	{
		if (!this.isDead)
		{
			this.distanceTraveled += distance;
			this.timeTaken += distance / this.swimSpeed;
			this.loseHunger((int) distance / 5);
			this.checkIfNoHunger();
		}
	}

	public void eat(int pounds)
	{
		this.hunger += pounds;
	}

	public double getRunSpeed()
	{
		return this.runSpeed;
	}

	public double getSwimSpeed()
	{
		return this.swimSpeed;
	}

	public double getDistanceTraveled()
	{
		return this.distanceTraveled;
	}

	void addToDistanceTraveled(double distance)
	{
		this.distanceTraveled += distance;
	}

	public double getTimeTaken()
	{
		return this.timeTaken;
	}

	void addToTimeTaken(double time)
	{
		this.timeTaken += time;
	}

	public int getHunger()
	{
		return this.hunger;
	}

	void loseHunger(int amount)
	{
		this.hunger -= amount;
	}

	void checkIfNoHunger()
	{
		if (this.hunger <= 0)
		{
			this.isDead = true;
			System.out.println("Oops! " + this + " died!");
		}
	}

	public boolean isDead()
	{
		return this.isDead;
	}

	public void printStats()
	{
		System.out.printf(
				"%n== Name: %s ==%nRun Speed: %.3f%nSwim Speed: %.3f%nDistance Traveled: %.3f%nTime Taken: %.3f%nHunger: %d%n",
				this,
				this.runSpeed,
				this.swimSpeed,
				this.distanceTraveled,
				this.timeTaken,
				this.hunger
		);
		if (this.isDead)
			System.out.println("Is Dead.\n");
		else
			System.out.println("\n");
	}
}

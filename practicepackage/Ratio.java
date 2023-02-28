/* Class Ratio
 * Takes an int numerator and int denominator as arguments.
 * Use addToDenominator(int) and addToNumerator(int) to change the values.
 * You can use the getRatio() method to get the value of the ratio.
*/

package javastudies.practicepackage;

public class Ratio
{
	private int numerator;
	private int denominator;
	private double ratio;

	public Ratio()
	{
		this.numerator = 1;
		this.denominator = 1;
		this.setRatio();
	}

	public Ratio(int numeratorP, int denominatorP)
	{
		this.numerator = numeratorP;
		this.denominator = denominatorP;
		this.setRatio();
	}

	public void printStats()
	{
		System.out.printf("%d %d %f", this.numerator, this.denominator, this.ratio);
	}

	private void setRatio()
	{
		this.ratio = (double) this.numerator / (double) this.denominator;
	}

	public void addToNumerator(int inc)
	{
		this.numerator += inc;
	}

	public void addToDenominator(int inc)
	{
		this.denominator += inc;
	}

	public double getRatio()
	{
		this.setRatio();
		return this.ratio;
	}

	// This method uses r's private instance variables, because you can do that in the class declaration.
	public Ratio add(Ratio r)
	{
		this.numerator = this.numerator * r.denominator + this.denominator * r.numerator;
		this.denominator *= r.denominator;
		return this;
	}
}

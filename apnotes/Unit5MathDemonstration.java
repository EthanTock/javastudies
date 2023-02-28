package javastudies.apnotes;

import static java.lang.Math.*;

public class Unit5MathDemonstration
{
	public static void main(String[] args)
	{
		int a = 4;
		int b = -5;
		double c = -3.4;

		System.out.println(
			b + " -> Math.abs() -> " + abs(b) + "\n" +
			c + " -> Math.abs() -> " + abs(c) + "\n" +
			b + " " + a + " -> Math.pow() -> " + pow(b, a) + "\n" +
			a + " " + c + " -> Math.pow() -> " + pow(a, c) + "\n" +
			a + " -> Math.sqrt() -> " + sqrt(a) + "\n" +
			c + " -> Math.sqrt() -> " + sqrt(c) + "\n" +
			"Math.random() -> " + random() + "\n" +
			"Math.PI -> " + PI
		);
	}
}

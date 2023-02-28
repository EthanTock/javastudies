/* Program Unit1ClassDemonstraton.java
 * This is a demonstration of the ideal class structure in java, according to College Board.
 */

package javastudies.apnotes;

import java.util.ArrayList;
import javastudies.practicepackage.Ratio;

public class Unit2ClassDemonstration
{
	public static ArrayList<Integer> generateNumbers()
	{
		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			numbers.add((int) Math.floor(Math.random() * 9));
		System.out.println(numbers);
		return numbers;
	}

	// More methods...

	public static void main(String[] args)
	{
		for (int i : generateNumbers())
			System.out.print(i + " ");
		Ratio r = new Ratio(4, 7);
		System.out.println("\n" + r.getRatio());
		System.out.println(r.add(new Ratio(5, 11)).getRatio());
	}
}

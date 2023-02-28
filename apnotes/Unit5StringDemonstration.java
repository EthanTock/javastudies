/* Program Unit5ClassDemonstration.java
 * This program demonstrates String methods in Java.
 */

package javastudies.apnotes;

import javastudies.practicepackage.OccurrenceFinder;

public class Unit5StringDemonstration
{
	public static void main(String[] args)
	{
		String me = "Raetsel";
		String you = "Lonestar";
		String theRestOfUs = "seltsam";

		System.out.println(
				"me =\t\t\"" + me + "\"\n" +
				"you =\t\t\"" + you + "\"\n" +
				"theRestOfUs =\t\"" + theRestOfUs + "\"\n"
		);
		System.out.println(
				"me.length() =\t\t\t" + me.length() + "\n" +
				"you.substring(4) =\t\t" + you.substring(4) + "\n" +
				"you.substring(0, 4) =\t\t" + you.substring(0, 4) + "\n" +
				"theRestOfUs.indexOf(\"sam\") =\t" + theRestOfUs.indexOf("sam") + "\n"
		);
		System.out.println(
				"The first index of a String is 0, and the last is length - 1.\n" +
				"The substring(int begin, int end) returns the indices: begin, begin + 1, ..., end - 1.\n" +
				"The indexOf(String substring) method returns the index of the beginning of the first instance of substring."
		);

		System.out.println("There are " + (new OccurrenceFinder("abaaabab", "ab")).numOccurrences() + " of occurrences of \"ab\" in \"abaaabab\"");
	}
}

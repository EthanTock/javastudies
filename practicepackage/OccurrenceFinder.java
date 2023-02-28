/* Class OccurrenceFinder.java
 * This class will find how many occurrences of 
 * `substring` are found in a given String.
 */

package javastudies.practicepackage;

public class OccurrenceFinder
{
	private String string, substring;
	private int occurrences;

	public OccurrenceFinder(String stringPm, String substringPm)
	{
		this.string = stringPm;
		this.substring = substringPm;
	}

	private void findOccurrences()
	{
		int sliceIndex = this.string.indexOf(this.substring);
		while (sliceIndex != -1)
		{
			this.string = this.string.substring(sliceIndex + this.substring.length());
			sliceIndex = this.string.indexOf(substring);
			this.occurrences++;
		}
	}

	public int numOccurrences()
	{
		if (this.occurrences == 0)
			this.findOccurrences();
		return this.occurrences;
	}
}

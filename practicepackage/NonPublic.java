/* Class NonPublic.java
 *
 * Does not have the public declaration on constructors.
 */

package javastudies.practicepackage;

class NonPublic
{
	private boolean works;
	private int instanceVariable;

	NonPublic()
	{
		this.works = true;
	}

	NonPublic(int instanceVariablePm)
	{
		this.works = true;
		this.instanceVariable = instanceVariablePm;
	}

	int getInstanceVariable()
	{
		return this.instanceVariable;
	}

	boolean works()
	{
		return this.works;
	}
}

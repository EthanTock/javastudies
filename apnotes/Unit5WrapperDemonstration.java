package javastudies.apnotes;

public class Unit5WrapperDemonstration
{
	private static boolean intsEqual(int int1, int int2)
	{
		return (int1 == int2);
	}

	private static void integerMethods(Integer integer)
	{
		System.out.print("My hash code: " + integer.hashCode());
	}

	public static void main(String[] args)
	{
		int i = 4;
		Integer integer1 = 6;
		Integer integer2 = new Integer(6);
		Integer integer3 = new Integer(7);
		Double double1 = 5.55;
		Double double2 = new Double(7.67);

		System.out.print("What works for Integer equality:");
		if (integer1 == integer2)
			System.out.print(" ==,");
		if (integer1.equals(integer2))
			System.out.print(" .equals(),");
		if (integer1.intValue() == integer2)
			System.out.print(" initial intValue(),");
		if (integer1 == integer2.intValue())
			System.out.print(" final intValue(),");
		if (integer1.intValue() == integer2.intValue())
			System.out.print(" both intValue(),");

		System.out.print("\nWhat works for Integer inequality:");
		if (integer1 < integer3)
			System.out.print(" <,");

		System.out.print("\nWhat works for Double inequality:");
		if (double1 < double2)
			System.out.print(" <,");

		System.out.print("\nAuto-unboxing: " + intsEqual(integer1, integer2));
		System.out.print("\nAutoboxing: ");
		integerMethods(i);
	}
}

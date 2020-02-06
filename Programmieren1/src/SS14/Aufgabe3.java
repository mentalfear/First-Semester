package SS14;

public class Aufgabe3
{
	public static void main(String[] args)
	{

		System.out.println(bytesUmrechen(1030)[2]);
	}

	public static int[] bytesUmrechen(int bytes)
	{

		int[] result = new int[4];

		for (int i = 1; i <= result.length; i++)
		{
			result[result.length - i] = bytes % 1024;
			bytes = bytes / 1024;
		}
		return result;
	}

}

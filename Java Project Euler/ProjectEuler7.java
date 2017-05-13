
public class ProjectEuler7 {
	public static void main(String[] args)
	{
		primeTerm(10001);
	}
	
	private static boolean isPrime(int n)
	{
		int ctr = 0;
		for(int i = 2; i < n; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
			else
			{
				ctr++;
			}
		}
		if(ctr == n-2)
		{
			return true;
		}
		return false;
	}
	
	private static void primeTerm(int n)
	{
		int output = 0;
		int ctr = 0;
		while(ctr != n)
		{
			output++;
			if(isPrime(output) == true)
			{
				ctr++;
			}
		}
		System.out.println(output);
	}
}


public class Octal extends Base {
	int number;
	public void conversion(int n)
	{
		number=n;
		int ar[]=new int[100];
		int x=0;
		for(int i=0;n>0;i++)
		{
			ar[i]=n%8;
			n=n/8;
			x=i;
		}
		System.out.print("Octal :");
		for(int i=x;i>=0;i--)
		{
		System.out.print(+ar[i]);
		}
		System.out.println();
	}
}

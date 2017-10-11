
public class Binary extends Base {

	int number;
	public void conversion(int n)
	{
		number=n;
		int ar[]=new int[100];
		int x=0;
		for(int i=0;n>0;i++)
		{
			ar[i]=n%2;
			n=n/2;
			x=i;
		}
		System.out.print("Binary :");
		for(int i=x;i>=0;i--)
		{
		System.out.print(+ar[i]);
		}
		System.out.println();
	}
}

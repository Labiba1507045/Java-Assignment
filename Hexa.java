
public class Hexa extends Base {
	int number;
	public void conversion(int n)
	{
		number=n;
		int ar[]=new int[100];
		int x=0;
		for(int i=0;n>0;i++)
		{
			int a=n%16;
			ar[i]=a;
			n=n/16;
			x=i;
		}
		System.out.print("Hexa :");
		for(int i=x;i>=0;i--)
		{
			if(ar[i]==10) System.out.print("A");
			else if(ar[i]==11) System.out.print("B");
			else if(ar[i]==12) System.out.print("C");
			else if(ar[i]==13) System.out.print("D");
			else if(ar[i]==14) System.out.print("E");
			else if(ar[i]==15) System.out.print("F");
			else System.out.print(+ar[i]);
		}
		System.out.println();
	}
}

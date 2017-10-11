import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Base n=new Base();
		Base n1=new Binary();
		Base n2=new Octal();
		Base n3=new Hexa();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		n.conversion(x);
		n1.conversion(x);
		n2.conversion(x);
		n3.conversion(x);

	}

}

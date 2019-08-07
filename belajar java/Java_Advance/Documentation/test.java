import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai = ");
		int n = scan.nextInt();
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
		System.out.println("");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(n+1-j==i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
		System.out.println("");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==i || n+1-j==i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}

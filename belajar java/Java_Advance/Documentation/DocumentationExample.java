
public class DocumentationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1");
		for(int i = 1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.print("("+j+","+i+")");
			}
			System.out.println();
		}
		System.out.println("2");
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				if(j ==  i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println("3");
		for (int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				if(10-j == i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		System.out.println("4");
		
		for(int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++)
			{
				if(j == i)
				{
					System.out.print("*");
				}
				else if (9+1-j == i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		System.out.println("5");
		
		for (int i=1; i<= 9; i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j <= i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println("6");
		
		for(int i=1;i<=9;i++)
		{
			for (int j=1;j<=9;j++)
			{
				if(j==i)
				{
					System.out.print("*");
				}
				else if(9+1-j == i)
				{
					System.out.print("*");
				}
				else if(9/2+1 == j)
				{
					System.out.print("*");
				}
				else if (9/2+1==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		System.out.println("7");
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(9+1-j <= i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		System.out.println("8");
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i % 2 == 0)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		System.out.println("9");
		
		
		for (int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j % 2==0)
				{
					System.out.print("-");
				}
				else 
				{
					System.out.print("+");
				}
			}
			System.out.println();
		}
		
		System.out.println("10");
		for(int i=0;i<9;i++)
		{
			int n = i * 2;
			System.out.print(n+" ");
		}
		
		System.out.println("");
		for(int i=1;i<=9;i++)
		{
			int n = i * 2 - 1;
			System.out.print(n+" ");
		}
	}

}

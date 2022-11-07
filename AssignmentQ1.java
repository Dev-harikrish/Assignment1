
public class AssignmentQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		for (int i=0; i<=n-1;i++)
		{
			for (int j=0; j<=n-1;j++)
			{
				if (j==(n-1)/2 || i==0 && j<n-1|| i==n-1 && j<n-1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
			
			for (int j=0; j<=n-1;j++)
			{
				if (i==j || j==0 && i>0 || j==n-1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<=n-1;j++)
			{
				if (i==0 && j>n/4 || j==n/4 && j>0|| i==n-1 && j>n/4|| i==(n-1)/2 && j>n/4)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<=n-1;j++)
			{
				if (j==n-1 || j==n/4 || i==n-1 && j>n/4)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<=n-1;j++)
			{
				if (j==n/4 || i==0 && j>n/4 || j==n-1 && i<(n-1)/2 || i==(n-1)/2 && j>n/4 || i==j && i>(n-1)/2)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<=n-1;j++)
			{
				if (j==n/4 && i>0 && i<n-1 || j==n-1 && i>0 && i<n-1 || i==0 && j>n/4 && j<n-1 || i==n-1 && j>n/4 && j<n-1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<=n-1;j++)
			{
				if (i==j && j>n/4|| j==n/4 || j==n-1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
		System.out.println();
		}
		
	}

}

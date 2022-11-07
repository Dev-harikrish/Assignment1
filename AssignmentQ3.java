
public class AssignmentQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=15;
		
		for( int i=0; i<=n-1; i++)
		{
			for (int j=0; j<=n-1; j++)
			{
				if (i==n-1 || j==0 || j==n-1 || i+j<(n-1)/2 || j-i>(n-1)/2 || i==0)
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

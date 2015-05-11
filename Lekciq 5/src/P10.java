import java.util.Scanner;


public class P10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);   
		System.out.println("Enter the size of matrix :");
		int n=input.nextInt();
		int a[][]=new int[n][n];
		
		int d,c,i,j,l,m,k;
		d=n-1;
		c=0;    
		for(i=0;i<=(n+1)/2;i++)
		{
			for(j=i;j<=d;j++)   
				a[i][j]=++c;
				for(l=i+1;l<=d;l++)   
				a[l][d]=++c;
	 
				for(k=d-1;k>=i;k--)    
				a[d][k]=++c;
	 
				for(m=d-1;m>i;m--)  
				a[m][i]=++c;
	 
				d--;            
			}
	 
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			System.out.print(a[i][j]+"\t");
		System.out.println();
		}
		input.close();

	}

}

//8.3.4.1.5.9.6.7.2
import java.util.*;
class MagicMatrix 
 {
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,j,h1=0,h2=0,h3=0;
		int v1=0,v2=0,v3=0;
		int d1=0,d2=0,d3=0,d4=0;
		int a[][]=new int[10][10];
		System.out.println("Enter the matrix element ");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				a[i][j]=sc.nextInt();
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				if(i==0)
				 	h1+=a[i][j];
				if(i==1)
					h2+=a[i][j];
				if(i==2)
					h3+=a[i][j];
				///////////vertical
				if(j==0)
					v1+=a[i][j];
				if(j==1)
					v2+=a[i][j];
				if(j==2)
					v3+=a[i][j];
			}
		try{
		System.out.print("! Loading.....");
		Thread.sleep(2000);
		System.out.print("...");
		Thread.sleep(2000);
		System.out.println(".....");
		Thread.sleep(2000);
		}
		catch(Exception e){}

		d1=a[0][0]+a[1][1]+a[2][2];
		d2=a[0][2]+a[1][1]+a[2][0];
		if(h1==h2&&h2==h3&&h3==v1&&v1==v2&&v2==v3&&v3==d1&&d1==d2)
		{
			System.out.println("Great! You Have Solved This Puzzle*");
		}
		else
		{
			System.out.println("Opps!All the Sides Are Not Equal:)");
		}

		int b[]={h1,h2,h3};
		System.out.println("                ["+d2+"]");
		System.out.println("                 /");
		for(i=0;i<3;i++)
		{
			if(b[i]<10)
			{
			System.out.print("[0"+b[i]+"]=");
			}
			else
			{
					System.out.print("["+b[i]+"]=");
			}
			for(j=0;j<3;j++)
			{
				if(a[i][j]<10)
				{
				System.out.print("[0"+a[i][j]+"]");
				
				}
				else
				{
					System.out.print("["+a[i][j]+"]");
				}
			}
			System.out.println(" ");
		}
		System.out.println("      |   |    |   ^");

		System.out.println("["+d1+"] ["+v1+"]["+v2+"]["+v3+"]   ["+d1+"]");

	}	
}
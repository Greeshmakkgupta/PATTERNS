import java.util.Scanner;
public class Kanak {
    public static void main(String args[])
    {
        int i,j,n;
        int k=2;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j<=(n-i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
output:
7
****** 
*****  
****   
***    
**     
*  
   
  
 

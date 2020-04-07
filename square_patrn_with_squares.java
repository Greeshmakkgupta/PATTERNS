import java.util.Scanner;
public class Kanak {
    public static void main(String args[])
    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=129;i<(129+n);i++)
        {
            for(j=129;j<(129+n);j++)
            {
                System.out.print((char)i);
            }
            System.out.print("\n");
        }
    }
}
output:
4




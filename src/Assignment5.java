/**
 * Created by pooja on 5/7/17.
 */
public class Assignment5 {
    public static void main(String  args[])
    {
        int n=8;
        for (int i=0;i<n;i++)
        {
            for (int j=(2*n+1)/2;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<(2*i+1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/**
 * Created by pooja on 5/7/17.
 */
public class Assignment7 {
    public static void main(String  args[])
    {
        int n=4;
        for (int i=0;i<n-1;i++)
        {
            for (int j=(2*(n-i)-1)/2;j>0;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<(2*i+1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pooja");
        for(int i=n-1;i>0;i--)
        {
            for (int j=(2*(n-i)+1)/2;j>0;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

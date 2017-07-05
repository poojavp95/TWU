import java.util.ArrayList;

/**
 * Created by pooja on 5/7/17.
 */
public class Assignment9 {
    public ArrayList<Integer> primefactors(Integer n)
    {
        ArrayList<Integer> arrayList = new ArrayList<>() ;
        int num=n;
        for(int i=2;i<=num;i++)
        {
            if(n%i == 0)
            {
                arrayList.add(i);
                while(n%i == 0)
                {
                    n/=i;
                }
            }
        }
        return arrayList;
    }
    public static void main(String args[])
    {
        Assignment9 a = new Assignment9();
        ArrayList<Integer> ans = a.primefactors(370);
        System.out.println(ans);
    }
}

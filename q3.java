import java.util.*;
public class Main
{
    public static boolean triplet(double a[])
    {
        if(a.length<3) return false;
        Arrays.sort(a);                   //sorting array bcz order doesnt matter here
        for(int i=0;i<a.length-2;i++)
        {
            int s=i+1,e=a.length-1;       //setting start and endpoint of remaining array
            while(s!=e)
            {
                double sum = a[i]+a[s]+a[e];
                if(sum<2)                       //checking for given constraints
                {
                    if(1<sum) return true;    //if sum is less then a biggr no. is required
                    else s++;                //so start point is shifted to right to try bigger number
                }
                else e--;    //if sum is greater than required than less no. is needed so end point is decremented
            }
        }
        return false;
    }
    public static void main(String[] args)
	{
	    double a[] = { 0.6, 0.7, 0.8, 1.2, 0.4 };
	    
	    System.out.println( triplet(a) );
	}
}
// time = n(1+log(n))
// space = 1
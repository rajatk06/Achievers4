import java.util.*;
public class Main
{
    public static int[] maxSum(int a[])
    {
        if(a.length==0)
        { return a;}
        int max=a[0],m=a[0],start=0,end=0;    //initialising variables
        for(int i=1;i<a.length;i++)
        {
            if(m<0&&a[i]>=0) 
            {
               m = a[i]; start=i;        //storing starting index of sub array
            }    
            else m = a[i]+m;                          //sum till ith number
            
            if(m>max) { max = m; end = i; }        //update max value //storing ending index of sub array
        }
        return Arrays.copyOfRange(a,start,end+1);
    }
	public static void main(String[] args)
	{
	    int a[] = { 10, -1, 2, -200, 4, 100 };
	    
	    System.out.println( Arrays.toString(maxSum(a)) );
	}
}
//time = O(n)
//space = 1 
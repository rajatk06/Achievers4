import java.util.*;
public class Main
{
    public static boolean greaterNums(int a[])
    {
        Arrays.sort(a);                 
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==a.length-i+1) return true;  //counting no. of elements greater than current element & comparing
        }
        return false;
    }
    public static void main(String[] args)
	{
	    int a[] = { 5,4,6,3,7,2,8 };
	    
	    System.out.println( greaterNums(a) );
	}
}
// time = n^2
// space = 1
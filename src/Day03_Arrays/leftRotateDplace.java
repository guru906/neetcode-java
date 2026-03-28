package Day03_Arrays;
import java.util.*;
public class leftRotateDplace {
    public static void main(String args[])
    {
        int []arr={1,2,3,4,5,6,7};
        int d=4;
        int n=arr.length;
        System.out.println("ORIGINAL ARRAY : "+Arrays.toString(arr));
        int temp[]=new int[d];

        for(int i=0;i<temp.length;i++)
        {
            temp[i]=arr[i];
        }

        //shifting the array

        for(int i=d;i<arr.length;i++)
        {
            arr[i-d]=arr[i];
        }

        // push back in to the temP

        int j=0;
        for(int i=n-d;i<arr.length;i++)
        {
            arr[i]=temp[j];
            j++;
        }
        System.out.println("ROTATED ARRAY :"+Arrays.toString(arr));
    }
}

package Day04_Arrays;
import java.util.*;
public class MoveZeorToEnd {
    public static void main(String args[])
    {
        int arr[]={1,2,4,0,6,0,3,0,7};
        int temp[]=new int[arr.length];
        int j=0;
        //seprate the nonzero element into new array

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;
            }
        }
        //nonzero element push into front the nums array

        for(int i=0;i<temp.length;i++)
        {
            arr[i]=temp[i];
        }
        //after put zero int0 last ofthe array
        for(int i=j;i<arr.length;i++)
        {
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr)) ;

    }
}

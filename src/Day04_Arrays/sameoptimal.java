package Day04_Arrays;
import java.util.*;
public class sameoptimal {
    public static void main(String args[])
    {
        int arr[]={1,1,1,1,1,1,1};
        int j=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j!=-1) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    swap(arr, i, j);
                    j++;
                }
            }
        }
        else{
            System.out.println("not found zero");
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int start,int end)
    {
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

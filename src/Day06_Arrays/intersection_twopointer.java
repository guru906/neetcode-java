package Day06_Arrays;
import java.util.ArrayList;
public class intersection_twopointer {
    public static void main(String args[])
    {
        int arr1 []={1,2,2,3,4,5,6};
        int arr2 []={2,3,4,5,6,7};
        ArrayList<Integer>list =new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(list+" ");
    }
}

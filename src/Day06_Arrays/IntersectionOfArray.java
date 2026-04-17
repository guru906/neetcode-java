package Day06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
public class IntersectionOfArray {
    public static void main(String args[])
    {
        int arr1 []={1,2,2,3,4,5,6};
        int arr2 []={2,2,3,4,5,6,7,8};
        int n=arr1.length;
        int m=arr2.length;
        int visit[]=new int[m];
        ArrayList<Integer>list =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr1[i]==arr2[j] && visit[j]==0)
                {
                    list.add(arr1[i]);
                    visit[j]=1;
                    break;
                }
                if(arr1[i]<arr2[j])
                {
                    break;
                }
            }
        }
        System.out.print(list +" ");
    }
}

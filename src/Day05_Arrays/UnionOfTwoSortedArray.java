package Day05_Arrays;
import java.util.Arrays;
import java.util.TreeSet;
public class UnionOfTwoSortedArray {
    public static void main(String args[])
    {
        TreeSet<Integer>st=new TreeSet<>();
        int arr1[]={1,2,3,4,5,5};
        int arr2[]={1,2,5,6,7,8};
        for(int i=0;i<arr1.length;i++)
        {
            st.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            st.add(arr2[i]);
        }
        int k=0;
        int union[]=new int[st.size()];
       for(int j :st)
       {
           union[k++]=j;
       }
       System.out.println(Arrays.toString(union));


        }

    }


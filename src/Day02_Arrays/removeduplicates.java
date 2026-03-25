package Day02_Arrays;

public class removeduplicates {
    public static void main(String args[])
    {
        int arr[]={1,1,2,2,2,3,3,4,5,5};
        if(arr.length==0)
        {
            System.out.println("null");
        }
        int j=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }
        int ans = j+1;
        System.out.println("count of the original is : "+ans);
    }
}

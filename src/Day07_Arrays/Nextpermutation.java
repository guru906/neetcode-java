package Day07_Arrays;

public class Nextpermutation {
    public static void main(String args[])
    {
        int arr[]={2,3,5,4,1,0,0};
        nextpermutation(arr);
        System.out.println("the next permutation is : ");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }

    }
    public static void nextpermutation(int []arr)
    {
        int n=arr.length;
        int ind =-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                ind=i;
                break;
            }
        }
        for(int i=n-1;i>=ind;i--)
        {
            if(arr[ind]<arr[i])
            {
                swap(arr,ind,i);
                break;
            }
        }
        reverse(arr,ind+1,n-1);

    }
    public static void swap(int arr[],int ind,int i)
    {
        int temp =arr[ind];
        arr[ind]=arr[i];
        arr[i]=temp;
    }
    public static void reverse(int arr[],int start,int end)
    {
        while(start<=end)
        {
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }

}

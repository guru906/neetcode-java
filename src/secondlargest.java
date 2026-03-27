package Day01_Arrays;
public class secondlargest {
    public static void main(String args[])
    {
        int arr[]={1,7,4,9,3,7,3};
        int largest =arr[0];
        int secondlargest =-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest =largest;
                largest = arr[i];

            }
            else if(arr[i]<largest && arr[i]>secondlargest)
            {
                secondlargest =arr[i];
            }
        }
        System.out.println("LARGEST ELEMENT IS : "+largest);
        System.out.println("SECOND LARGEST ELEMENT IS : "+secondlargest);

    }
}

//git add .
//git commit -m "Day01 - Largest Element added"
//git push
package Day01_Arrays;
public class largestElement{
    public static void main(String args[])
    {
        int arr[]={1,7,4,9,3,7,3};
        int largest =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("LARGEST ELEMENT IS : "+largest);
    }
}
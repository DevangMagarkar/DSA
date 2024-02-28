public class firstOccurence {
    
    public static int firstOccurence(int arr[], int key, int i)
    {
        //base case
        if(i == arr.length)
        {
            return -1;  //not found
        }
        if(arr[i]== key)
        {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,5,4};
        int key =4;
        //index
        int i=0;
        System.out.println(firstOccurence(arr, key, i));
    }
}

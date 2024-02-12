// here in both the type of questios we are traversing the array from both the sides 
// and thus the condition becomes like
//while(start<=end)

//1) binarySearch
//2) reversing array

public class traversingArrayFromBothDirections{
    public static int binarySearch(int arr[], int key){
        int start=0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }

    public static void reverseArray(int arr[])
    {
        int first =0;
        int last = arr.length-1;
        while(first<last){
            //swap
            int temp=0;
            temp= arr[first];
            arr[first] =arr[last];
            arr[last] =temp;
            
            first++;
            last--;
        }
    
    }
    public static void reversingArray(int arr[]){
        int first=0, last = arr.length-1;
        while(first<last)
        {   
            //swap both
            int temp;
            temp=arr[first];
            arr[first] = arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
           }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        // int key =5;
        reversingArray(arr);
        print(arr);

    }
}
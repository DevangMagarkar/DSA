public class checkSortedArray {
    public static boolean checkSortedArray(int arr[],int i){
      
        if(i==arr.length-1)
        {
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return checkSortedArray(arr, i+1); // remember this type

    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,14,5};
        int i =0;
        System.out.println(checkSortedArray(arr, i));
    }
    
}

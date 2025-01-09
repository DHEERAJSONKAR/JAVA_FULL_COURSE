// check if array is sorted (strictly increasing)
//{1,2,3,4,5}
public class  sorted{
     static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        System.out.println(isSorted(arr, 0));
    }

}

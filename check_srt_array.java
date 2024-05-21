public class check_srt_array {
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return issorted(arr, i+1);
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={10,20,14,67,70};
        int i=0;
        boolean ans=issorted(arr, i);
        System.out.println(ans);
    }
}

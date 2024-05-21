public class Sum_array {
    public static int printsum(int i,int arr[]){
        if(i==arr.length-1){
            return arr[i];
        }
       int ans= printsum(i+1, arr);
       int sum=arr[i]+ans;
       return sum;

    }
    public static void main(String[] args){
        int sum=0;
        int i=0;
        int arr[]={4,5,7,8,0};
        System.out.print(printsum( 0,arr));
}
}

public class Solution {
    int[] sortArr(int[] arr, int n) 
    { 
        // code here
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            return arr;
        }
    }
public static void main(String[] args){
    int arr[]={2,1,5,6,7};
    int  n=5;
    Solution so=new Solution();
    System.out.println(so.sortArr(arr,n));
}
}

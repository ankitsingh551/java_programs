class Kthlargest{
    public static void main(String[] args) {
        int arr[]={1,4,6,9,10,0};
        int k=4;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.print(k+"th largest element is"+arr[i]);
                break;
            }
        }
        
    }

}
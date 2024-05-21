public class Secondlargest {
    public static void main(String[] args) {
        int arr[]={20,5,100,50,0,500};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("second largest element is "+arr[1]);
    }
}

public class Secondsmallest {
    public static void main(String[] args){
        int arr[]={10,55,5,1,0,100};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("second smallest element is " +arr[1] );
    }
}

public class  Arrayduplicateelement{
    public static void main(String[] args){ 
        int arr[]={10,20,3,10,5,20,0,0};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j])&&(i!=j)){
                    System.out.print(arr[j]+ " ");
                }
            }
        }

    }
}
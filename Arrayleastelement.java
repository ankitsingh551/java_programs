public class Arrayleastelement {
    public static void main(String[] args) {
        int arr[]={16,1,2,3,4,10,15};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("least element is " +min );
    }
}

public class Arraygreaterelement {
    public static void main(String[] args) {
        int arr[]={10,9,6,5,4,12,0};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        } 
        System.out.println("greater element is"+ temp);
    }
}

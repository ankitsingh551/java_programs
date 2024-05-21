public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={10,20,50,70,100,120};
        int search=100;
        int li=0;
        int hi=arr.length-1;
        int mi=(li+hi)/2;
        while(li<hi){
        if(arr[mi]==search){
            System.out.print("element is at " + mi +"position");
            break;
        }
        else if(arr[mi]<search){
            li=mi+1;
        }
        else{
            hi=mi-1;
        }
        mi=(li+hi)/2;
    }
        if(li>hi){
            System.out.println("element is not found");
        }
        
    }
}

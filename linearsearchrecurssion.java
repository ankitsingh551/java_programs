public class linearsearchrecurssion {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5};
        System.out.println(find(arr,10,0));
    }
    public static boolean find(int arr[],int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||find(arr, target, index+1);
    }
        
    }

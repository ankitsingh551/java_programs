public class Binarysearchrecursion {
    public static int Binarysearch(int arr[],int si,int li,int search){
        if(si>li){
            return -1;
        }
        int mid=si+(li-si)/2;
        if(arr[mid]==search){
            return mid;
        }
        if(search<arr[mid]){
            return Binarysearch(arr,si,mid-1,search);
        }
        return Binarysearch(arr, mid+1, li, search);

    }

    public static void main(String[] args) {
        int[]arr={23,45,67,85,90,95,99};
        int search=99;
        System.out.println(Binarysearch(arr,0,arr.length-1,search));
    }
}

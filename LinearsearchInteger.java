public class LinearsearchInteger {
    public static void main(String[] args) {
        int arr[]={3,6,9,10,12,5};
        int iteam=5;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(iteam==arr[i]){
                System.out.print(iteam+"preasent at index"+i);
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.print("iteam not foud in list");
        }
    }
}

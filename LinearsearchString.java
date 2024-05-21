public class LinearsearchString {
    public static void main(String[] args) {
        String arr[]={"ankit","shubhi","adarsh","amit","sonal"};
        int temp=0;
        String iteam="amit";
        for(int i=0;i<arr.length;i++){
            if(iteam==arr[i]){
                System.out.print(iteam +" present at index "+ i);
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("iteam not found in list");
        }
    }
}

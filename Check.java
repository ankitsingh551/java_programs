public class Check {
        void immediateSmaller(int arr[], int n) {
            // code here
            for(int i=0;i<=n-1;i++){
                if(i==n-1){
                    System.out.print(-1);
                    break;
                }
                if(arr[i+1]<arr[i]){
                    System.out.print(arr[i+1]+ " ");
                }
                
                else{
                    System.out.print("-1"+ " ");
                }
            }
        }
        public static void main(String[] args) {
            int arr[]={4, 2, 1, 5, 3};
            int n=5;
            Check c =new Check();
            c.immediateSmaller(arr,n);
        }
    }

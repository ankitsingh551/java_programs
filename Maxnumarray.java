public class Maxnumarray {
        public int largest(int arr[], int n)
        {
            int max=arr[0];
           if (n == 0) {
                // Handling case where array is empty
                return Integer.MIN_VALUE; // Return the smallest possible integer value
            }
            else if(n==1){
                return arr[0];
            }
            else{
            for(int i=1;i<n;i++){
                if(arr[i]>=max){
                max=arr[i];
                }
            }
            return max;
        }
        }
            public static void main(String []args){
                int A[]={1,5};
                int n=2;
                Maxnumarray so=new Maxnumarray ();
               System.out.print(so.largest(A,n));
            }
        }

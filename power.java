public class power {
        
   public static long power(int N,int R)
    {
        //Your code here
        if(R==0){
            return 1;
        }
        long res=power(N,R-1);
        long res1=N*res;
       long res2=res1%1000000007;
        return res2;
    }
    public static void main(String[] args) {
        int N=12,R=21;
       long ans= power(2,2);
      System.out.print(ans);
    }

}
    

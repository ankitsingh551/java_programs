public class Countoddeven {

    public void countOddEven(int[] arr, int n)
    {
        int count=0;
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
            count=count+1;
        }
        else{
            flag=flag+1;
        }
        }
        System.out.print(+count+" "+flag);
    }
        public static void main(String[] args){
            int[] arr={1 ,2 ,3 ,4 ,5};
            int N=5;
            Countoddeven s1=new Countoddeven();
          s1.countOddEven(arr,N);
        }
    }

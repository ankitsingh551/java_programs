import java .util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int no=s.nextInt();
        int k=no;
        int leng=0;
        while(k!=0){
            leng=leng+1;
            k=k/10;
        }
        int t1=no;
        int rem=0;
        int add=0;
        while(t1!=0){
        int mul=1;
        rem=t1%10;
        for(int i=1;i<=leng;i++){
           mul=rem*mul;
        }
        add=add+mul;
        t1=t1/10;

        }
        if(no==add){
            System.out.println(no+" is armstrong number");
        }
        else{
            System.out.println(no+" is not armstrong number");
        }
    }
    
}

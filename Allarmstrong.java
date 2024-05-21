import java.util.Scanner;
public class Allarmstrong {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int max=s.nextInt();
        int k;
        int leng=0;
        for(int no=100;no<=max;no++){
          k=no;
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
            System.out.println(no);
        }
        leng=0;
    } 
}    
}

import java.util.Set;
import java.util.HashSet;
public class Arrayduplicateelement1 {
    public static void main(String[] args) {
        int arr[]={10,0,30,20,10,30,50};
        Set<Integer> s=new HashSet<>();
        for(int no:arr){
            if(s.add(no)==false){
                System.out.print(no+ " ");
            }
        }

    }
}

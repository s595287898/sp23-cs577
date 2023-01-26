package homework1;
import java.util.*;
public class homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String[] res = new String[num];
        for(int i=0;i<num;i++){
            res[i]=input.next();
        }
        for (String string : res) {
            System.out.println("Hello, "+string);
        }
    }
   
}

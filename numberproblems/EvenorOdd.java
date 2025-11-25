package numberproblems;
import java.util.*;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
int n=s.nextInt();
String r=n%2==0?"even":"odd";
System.out.println(r);
    }
}

package numberproblems;

public class SumofDigit {
public static void main(String[] args) {
    int num=1234;
    int sum=0;
    while(num!=0){
        int t=num%10;
        sum+=t;
        num/=10;
        }
        System.out.println(sum);
}
}

package recursion;

public class Main {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } 
        int factorialOfNMinusOne = factorial(n - 1);
        System.out.println(factorialOfNMinusOne);
            return factorialOfNMinusOne;
        
    }
    public static void main(String[] args) {
    
        System.out.println(factorial(5));
    }
}

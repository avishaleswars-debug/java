import java.util.Stack;

public class Posfix {

    static int precedence(char op) {
        switch(op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    public static void main(String[] args) {

        String str = "a+b*(c^d-e)^(f+g*h)-i";
        Stack<Character> stack = new Stack<>();
        String posfix = "";

        for(char c : str.toCharArray()) {

            // If operand
            if(Character.isLetterOrDigit(c)) {
                posfix += c;
            }

            // If '('
            else if(c == '(') {
                stack.push(c);
            }

            // If ')'
            else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    posfix += stack.pop();
                }
                stack.pop(); // remove '('
            }

            // If operator
            else if(c=='*'||c=='+'||c=='-'||c=='/'||c=='^') {

                while(!stack.isEmpty() && 
                      (precedence(stack.peek()) > precedence(c) ||
                      (precedence(stack.peek()) == precedence(c) && c != '^'))) {

                    posfix += stack.pop();
                }

                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            posfix += stack.pop();
        }

        System.out.print(posfix);
    }
}
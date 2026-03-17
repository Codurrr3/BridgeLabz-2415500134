import java.util.Stack;
public class prefixToPostfix {
        public static void main(String[] args) {
            String infix = "a+b*c-d";
            String postfix = infixToPostfix(infix);
            System.out.println("Postfix expression: " + postfix);
        }

        public static String infixToPostfix(String infix) {
            StringBuilder postfix = new StringBuilder();
            Stack<Character> stack = new Stack<>();

            for (char ch : infix.toCharArray()) {
                if (Character.isLetterOrDigit(ch)) {
                    postfix.append(ch);
                } else if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop());
                    }
                    stack.pop(); // Pop the '('
                } else { // Operator
                    while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                        postfix.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }

            while (!stack.isEmpty()) {
                postfix.append(stack.pop());
            }

            return postfix.toString();
        }

        private static int precedence(char operator) {
            switch (operator) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                default:
                    return -1;
            }
        }
}
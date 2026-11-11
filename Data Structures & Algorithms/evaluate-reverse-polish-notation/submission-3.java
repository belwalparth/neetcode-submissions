
class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            switch(tokens[i]) {

                case "+":
                case "-":
                case "*":
                case "/":

                    int op2 = stack.pop();
                    int op1 = stack.pop();

                    switch(tokens[i]) {
                        case "+":
                            stack.push(op1 + op2);
                            break;

                        case "-":
                            stack.push(op1 - op2);
                            break;

                        case "*":
                            stack.push(op1 * op2);
                            break;

                        case "/":
                            stack.push(op1 / op2);
                            break;
                    }
                    break;

                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.peek();
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for( int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                if(stack.isEmpty()){
                    return 0;
                }
                int op2= stack.peek();
                stack.pop();
                int op1=stack.peek();
                stack.pop();
                switch(tokens[i]){
                    case "+":
                    stack.push(op1+op2);
                    break;
                    case "-":
                    stack.push(op1-op2);
                    break;
                    case "*":
                    stack.push(op1*op2);
                    break;
                    case "/":
                    stack.push(op1/op2);
                    break;
                }
                continue;
            }
            else
            {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}

class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> valid= new ArrayDeque<>();
        for(char c: s.toCharArray())
        {
            if(c=='['||c=='('||c=='{')
            {
                valid.push(c);
                continue;
            }
            if(!valid.isEmpty()){
            if(c==')')
            {
                if(valid.peek()=='(')
                {
                    valid.pop();
                }
                else
                {return false;}
            }
            if(c==']')
            {
                if(valid.peek()=='[')
                {
                    valid.pop();
                }
                else
                {return false;}
            }
            if(c=='}')
            {
                if(valid.peek()=='{')
                {
                    valid.pop();
                }
                else
                {return false;}
            }
            }
            else return false;
            
        }
        return(valid.isEmpty());
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int lp=0,rp=s.length()-1;
        String test=s.toLowerCase();
        while(lp<rp){
            if(!Character.isLetterOrDigit(test.charAt(lp)))
            {
                lp++;
                continue;
            }
            else if(!Character.isLetterOrDigit(test.charAt(rp)))
            {
                rp--;
                continue;
            }
            else{
                if(test.charAt(lp)!=(test.charAt(rp))){
                return false;}
            }
            lp++;rp--;
        }
        return true;
    }
}

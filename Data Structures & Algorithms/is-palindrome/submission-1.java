class Solution {
    public boolean isPalindrome(String s) {
        int lp=0,rp=s.length()-1;
        while(lp<rp){
            if(!Character.isLetterOrDigit(s.charAt(lp)))
            {
                lp++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(rp)))
            {
                rp--;
                continue;
            }
            else{
                if(Character.toLowerCase(s.charAt(lp))!=Character.toLowerCase((s.charAt(rp)))){
                return false;}
            }
            lp++;rp--;
        }
        return true;
    }
}

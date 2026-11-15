class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        int max=0,l=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                
                l=Math.max(l,map.get(s.charAt(i))+1);
                map.replace(s.charAt(i),i);
            }
            else{
                map.putIfAbsent(s.charAt(i),i);
                
            }
            max=Math.max(max, i-l+1);
        }
        return Math.max(max,s.length()-l);
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map=new HashMap<Character,Integer>();
        Map<Character, Integer> map1=new HashMap<Character,Integer>();
        int l=0;
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i),0)+1);
            if((i-l+1)<s1.length()){
                continue;
            }//invalid of less length
            if((i-l+1)>s1.length()){
                map.put(s2.charAt(l),map.get(s2.charAt(l))-1);
                if(map.get(s2.charAt(l))==0)
                map.remove(s2.charAt(l));
                l++;
            }//greater length
            if(map.equals(map1)){
                return true;
            }
        }
        return false;
    }
}

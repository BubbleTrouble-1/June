class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int len = 0;
        int maxlen = 0;
        for(right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(map.get(ch)!=null && map.get(ch)>=left){
                left = map.get(ch)+1;
            }
            map.put(ch,right);
            len = right-left+1;
            maxlen=Math.max(len,maxlen);
        }
        return maxlen;
    }
}

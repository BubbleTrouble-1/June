class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str = s.split("\\s+");
        int p1=0,p2=str.length-1;
        while(p1<p2){
            String temp=str[p1];
            str[p1]=str[p2];
            str[p2]=temp;
            p1++;
            p2--;
        }
        return String.join(" ", str);
    }
}

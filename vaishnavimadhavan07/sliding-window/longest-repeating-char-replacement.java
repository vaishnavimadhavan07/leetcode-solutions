class Solution {
    public int characterReplacement(String s, int k) {
       int n = s.length();
       int [] charcount = new int[26];
       int maxCount = 0, maxLen = 0;
       int i = 0;
       for(int j=0;j<n;j++){
        charcount[s.charAt(j)-'A']++;
        maxCount = Math.max(maxCount,charcount[s.charAt(j)-'A']);
       
        while((j-i+1)-maxCount > k){
            charcount[s.charAt(i)-'A']--;
            i++;
        }
        maxLen = Math.max(maxLen,j-i+1);
       }
       return maxLen;
    }
}

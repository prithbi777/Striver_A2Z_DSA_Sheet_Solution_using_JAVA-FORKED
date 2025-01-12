//problem link: https://leetcode.com/problems/longest-repeating-character-replacement/description/




class Solution {
    public int characterReplacement(String s, int k) {

    //     //TLE
    //     int maxLen = 0;
    //     for(int i=0;i<s.length();i++){
    //         int[] hashchar = new int[26];
    //         int maxFreq = 0, changes=0;
    //         for(int j=i;j<s.length();j++){
    //             hashchar[s.charAt(j)-'A']++;
    //             maxFreq=Math.max(maxFreq, hashchar[s.charAt(j) - 'A']);
    //             changes = j-i+1-maxFreq;
    //             if(changes<=k){
    //                 maxLen = Math.max(maxLen, (j-i+1));
    //             }else{
    //                 break;
    //             }
    //         }
    //     }


    //  return maxLen;




    //OPTIMAL
        int maxLen = 0;
        int left = 0, right = 0, maxF = 0;
        int[] freqCh = new int[26];
        while(right<s.length()){
            freqCh[s.charAt(right)-'A']++;
            maxF = Math.max(freqCh[s.charAt(right) - 'A'], maxF);
            if(((right-left+1) - (maxF)) > k){
                freqCh[s.charAt(left) - 'A']--;
                maxF = 0;
                left++;
               
            }
            if(((right-left+1) - (maxF)) <= k){
                maxLen = Math.max(maxLen, right-left+1);
            }

            right++;
        }


     return maxLen;





    }
}

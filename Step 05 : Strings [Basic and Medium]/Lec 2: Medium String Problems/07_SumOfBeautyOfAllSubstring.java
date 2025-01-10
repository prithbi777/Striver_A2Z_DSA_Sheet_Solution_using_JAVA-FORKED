// Question Link: https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/


class Solution {
    public int beautySum(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }

                ans += max - min;
            }
        }
        return ans;
    }
}










//MINE
class Solution {


    //not optimized(TLE)
    // private static int getSum(String s){
    //    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    //    for(char ch:s.toCharArray()){
    //        int maxCount = 0, minCount=0;
    //        for (char c: s.toCharArray()) {
    //             if(ch==c){
    //                 maxCount++;
    //             }
    //        }
    //        for(char _c:s.toCharArray()){
    //            if(_c!=ch){
    //               minCount++;
    //            }
    //        }
    //        max = Math.max(max, maxCount);
    //        min = Math.min(min, s.length()-minCount);
    //    }

    //    return (max-min);
    // }



//OPTIMIZED
private static int calculateBeauty(int[] freq) {
        int max = 0, min = Integer.MAX_VALUE;
        for (int val : freq) {
            if (val > 0) {
                max = Math.max(max, val);
                min = Math.min(min, val);
            }
        }
        return max - min;
    }






    public int beautySum(String s) {
    //     //not optimized(TLE)
    //     int totalSum = 0;
    //    for(int i=0;i<s.length();i++){
    //     int sum = 0;
    //     for(int j=i+1;j<=s.length();j++){
    //           sum += getSum(s.substring(i, j));
    //     }
    //     totalSum += sum;
    //    }
    //    return (totalSum);






    //  OPTIMIZED
    int totalBeauty = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];  // Array to store frequency of characters 'a' to 'z'
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;  // Update frequency for the current character
                totalBeauty += calculateBeauty(freq);  // Calculate and add the beauty of the current substring
            }
        }


       return (totalBeauty);






    }
}

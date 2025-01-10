// Question Link: https://leetcode.com/problems/longest-palindromic-substring/description/


public class Solution {

    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > maxStr.length()) {
                maxStr = odd;
            }
            
            if (even.length() > maxStr.length()) {
                maxStr = even;
            }
        }

        return maxStr;
    }
}
















//MINE
class Solution {


    //OPTIMIZED
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }






    // //BRUTE FORCE
    // private boolean isPalin(String s, int i , int j){
    //     while(i<=j){
    //         if(s.charAt(i)!=s.charAt(j)){
    //             return false;
    //         }else{
    //             i++;
    //             j--;
    //         }
    //     }
    //     return true;

    // }



    public String longestPalindrome(String s) {   //"babad"


        //OPTIMIZED
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);      // Check for odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);  // Check for even length palindrome
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);


         //BRUTE FORCE
        // int maxLen = 0, start=0, end =0;
        // for(int i=0;i<s.length();i++){
        //     for(int j=i;j<s.length();j++){
        //         if(isPalin(s,i, j)){
        //             if(maxLen<(j-i+1)){
        //               maxLen =(j-i+1);
        //               start = i;
        //               end = j;  
        //             }
                
                    
        //         }
        //     }
        // }
        // return s.substring(start, end+1);


    
    }
}

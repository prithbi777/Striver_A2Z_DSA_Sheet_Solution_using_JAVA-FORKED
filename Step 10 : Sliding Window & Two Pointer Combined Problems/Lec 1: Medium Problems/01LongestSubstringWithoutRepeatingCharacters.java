//problem link: https://leetcode.com/problems/longest-substring-without-repeating-characters/





class Solution {
    public int lengthOfLongestSubstring(String s) {

        // //BRUTE FORCE BY ME O(n^2)
        // if(s.length()==0) return 0;
        // int max = 1;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> hst = new HashSet<>();
        //     hst.add(s.charAt(i));
        //     for(int j=i+1;j<s.length();j++){
        //         if(hst.contains(s.charAt(j))){
        //             max = Math.max(max, (j-i));
        //             break;
        //         }else{
        //             hst.add(s.charAt(j));
        //             if(j==s.length()-1){
        //                 max = Math.max(max, (j-i+1));
        //             }
                    
        //         }


        //     }
            
        // }
        // return (max);






        // //BRUTE FORCE BY SLIGHTLY DIFF APR BY ME O(n^2)
        // if(s.length()==0) return 0;
        // int max = 1;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> hst = new HashSet<>();
        //     hst.add(s.charAt(i));
        //     for(int j=i+1;j<s.length();j++){
        //         if(hst.contains(s.charAt(j))){
        //             break;
        //         }else{
        //             hst.add(s.charAt(j));
        //             max = Math.max(max, (j-i+1));
                    
        //         }


        //     }
            
        // }
        // return (max);







        //OPTIMIZED(using two pointers O(n)
        int left = 0, right = 0, maxLen = 0;
        int[] allChar = new int[256];
        Arrays.fill(allChar, -1);
        while(right<s.length()){
            if(allChar[s.charAt(right)]!=-1){
                if(allChar[s.charAt(right)]>=left){
                    left = allChar[s.charAt(right)]+1; 
                }
            }
                maxLen = Math.max(maxLen, (right-left+1));
                allChar[s.charAt(right)] = right;
                right++;
            
                // maxLen = Math.max(maxLen, (right-left+1));
                // allChar[s.charAt(right)] = right;
                // right++;
           
        }


        return maxLen;


    }
}

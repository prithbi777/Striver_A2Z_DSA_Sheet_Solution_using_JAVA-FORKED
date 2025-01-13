//problem link: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/submissions/1507600379/




class Solution {
    public int numberOfSubstrings(String s) {

        // //TLE
        // int count = 0;
        // int n = s.length();
        
        // for (int i = 0; i < n; i++) {
        //     boolean hasA = false, hasB = false, hasC = false;
            
        //     for (int j = i; j < n; j++) {
        //         if (s.charAt(j) == 'a') hasA = true;
        //         if (s.charAt(j) == 'b') hasB = true;
        //         if (s.charAt(j) == 'c') hasC = true;
                
        //         if (hasA && hasB && hasC) {
        //             count++;
        //         }
        //     }
        // }
        
        // return count; 





        //OPTIMIZED ONE
       int totalSubStrings = 0;
       int[] abc = {-1, -1, -1};
       int MIN=-1, min = -1;
       for(int i=0;i<s.length();i++){
          abc[s.charAt(i)-'a'] = i;
          if(abc[0]!=-1 && abc[1]!=-1 && abc[2]!=-1){
             min = Math.min(abc[0], abc[1]);
             MIN = Math.min(abc[2], min);
             totalSubStrings += MIN+1;
          }
       }
       return totalSubStrings;
    }
}

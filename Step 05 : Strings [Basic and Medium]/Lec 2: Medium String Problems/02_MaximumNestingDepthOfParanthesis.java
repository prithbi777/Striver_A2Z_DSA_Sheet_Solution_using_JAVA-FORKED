// Question Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/


class Solution {
    public int maxDepth(String s) {

        int currCount = 0;
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                currCount++;
            }

            maxCount = Math.max(currCount, maxCount);

            if (s.charAt(i) == ')') {
                currCount--;
            }
        }

        return maxCount;
    }
}






//MINE
class Solution {
    public int maxDepth(String s) {
         int openCount = 0, max = 0;
       for(char ch: s.toCharArray()){
         if(ch=='('){
            openCount++;
            max = Math.max(max, openCount);
         }else if(ch==')'){
            openCount--;
         }
       }
       return (max);
    }
}

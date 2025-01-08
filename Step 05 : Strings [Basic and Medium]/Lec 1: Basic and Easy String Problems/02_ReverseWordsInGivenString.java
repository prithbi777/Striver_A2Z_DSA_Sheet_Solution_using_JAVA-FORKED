// Question Link: https://leetcode.com/problems/reverse-words-in-a-string/description/


// class Solution {

//     // Time Complexity = O(n), Space Complexity = O(n)
//     public String reverseWords(String s) {
//         Stack<String> stack = new Stack<String>();        
//         String str = "";

//         for (int i = 0; i < s.length(); i++) {

//             if (s.charAt(i) == ' ') {
//                 if (!str.isEmpty()) {  
//                     stack.push(str);
//                 }

//                 str = "";  
//             } else {
//                 str += s.charAt(i); 
//             }
//         }

//         if (!str.isEmpty()) {
//             stack.push(str);
//         }

//         String ans = "";
        
//         while (!stack.isEmpty()) {
//             ans += stack.pop();   

//             if (!stack.isEmpty()) { 
//                 ans += " ";
//             }
//         }

//         return ans;
//     }
// }








//MINE
class Solution {
    public String reverseWords(String s) {
       // Split the string by spaces and filter out empty strings
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        // Traverse the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        
        return (result.toString()); 
    }
}

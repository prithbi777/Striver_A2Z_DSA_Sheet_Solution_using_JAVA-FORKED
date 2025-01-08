// Question Link: https://leetcode.com/problems/remove-outermost-parentheses/description/

// class Solution {
//     public String removeOuterParentheses(String s) {
//         int count = 0;        
//         String ans = "";

//         for (int i = 0; i < s.length(); i++) {
            
//             if(s.charAt(i) == '(') {
//                 if(count != 0) {
//                     ans += s.charAt(i);
//                 }
//                 count++; 
//             } else {
//                 if(count > 1) {
//                     ans += s.charAt(i);
//                 }                
//                 count--; 
//             }
//         }

//         return ans;
//     }
// }





//MINE SOLUTION 
class Solution {
    public String removeOuterParentheses(String s) {


    //     //MINE
    //    StringBuilder ansS = new StringBuilder();
    //    int trackOpen=0, trackClose=0;
    //    boolean powerOn = false;
    //    for(int i=0;i<s.length();i++){
    //        if(!powerOn && s.charAt(i)=='('){
    //         powerOn = true;
    //        }else if(s.charAt(i)==')' && trackOpen==trackClose){
    //         powerOn = false;
    //        }else{
    //         ansS.append(s.charAt(i));
    //         if(s.charAt(i)=='('){
    //             trackOpen++;
    //         }else{
    //             trackClose++;
    //         }
    //        }
    //    }
    //    return (ansS).toString();





    // StringBuilder result = new StringBuilder();
    //     int openCount = 0;
        
    //     for (char c : s.toCharArray()) {
    //         if (c == '(') {
    //             if (openCount > 0) {
    //                 result.append(c);
    //             }
    //             openCount++;
    //         } else {
    //             openCount--;
    //             if (openCount > 0) {
    //                 result.append(c);
    //             }
    //         }
    //     }
        
    //     return result.toString();





//MINE OPTIMIZED code
       StringBuilder ansS = new StringBuilder();
       int trackOpen=0, trackClose=0;
       boolean powerOn = false;
       for(char val:s.toCharArray()){
           if(!powerOn && val=='('){
            powerOn = true;
           }else if(val==')' && trackOpen==trackClose){
            powerOn = false;
           }else{
            ansS.append(val);
            if(val=='('){
                trackOpen++;
            }else{
                trackClose++;
            }
           }
       }

       return ansS.toString();


    }
}

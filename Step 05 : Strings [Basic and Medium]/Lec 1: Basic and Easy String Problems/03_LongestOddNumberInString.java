// Question Link: https://leetcode.com/problems/largest-odd-number-in-string/description/


// class Solution {
//     public String largestOddNumber(String num) {

//         for(int i = num.length()-1; i >= 0; i--){
            
//             int x = (int) num.charAt(i) - 48;
        
//             if (x % 2 != 0){
//                 return num.substring(0, i + 1);
//             }
//         }

//         return "";
//     }
// }










//MINE
class Solution {
    public String largestOddNumber(String num) {
    //     for(int i=num.length()-1;i>=0;i--){
    //       if(num.charAt(i)=='1' || num.charAt(i)=='3' || num.charAt(i)=='5' || num.charAt(i)=='7' || num.charAt(i)=='9'){
    //           return (num.substring(0, i+1));
              
    //       }
    //    }
    //    return "";




    // //METHOD-2
    // // Traverse the string from right to left
    //     for (int i = num.length() - 1; i >= 0; i--) {
    //         // Convert the current character to an integer
    //         final int k = num.charAt(i) - '0';
    //         // Check if the digit is odd
    //         if (k % 2 != 0) {
    //             // Return the substring up to the current index
    //             return num.substring(0, i + 1);
    //         }
    //     }
    //     // Return an empty string if no odd number is found
    //     return "";








        //METHOD-3
        for (int i = num.length()-1; i >= 0; i--) {
            if(num.charAt(i)%2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";



    }
}

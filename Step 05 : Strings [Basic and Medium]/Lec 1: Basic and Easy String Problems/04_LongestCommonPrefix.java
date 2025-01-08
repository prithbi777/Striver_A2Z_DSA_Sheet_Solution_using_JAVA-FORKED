// Question Link: https://leetcode.com/problems/longest-common-prefix/description/

////OPTIMIZED
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         Arrays.sort(strs);

//         String s1 = strs[0];
//         String s2 = strs[strs.length - 1];

//         int index = 0;

//         while (index < s1.length() && index < s2.length()){
//             if(s1.charAt(index) == s2.charAt(index)){
//                 index++;            
//             } else {
//                 break;
//             }
//         }

//         return s2.substring(0, index);
//     }
// }





//MINE
class Solution {
    // public String common(String s1, String s2){
    //     int n = Math.min(s1.length(), s2.length());
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0;i<n;i++){
    //         if(s1.charAt(i)==s2.charAt(i)){
    //             sb.append(s1.charAt(i));

    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     return sb.toString();
    // }
    public String longestCommonPrefix(String[] strs) {


        //OPTIMIZED CODE
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int index = 0;
        while(index < s1.length() && index < s2.length()){
        if(s1.charAt(index)==s2.charAt(index)){
        index++;
        }
        else{
        break;
        }
        }

        return s1.substring(0,index);



        // // METHOD-2
        // String result=strs[0];
        // for(int i=1;i<strs.length;i++){
        //     result = common(result,strs[i]);
        // }

        // return result;



    }
}

// Question Link: https://leetcode.com/problems/isomorphic-strings/description/


// class Solution {
    
//     public boolean isIsomorphic(String s, String t) {
        
//         if (s.length() != t.length()) {
//             return false;
//         }

//         int[] mapS = new int[256]; 
//         int[] mapT = new int[256];

//         for (int i = 0; i < s.length(); i++) {
//             char c1 = s.charAt(i);
//             char c2 = t.charAt(i);

//             if (mapS[c1] != 0 && mapS[c1] != c2 || mapT[c2] != 0 && mapT[c2] != c1) {
//                 return false;
//             }

//             mapS[c1] = c2;
//             mapT[c2] = c1;
//         }

//         return true;
//     }
// }









//MINE
class Solution {
    public boolean isIsomorphic(String s, String t) {

        ////using hashmap()
        // if(s.length()!=t.length()){
        //     return false;
        // }

        // Map<Character, Character> mp1 = new HashMap<>();
        // Map<Character, Character> mp2 = new HashMap<>();
        

        // for(int i=0;i<s.length();i++){
        //     if(mp1.containsKey(s.charAt(i))){
        //         if(mp1.get(s.charAt(i))!=t.charAt(i)){
        //             return false;
        //         }
        //     }else{
        //         mp1.put(s.charAt(i), t.charAt(i));
        //     }

        //     if (mp2.containsKey(t.charAt(i))){
        //         if(mp2.get(t.charAt(i))!=s.charAt(i)){
        //             return false;
        //         }
        //     }else{
        //         mp2.put(t.charAt(i), s.charAt(i));
        //     }

        // }

        // return true;


//optimized: using array
        if(s.length()!=t.length()){
           return false;
        }

        int[] st = new int[256];
        int[] ts = new int[256];


        for(int i=0;i<s.length();i++){
            if(st[s.charAt(i)]!=ts[t.charAt(i)]){
                return false;
            }
            st[s.charAt(i)] = i+1;
            ts[t.charAt(i)] = i+1;
        }

        return true;




    }
}

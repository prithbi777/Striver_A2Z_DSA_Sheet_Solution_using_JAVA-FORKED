//problem link: https://leetcode.com/problems/minimum-window-substring/description/





class Solution {
    //OPTIMIZED
    









    // private static boolean isValid(int[] windowCount, int[] tCount) {
    //     for (int i = 0; i < 256; i++) {
    //         if (windowCount[i] < tCount[i]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public String minWindow(String s, String t) {



        // //TLE
        // if (s == null || t == null || s.length() < t.length()) {
        //     return "";
        // }

        // // Frequency arrays for characters in t and current window in s
        // int[] tCount = new int[256];
        // int[] windowCount = new int[256];

        // // Populate the frequency array for string t
        // for (char c : t.toCharArray()) {
        //     tCount[c]++;
        // }

        // String result = "";
        // int minLen = Integer.MAX_VALUE;

        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = i; j < s.length(); j++) {
        //         // Update the frequency array for the current window
        //         windowCount[s.charAt(j)]++;

        //         // Check if the current window is valid
        //         if (isValid(windowCount, tCount)) {
        //             int windowLen = j - i + 1;
        //             if (windowLen < minLen) {
        //                 minLen = windowLen;
        //                 result = s.substring(i, j + 1);
        //             }
        //         }
        //     }

        //     // Reset the window count for the next starting position
        //     for (int k = i; k < s.length(); k++) {
        //         windowCount[s.charAt(k)] = 0;
        //     }
        // }
        // return result;





        //OPTIMIZED
        int l=0;
        int r=0;
        HashMap<Character,Integer> mpp=new HashMap<>();
        int cnt=0;
        int sindex=-1;
        int minlen=Integer.MAX_VALUE;
        String st="";
        for(int i=0;i<t.length();i++){
            mpp.put(t.charAt(i), mpp.getOrDefault(t.charAt(i), 0) + 1);
        }
        while(r<s.length()){
            char ch=s.charAt(r);
            if(mpp.containsKey(ch) && mpp.get(ch)>0){   
                cnt++;
            }
            mpp.put(ch,mpp.getOrDefault(ch,0)-1);            
            while(cnt==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sindex=l;
                }
                mpp.put(s.charAt(l),mpp.get(s.charAt(l))+1);
                if(mpp.get(s.charAt(l))>0){
                    cnt--;
                }
                l++;
                }
            r++;
        }
        return sindex==-1?"":s.substring(sindex,sindex+minlen);





    }
}

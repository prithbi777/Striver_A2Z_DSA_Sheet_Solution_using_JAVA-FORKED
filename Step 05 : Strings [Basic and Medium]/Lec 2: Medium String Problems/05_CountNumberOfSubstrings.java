// Question Link: https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-number-of-substrings


class Solution {
    
    long countSubstring(String S, int K) {
        int n = S.length();
        
        int[] freq = new int[26];
        
        int uc = 0;
        long count = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (freq[S.charAt(right) - 'a'] == 0) {
                uc++;
            }
            
            freq[S.charAt(right) - 'a']++;
            
            while (uc > K) {
                freq[S.charAt(left) - 'a']--;
                
                if (freq[S.charAt(left) - 'a'] == 0) {
                    uc--;
                }
                
                left++;
            }
            
            count += right - left + 1;
        }
        
        return count;
    }
    
    
    long substrCount(String S, int K) {
        if (S == null || K <= 0) {
            return 0;
        }
        
        return countSubstring(S, K) - countSubstring(S, K - 1);
    }
}













//MINE
class Solution {
    public static int atMost(String s, int k) {
        int left = 0;
        int cnt = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (int right=0; right<s.length(); right++) {
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
            
            while (hm.size() > k) {
                char left_ch = s.charAt(left);
                hm.put(left_ch, hm.getOrDefault(left_ch, 0)-1);
                if (hm.get(left_ch) == 0) {
                    hm.remove(left_ch);
                }
                left++;
            }
            cnt+=right-left+1;
        }
        return cnt;
    }
    
    int countSubstr(String s, int k) {
        
        //brute force(TLE)
        // int n = s.length();
        // int count = 0;

        // // Iterate over all starting points of substrings
        // for (int i = 0; i < n; i++) {
        //     HashSet<Character> distinctChars = new HashSet<>();
        //     int distinctCount = 0;

        //     // Check all substrings starting from 'i'
        //     for (int j = i; j < n; j++) {
        //         char c = s.charAt(j);

        //         // Add character to the set if not already present
        //         if (!distinctChars.contains(c)) {
        //             distinctChars.add(c);
        //             distinctCount++;
        //         }

        //         // If the number of distinct characters is k, increase count
        //         if (distinctCount == k) {
        //             count++;
        //         }
        //         // If distinctCount exceeds k, no need to check further
        //         else if (distinctCount > k) {
        //             break;
        //         }
        //     }
        // }

        // return count;
        
        
        
        
        //OPTIMIZED
          // your code here
        int diff = atMost(s, k) - atMost(s, k-1);
        return diff;
        
        
        
        
        
    }
}

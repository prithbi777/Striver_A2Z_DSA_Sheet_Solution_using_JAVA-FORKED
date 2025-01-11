//problem link: https://leetcode.com/problems/max-consecutive-ones-iii/description/



class Solution {
    public int longestOnes(int[] nums, int k) {

        // //BRUTE FORCE APP(TLE) O(n^2)
        // int maxLen = 0;
        // for(int i=0;i<nums.length;i++){
        //     int countZ = 0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0){
        //             countZ++;
        //         }
        //         if(countZ<=k){
        //             maxLen = Math.max(maxLen, j-i+1);
        //         }
        //     }
        // }
        // return maxLen;





        // //OPTMIZED O(n) actually
        // int maxLen  = 0;
        // int left =0, right = 0;
        // int countZ = 0;
        // while(right<nums.length){
        //     if(nums[right]==0){
        //         countZ++;
        //     }
        //     while(countZ>k){
        //         if(nums[left]==0){
        //             countZ--;
        //         }

        //         left++;
        //     }
        //     if(countZ<=k){
        //         maxLen = Math.max(maxLen, (right-left+1));
        //     }

        //     right++;
        // }

        // return maxLen;







        //SLIGHTLY OPTIMIZED O(n)
        int maxLen  = 0;
        int left =0, right = 0;
        int countZ = 0;
        while(right<nums.length){
            if(nums[right]==0){
                countZ++;
            }
            if(countZ>k){
                if(nums[left]==0){
                    countZ--;
                }

                left++;
            }
            if(countZ<=k){
                maxLen = Math.max(maxLen, (right-left+1));
            }

            right++;
        }

        return maxLen;







  





    }
}

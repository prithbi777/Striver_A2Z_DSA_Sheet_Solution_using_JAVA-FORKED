//problem link: https://leetcode.com/problems/binary-subarrays-with-sum/description/



class Solution {

    //OPTIMIZED
    private static int getSol(int[] nums, int goal){ 
        if(goal<0) return 0;
        int totalSubArr = 0;
        int left=0, right = 0, currSum =0;
        while(right<nums.length){
            currSum += nums[right];
            while (currSum>goal) {
                currSum -= nums[left];
                left++;
            }
            totalSubArr += right-left+1;


            right++;
        }
        
        return totalSubArr;

    }



    public int numSubarraysWithSum(int[] nums, int goal) {


        // //BRUTE FORCE
        // int totalSubArr = 0;
        // for(int i=0;i<nums.length;i++){
        //     int tempSum = 0;
        //     for(int j=i;j<nums.length;j++){
        //         tempSum += nums[j];
        //         if(tempSum==goal){
        //             totalSubArr++;
        //         }else if(tempSum>goal){
        //             break;
        //         }
        //     }
        // }

        // return totalSubArr;





    //    //BETTER( USING HASHING takes sc O(n))
    //     Map<Integer, Integer> prefixSumCount = new HashMap<>();
    //     prefixSumCount.put(0, 1);  // Base case for when a subarray starts from index 0

    //     int prefixSum = 0;
    //     int result = 0;

    //     for (int num : nums) {
    //         prefixSum += num;

    //         // Check if there's a prefix sum that would make the current subarray sum equal to the goal
    //         if (prefixSumCount.containsKey(prefixSum - goal)) {
    //             result += prefixSumCount.get(prefixSum - goal);
    //         }

    //         // Update the hash map with the current prefix sum
    //         prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
    //     }

    //     return result;










        //OPTIMAL(SAVES O(n) spcae complexity)
        return getSol(nums, goal) - getSol(nums, goal-1);






    }
}

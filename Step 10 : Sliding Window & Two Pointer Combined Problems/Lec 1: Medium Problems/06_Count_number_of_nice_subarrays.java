//PROBLEM link: https://leetcode.com/problems/count-number-of-nice-subarrays/




//*****THIS WAS EXACTLY THE SAME PROBLEM LIKE ABOVE ONE(here is odd and previous one was 1)

class Solution {

    //OPTIMIZED
    private static int getSol(int[] nums, int goal){ 
        if(goal<0) return 0;
        int totalSubArr = 0;
        int left=0, right = 0, currSum =0;
        while(right<nums.length){
            currSum += nums[right]%2;
            while (currSum>goal) {
                currSum -= nums[left]%2;
                left++;
            }
            totalSubArr += right-left+1;


            right++;
        }
        
        return totalSubArr;

    }



    public int numberOfSubarrays(int[] nums, int k) {

        // //TLE
        // int totalSubArr = 0;
        // for(int i=0;i<nums.length;i++){
        //     int totalOddCount = 0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]%2==1){
        //             totalOddCount++;
        //         }
        //         if(totalOddCount==k){
        //             totalSubArr++;
        //         }
        //         if(totalOddCount>k){
        //             break;
        //         }
        //     }
        // }

        // return totalSubArr;




 
        // //  BETTER
        // int goal = k;
        //  Map<Integer, Integer> prefixSumCount = new HashMap<>();
        // prefixSumCount.put(0, 1);  // Base case for when a subarray starts from index 0

        // int prefixSum = 0;
        // int result = 0;

        // for (int num : nums) {
        //     prefixSum += num%2;

        //     // Check if there's a prefix sum that would make the current subarray sum equal to the goal
        //     if (prefixSumCount.containsKey(prefixSum - goal)) {
        //         result += prefixSumCount.get(prefixSum - goal);
        //     }

        //     // Update the hash map with the current prefix sum
        //     prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        // }

        // return result;









    //OPTIMAL
    int goal = k;
    return getSol(nums, goal) - getSol(nums, goal-1);







    }
}

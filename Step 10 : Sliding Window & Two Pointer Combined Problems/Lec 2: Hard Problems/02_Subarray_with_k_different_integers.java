//problem link: https://leetcode.com/problems/subarrays-with-k-different-integers/description/







class Solution {

    //OPTIMIZED
    private static int getSol(int[] nums, int k){ 
      HashMap<Integer,Integer> map = new HashMap<>();
      int left=0;
      int right=0;
      int count=0;
      while(right<nums.length){
          map.put(nums[right], map.getOrDefault(nums[right],0)+1);
          while(map.size()>k){
              map.put(nums[left],map.get(nums[left])-1);
              if(map.get(nums[left])==0){
                  map.remove(nums[left]);
              }
              left++;
          }
          count = count+ right-left+1;
          right++;
      }
      return count;
    }


    public int subarraysWithKDistinct(int[] nums, int k) {

    //     //TLE
    //    int ans = 0;
    //    for(int i=0;i<nums.length;i++){
    //      HashSet<Integer> hst = new HashSet<>();
    //      for(int j=i;j<nums.length;j++){
    //         hst.add(nums[j]);
    //         if(hst.size()==k){
    //            ans++;
    //         }else if(hst.size()>k){
    //            break;
    //         }
    //      }
    //    }

    //    return ans;




    //OPTIMIZED
    return (getSol(nums, k)-getSol(nums, k-1));





    }
}

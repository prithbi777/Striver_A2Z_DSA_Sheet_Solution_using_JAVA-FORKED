# First Lecture Is Missing(For Basics)
Please Watch First.
LINK: https://youtu.be/9kdHxplyl5I?si=3_7cRwrsdAL2DvOz

# PROBLEM IN THE FIRST LEC:
"LONGEST SUBARRAY WITH SUM <= K"



SOL:

import java.util.*;
public class Solution {
    //CREATE FUNCTIONS AFTER THIS!
    private static int getSol(int[] arr, int k){ 

        // //SLIDING WINDOW(BETTER APR)
        // int maxLen = 0;
        // int left = 0, right = 0;
        // int sum = 0;
        // while(right<arr.length){
        //     sum += arr[right];
        //     while(sum>k){
        //         sum -= arr[left];
        //         left++;
        //     }
            
        //     if(sum<=k){
        //         maxLen = Math.max(maxLen, (right-left+1));
        //     }

        //     right++;
        // }

        // return maxLen;


        //OPTIMAL APR
        int maxLen = 0;
        int left = 0, right = 0;
        int sum = 0;
        while(right<arr.length){
            sum += arr[right];

            //because basically we are asked to find the length of the array
            if(sum>k){
                sum -= arr[left];
                left++;
            }
            
            if(sum<=k){
                maxLen = Math.max(maxLen, (right-left+1));
            }

            right++;
        }

        return maxLen;

    }


    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 3, 4, 4, 4};
        int k = 8;
        System.out.println(getSol(nums, k));

    }
}


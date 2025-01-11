//problem link: https://www.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1





class Solution {
    public static int totalFruits(Integer[] arr) {
        
    //     //BRUTE FORCE APP O(n^2)
    //   int mx = 0;
    //     for(int i=0;i<arr.length;i++){
    //         int currSum = 0;
    //         Set<Integer> st = new HashSet<>();
    //         for(int j=i;j<arr.length;j++){
    //             st.add(arr[j]);
    //             if(st.size()<=2){
    //                 currSum += arr[j];
    //                 mx = Math.max(mx, (j-i+1));
    //             }else{
    //                 break;
    //             }
    //         }
    //     }

    //     return mx;
    
    
    
    
    
    
    
    
    
    // //OPTIMIZED 
    //   int mx = 0;
    //     int left = 0, right = 0;
    //     Map<Integer, Integer> mp = new HashMap<>();
    //     while(right<arr.length){
    //         mp.put(arr[right], mp.getOrDefault(arr[right], 0)+1);
    //         while(mp.size()>2){
    //             mp.put(arr[left], mp.get(arr[left])-1);
    //             if(mp.get(arr[left])==0){
    //                 mp.remove(arr[left]);
    //             }
                
    //             left++;
    //         }

    //         if(mp.size()<=2){
    //             mx = Math.max(mx, (right-left+1));
    //         }

    //         right++;
    //     }

    //     return mx;
        
        
        
        
        
        
        
        
        //SLIGHTLY MORE OPTIMIZED
        int mx = 0;
        int left = 0, right = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        while(right<arr.length){
            mp.put(arr[right], mp.getOrDefault(arr[right], 0)+1);
            if(mp.size()>2){
                mp.put(arr[left], mp.get(arr[left])-1);
                if(mp.get(arr[left])==0){
                    mp.remove(arr[left]);
                }
                
                left++;
            }

            if(mp.size()<=2){
                mx = Math.max(mx, (right-left+1));
            }

            right++;
        }

        return mx;
        
        
    }
}

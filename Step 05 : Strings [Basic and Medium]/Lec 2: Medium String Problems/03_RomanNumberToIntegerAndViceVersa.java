// Question Link: https://leetcode.com/problems/roman-to-integer/description/


class Solution {
     public int romanToInt(String s) {
        
        int ans = 0, num = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
        
            switch(s.charAt(i)) {
                case 'I': num = 1; 
                    break;
                case 'V': num = 5; 
                    break;
                case 'X': num = 10; 
                    break;
                case 'L': num = 50; 
                    break;
                case 'C': num = 100; 
                    break;
                case 'D': num = 500; 
                    break;
                case 'M': num = 1000; 
                    break;
            }

            if (4 * num < ans) {
                ans -= num;
            } else {
                ans += num;
            }
        }

        return ans;
    }
}

















//MINE
class Solution {
    public int getVal(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
       int n = s.length();
       int sum = 0;
       for(int i=0;i<n;i++){
        
        if(i+1<n && getVal(s.charAt(i))<getVal(s.charAt(i+1))){
           sum = sum - getVal(s.charAt(i));
        }else{
            sum = sum + getVal(s.charAt(i));
        }
    
    }
    return sum;
        
    }
}

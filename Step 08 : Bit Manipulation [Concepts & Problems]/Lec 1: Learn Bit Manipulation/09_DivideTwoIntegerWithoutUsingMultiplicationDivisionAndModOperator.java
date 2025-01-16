// Question Link: https://leetcode.com/problems/divide-two-integers/


class Solution {
   
    // Time Complexity = O(log(n)), Space Complexity = O(1)
    public int divide(int dividend, int divisor) {
        // If dividend is Integer.MIN_VALUE and divisor is -1, return Integer.MAX_VALUE to prevent overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Use absolute values to avoid negative issues
        long absDividend = Math.abs((long) dividend); // Cast to long to avoid overflow
        long absDivisor = Math.abs((long) divisor);

        // Initialize the quotient
        int quotient = 0;

        // Perform the division using bit shifting
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor, multiple = 1;
            
          // Double the divisor until it's larger than the dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1; // Double the divisor
                multiple <<= 1; // Double the multiple
            }
          
            // Subtract the largest shifted divisor from dividend
            absDividend -= tempDivisor;
            quotient += multiple; // Add the corresponding multiple to quotient
        }

        // Apply the sign to the quotient
        return isNegative ? -quotient : quotient;
    }
}









//   MINE
class Solution {
    public int divide(int dividend, int divisor) {
         // Handle edge case where division would cause overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long ans = 0;
        int sign = 1;

        // Determine the sign of the result
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            sign = -1;
        }

        // Convert dividend and divisor to positive long values to handle overflow
        long n = Math.abs((long) dividend);
        long m = Math.abs((long) divisor);

        while (n >= m) {
            long ct = 0;
            // Find the highest power of two for which (m << ct) is less than or equal to n
            while (n >= (m << ct+1)) {
                ct++;
            }

            // Subtract the largest shifted divisor from n and update the answer
            n = n - (m << ct);
            ans += (1 << ct);
        }

        // Apply the sign to the result
        return (int) (ans * sign);
    }
}

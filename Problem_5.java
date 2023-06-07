import java.util.* ;
import java.io.*;

public class Problem_5 {

    public class Solution {
           //Nmae Ankit Rajput
        // Maximum subarray Problem
        public static long maxSubarraySum(int[] arr, int n) {
            long sum=0,max=Long.MIN_VALUE;
            for(int i=0; i<n; i++)
            {
                sum+=arr[i];  // prefix sum
                if (sum > max) {
                    max = sum;
                }// we take maximum of sum and max  and store in max
                if(sum<0) // if sum is negative means it can't be maximum so sum=0
                    sum=0;


            }
            // write your code here
            return max>0?max:0;
        }

    }

}

import java.io.*;
import java.util.* ;

import java.util.ArrayList;
// Name Ankit Rajput
// Duplicate in array
public class Problem_6 {


    public class Solution{
        public static int findDuplicate(ArrayList<Integer> arr, int n){
            // Write your code here.
            HashMap<Integer,Integer>hm = new HashMap();
            for(int i=0; i<arr.size(); i++)
            {
                hm.put(arr.get(i), hm.getOrDefault(arr.get(i),0)+1);
            }
            Set<Integer> s= hm.keySet();
            for(int val :s)
            {
                if(hm.get(val)>1)
                    return val;
            }
            return -1;
        }
    }

}

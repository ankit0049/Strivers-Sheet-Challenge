import java.io.*;
import java.util.* ;

import java.util.ArrayList;
public class Problem_4 {

    public class Solution {
        public static ArrayList<ArrayList<Long>> printPascal(int n) {
            // Write your code here.
            ArrayList<ArrayList<Long>> ans = new ArrayList<>();

				 /*why here we only intilize temp why not define like pre
				 beacuse if we define here then every step one list use and the affect the pascals
				 tringle
*/

            ArrayList<Long> ds ,pre= null;
            long k=1;
            for(int i=0; i<n; i++)
            {  ds = new ArrayList();
                for(int j=0; j<=i; j++)
                {
                    if(j==0|| j==i)
                    {
                        ds.add(k);

                    }
                    else
                    { long v=pre.get(j-1)+pre.get(j);
                        ds.add(v);
                    }
                }
                pre=ds;
                ans.add(ds);
            }
            return ans;
        }
    }

}

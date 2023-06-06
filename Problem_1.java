import java.util.*;
    public class Problem_1
    {
        public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)
        {
            // Write your code here.
            ArrayList<Integer> ans = new ArrayList<>();
            int ind=-1;
            for(int i=permutation.size()-2; i>=0; i--)
            {
                if(permutation.get(i)<permutation.get(i+1))
                {
                    ind=i;
                    break;
                }
            }
            if (ind == -1) {
                // reverse the whole arraylist:
                Collections.reverse(permutation);
                return permutation;
            }
            int p=permutation.size()-1;

            for( ;p>ind; p--)
            {
                if(permutation.get(p)>permutation.get(ind))
                {int tmp = permutation.get(p);
                    permutation.set(p, permutation.get(ind));
                    permutation.set(ind,tmp);

                    break;
                }
            }


            List<Integer> sublist = permutation.subList(ind + 1, permutation.size());
            Collections.reverse(sublist);

            return permutation;
        }
        ArrayList<Integer>Permutation;
    }



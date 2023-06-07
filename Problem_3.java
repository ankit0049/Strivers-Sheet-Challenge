
public class Problem_3 {

    public class Solution {
        public static void setZeros(int matrix[][]) {

            int row = matrix.length;
            int col= matrix[0].length;
            int coll = 0;
        /*
         we take two internally array  but here one value repeat so in our
         col array we take one varible that is coll
        */

            for(int i=0; i<row; i++)
            {
                if(matrix[i][0]==0)coll=1;
                for(int j=1; j<col; j++)
                {
                    if(matrix[i][j]== 0)
                    {
                        matrix[i][0]= matrix[0][j] =0;
                    }
                }
            }

            for(int i=row-1; i>=0; i--)
            {
                for(int j=col-1 ; j>=1; j--)

                    if(matrix[i][0]==0||matrix[0][j]==0)
                    {
                        matrix[i][j]=0;
                    }

                if(coll==1)
                    matrix[i][0]=0;

            }
        }
    }
}

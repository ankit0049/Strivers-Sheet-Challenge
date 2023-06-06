public class Problem_2 {

        static void swap (int []arr , int x , int y)
        {
            int temp= arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
        public static void sort012(int[] arr)
        {
            //Write your code here

            int st =0 ,mid=0,e=arr.length-1;

            while(mid<=e)
            {
                if(arr[mid]==1)
                    mid++;

                else if(arr[mid]==2)
                {
                    swap(arr,mid,e);
                    e--;
                }

                else
                {
                    swap(arr,st,mid);
                    st++;
                    mid++;
                }

            }
        }

}

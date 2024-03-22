package AD_2;
public class smallest_sum {
        static int smallest_pair(int[] a, int n)
        {
            int min =  Integer.MAX_VALUE, smin =  Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (a[j] < min)
                {
                    smin = min;
                min = a[j];
            }

                else if ((a[j] < smin) && a[j] != min)
                    smin = a[j];
            }
            System.out.print("The cost is "+min +","+smin+": ");
            return (smin + min);
        }

        // Driver code
        public static void main(String[] args)
        {
            int[] arr = { 10, 7, 3 ,4 ,5,6};
            int n = arr.length;

            System.out.println(smallest_pair(arr, n));
        }
    }

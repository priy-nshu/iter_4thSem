package CSW_2;

public class Abhisek {

    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }


    int lower_bound(int arr[], int key, int low, int high)
    {
        if (low > high)
            //return -1;
            return low;

        int mid = low + ((high - low) >> 1);
        //if (arr[mid] == key) return mid;

        //Attention here, we go left for lower_bound when meeting equal values
        if (arr[mid] >= key)
            return lower_bound(arr, key, low, mid - 1);
        else
            return lower_bound(arr, key, mid + 1, high);
    }

    int upper_bound(int arr[], int key, int low, int high)
    {
        if (low > high)
            //return -1;
            return low;

        int mid = low + ((high - low) >> 1);
        //if (arr[mid] == key) return mid;

        //Attention here, we go right for upper_bound when meeting equal values
        if (arr[mid] > key)
            return upper_bound(arr, key, low, mid - 1);
        else
            return upper_bound(arr, key, mid + 1, high);
    }

    public static void main(String args[])
    {
        Abhisek ob = new Abhisek();
        int arr[] = { 2, 10, 10, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        int a=ob.lower_bound(arr,x,0,result);
        int b=ob.upper_bound(arr,x,result,n-1);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result + ", "+ a +", " + b);
    }
}

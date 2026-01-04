public class Sliding_window {


    public static int maxSum(int arr[], int k){

        int windowsum = 0;
        // calculate the first k sum
        for(int i =0; i < k; i++){
            windowsum+= arr[i];
        }
        int maxsum = windowsum;

        // Slide the window
        for(int i = k; i < arr.length; i++){
            windowsum+=arr[i]; //incoming element add
            windowsum -= arr[i-k]; //removing outgoing element
            maxsum = Math.max(maxsum, windowsum);
        }
        return maxsum;

    }

    public static void main(String[] args) {
      int arr[] = {2, 1, 5, 1, 3, 2};    
      int k = 3;
      int result = maxSum(arr, k);
      System.out.println(result);
    }
}
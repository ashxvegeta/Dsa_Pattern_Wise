public class two_sum_reurn_index {
    

    public static int[] twosum(int arr[],int key){

        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            int sum = arr[start]+arr[end];
            if(sum==key){
                return new int[]{start,end};
            }
            else if(sum<key){
                start++;
            }else{
                end--;
            }
        }

        return new int[]{-1,-1};

    }

    public static void main(String args[]){
        int arr[] ={1,3,4,6,8};
        int key = 10;
        int result[] = twosum(arr, key);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

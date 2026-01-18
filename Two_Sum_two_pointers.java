public class Two_Sum_two_pointers {
    

    public static boolean TwoSum(int arr[],int key){

        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int sum = arr[start]+arr[end];
            if(sum==key){
                return true;
            }
            else if(sum<key){
               start++;
            }else{
                end--;
            }
           
        }
         return false;
    }
    public static void main(String args[]){
        int arr[] = {1,3,4,6,8};
        int target = 10;
        System.out.println(TwoSum(arr, target));
    }
}

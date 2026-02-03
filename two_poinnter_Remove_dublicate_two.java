public class two_poinnter_Remove_dublicate_two {
    

    public static int removeDeuplicates(int arr[]){


        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if(slow<2 || arr[fast] != arr[slow-2] ){
                arr[slow] = arr[fast];
                slow++;
            }

        }

        return slow;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        System.out.println("Original length: " + removeDeuplicates(arr));

    }
}

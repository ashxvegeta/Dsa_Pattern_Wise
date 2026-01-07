public class Two_Pointers_Remoeve_dublicates {
    
    public static int removeDublicates(int nums[]) {
        
        int slow =0;

        for(int fast =1 ;fast<nums.length;fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }

    public static void main(String args[]){

        int nums[]= {1,1,2,2,3};
        System.out.println("Number of unique elements: " + removeDublicates(nums));
    }
}

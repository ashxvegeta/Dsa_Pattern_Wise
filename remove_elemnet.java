
public  class remove_elemnet {


    public  static int remove_element(int nums[],int val){
        int slow = 0;
        for(int fast= 0; fast<nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }     
        }
        return slow;
    }
    public static void main(String[] args) {
    
    int nums[] = {3,2,2,3};
    int val = 3;
    int length = remove_element(nums,val);
    System.out.println("the length is:"+length);
}
}


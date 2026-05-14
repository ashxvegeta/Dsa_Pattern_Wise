public class Reverse_an_array
{
    
    public static int[] rev(int arr[]){
        
        int left = 0;
        int right = arr.length-1;
        
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
        
    }
    
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5};
	    int revarr[] = rev(arr);
	    for(int i=0; i<revarr.length;i++){
	        System.out.print(revarr[i]);
	    }
	}
}
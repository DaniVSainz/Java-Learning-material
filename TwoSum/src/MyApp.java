import java.util.Arrays;

public class MyApp {

	public static int[] twoSum(int[] nums, int target) {
        int[] numbers = new int[2];
//        System.out.println(Arrays.toString(nums));
        
	    for (int i = 0; i <= nums.length -1 ; i++){
	//         first loop is iterating over the array to select number to add to
	        for (int x = 0; x <= nums.length -1; x++){
	//             second loop is iterating over numbers it will add to
	//             condition is do aslong as i != x 
	            if (i != x ){
	            	System.out.println(i);
	            	System.out.println(x);
	            	System.out.println("****************");
	            	if (nums[i] + nums[x] == target){
	                numbers[0] = i ;
	                numbers[1] = x;
	            	}
	            }
	        }
	    }
//	    System.out.println(numbers[0]);
//	    System.out.println(numbers[1]);
	    return numbers ;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		twoSum(nums,target);
	}

}

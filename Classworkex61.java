import java.util.Arrays;

public class Classworkex61 {
        public static void main(String[] args) {
            int[] nums = {-7, 1, 5, 2, -4, 3, 0};
            System.out.println("Original array: "+ Arrays.toString(nums));
            equlibrium_indices(nums);
        }public static void equlibrium_indices(int[] nums){
            //find total sum
            int totalSum = 0;
            for (int n : nums) {
                totalSum += n;
            }
            int runningSum = 0;
            for (int i = 0; i < nums.length; i++) {
                int n = nums[i];
                if (totalSum - runningSum - n == runningSum) {
                    System.out.println("Equilibrium indices found at : "+i);
                }
                runningSum += n;
            }
        }
    }


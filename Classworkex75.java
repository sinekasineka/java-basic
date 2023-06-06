import java.util.Arrays;

public class Classworkex75 {
    public static void main(String[] args) {
            //int[] nums = {1, 2 ,5, 0, 4, 3, 6};
            int[] nums = {1, 2 ,5, 0, 3, 6, 7};
            System.out.printf("\nOriginal array: " + Arrays.toString(nums));

            boolean result = test(nums);
            System.out.printf("\nCheck consecutive numbers in the said array!" + result);
        }

        public static boolean test(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length - 1] == (nums[0] + nums.length - 1);
        }
    }


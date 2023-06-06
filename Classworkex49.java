import java.util.Arrays;

public class Classworkex49 {
        public static void main(String[] args) throws Exception {
            int[] nums = {0, 0, 1, 1, 0, 1, 1, 1, 0};
            System.out.println("Original Array\n" + Arrays.toString(nums));

            int mICond = 0;
            for (int mAl = 1; mAl < nums.length; mAl++){
                if (nums[mICond] == 1 && nums[mAl] == 0){
                    int temp = nums[mAl];
                    nums[mAl] = nums[mICond];
                    nums[mICond] = temp;
                    mICond++;
                }
                if (nums[mICond] == 0) mICond++;
            }
            System.out.println("New Array\n" + Arrays.toString(nums));
        }
    }



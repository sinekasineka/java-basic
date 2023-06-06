import java.util.Arrays;

public class Classworkex50 {
    public static void main(String[] args) {
        int[] nums = { 20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        int i =0, j = 0;
        while(j < nums.length){
            if(nums[j] % 2 == 0){
                int temp;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }

    }


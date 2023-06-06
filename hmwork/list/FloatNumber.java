package hmwork.list;

import java.math.BigDecimal;

public class FloatNumber {
    public static void main(String[] args) {
        float num = 1541.3256412f;
        int decimal_place = 4;
        BigDecimal bd_num = new BigDecimal(Float.toString(num));
        bd_num = bd_num.setScale(decimal_place, BigDecimal.ROUND_HALF_UP);
        System.out.printf("Original number: %.7f\n",num);
        System.out.println("Rounded upto 4 decimal: "+bd_num);
    }
}

public class Classwork4 {
    public static void main(String[] args) {
        int[] number={12,24,32,13,18,23,14,21,20};
        int sum=0;
        int length=number.length;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        double average=sum/length;
        System.out.println("avarage of tha number:"+average);

    }

}

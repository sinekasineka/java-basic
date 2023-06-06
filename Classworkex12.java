public class Classworkex12 {
   public static void main(String[] args) {
       int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
       System.out.println("original array:");
       for (int i = 0; i < array.length; i++) {
           System.out.println(array[i] + " ");

       }
       System.out.println();
       System.out.println("array reverse order:");
       for (int i = array.length-1; i >= 0; i--) {
           System.out.println(array[i] + " ");
       }

   }
}

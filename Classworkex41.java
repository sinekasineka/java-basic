public class Classworkex41 {
    public static void main(String[] args) {
                int[] numbers = {5, 7, -8, 5, 14, 1};
                int smallest = Integer.MAX_VALUE;
                int secondSmallest = Integer.MAX_VALUE;

                for (int i = 0; i < numbers.length; i++){
                    if (numbers[i] < smallest) {
                        secondSmallest = smallest;
                        smallest = numbers[i];
                    }
                    else if (numbers[i] < secondSmallest && (numbers[i] != smallest))
                        secondSmallest = numbers[i];
                }
                if (secondSmallest == Integer.MAX_VALUE)
                    System.out.println("No second smallest element.");
                else
                    System.out.println("The smallest element is "+ smallest +
                            " and second Smallest  element is " + secondSmallest+".");
            }
        }



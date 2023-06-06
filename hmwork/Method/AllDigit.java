package hmwork.Method;

public class AllDigit {
    public static void main(String[] args) {


            for(int i = 1; i <= 20; i++)
            {
                if(isPrime(i))
                {
                    System.out.print(i + "\n");
                }
            }
        }

        public static boolean isPrime(int number)
        {
            for(int i = 2; i < number; i++)
            {
                if(number % i == 0)
                {
                    return false;
                }
            }

            return true;
        }
    }


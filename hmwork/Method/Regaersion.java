package hmwork.Method;

public class Regaersion {
    public static int factorialofnumber (int n) {



            if (n == 0)
                return 1;
            else
                return(n * factorialofnumber(n-1));
        }
        public static void main(String args[]){
            int fact=1;
            int number=5 ;//It is the number to calculate factorial
            fact = factorialofnumber(number);
            System.out.println("Factorial of "+number+" is: "+fact);
        }
    }



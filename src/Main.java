//This is an added new comment
public class Main {

    public static void main(String[] args) throws Exception{
        try {
            System.out.println(recursiveFactorial(5));   //use try catch to call factorial
        } catch (PreconditionException pe) {
            System.out.println(pe.getMessage());
        }
    }

    public static int factorial(int number) throws Exception {
        int fact = 1;
        try {
            assert number >= 1 : "Factorial should be called with number >= 0";
        } catch (AssertionError ae){
            System.out.println(ae.getMessage());
        }
        if (number < 0)
            throw new PreconditionException("Number must be >= 0");   //throw custom exception
        else if (number == 0)
            return 1;
        else
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
        return fact;
    }

    public static int recursiveFactorial(int number) throws Exception {
        int fact = 1;
        if (number < 0)
            throw new Exception("Number must be >= 0");
        else if (number == 0)
            return 1;
        else
            return number * recursiveFactorial(number - 1);
    }
}

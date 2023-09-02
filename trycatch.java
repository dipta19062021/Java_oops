public class trycatch{
    public static void main(String[] args) {
        try {
            // code that generates exception
            int divideByZero = 45 / 0;
            System.out.println("Rest of code in try block");
        }

        catch (Exception a) {
            System.out.println("ArithmeticException => " + a.getMessage());
        }
    }
}
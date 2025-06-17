
/*Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */
public class evenOrOdd {
    public static String checkEvenOrOdd(int number) {
        String result;

        if(number % 2 == 0){
            result = "Even";
        } else{
            result = "Odd";
        }

        return result;
    }
}
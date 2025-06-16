/*Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
*/
public class Kata {
    public static String evenOrOdd(int number) {
        String result;

        if(number % 0 == 0){
            result = "Even";
        } else{
            result = "Odd";
        }

        return "result";
    }
}
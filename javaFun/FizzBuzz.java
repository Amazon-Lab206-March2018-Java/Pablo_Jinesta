public class FizzBuzz {
    public String fizzBuzz(int number) {

        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzbuzz = "FizzBuzz";

        // fizzbuzz logic here
        if (number % 3 == 0 && number % 5 == 0){
            // print FizzBuzz if the number is divisible by 3 and 5
            return fizzbuzz;
        } else if(number % 3  == 0) {
            // print Fizz if the number is divisible by 3
            return fizz;
        } else if(number % 5 == 0) {
            // print Buzz if the number is divisible by 5
            return buzz;
        } else {
            // the number itself for all other cases
            return String.valueOf(number);
        }
    }
}
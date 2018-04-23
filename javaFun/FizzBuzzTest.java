public class FizzBuzzTest{
    public static void main (String[] args){
        FizzBuzz check = new FizzBuzz();
        System.out.println(check.fizzBuzz(9));
        System.out.println(check.fizzBuzz(50));
        System.out.println(check.fizzBuzz(15));
        System.out.println(check.fizzBuzz(2));
    }
}

// Compile:
// javac FizzBuzzTest.java
// java FizzBuzzTest
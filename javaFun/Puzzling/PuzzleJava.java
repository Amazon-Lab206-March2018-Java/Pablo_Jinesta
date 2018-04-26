import java.util.*;

public class PuzzleJava {
    public static void main(String[] args) {
        PuzzleJava doThis = new PuzzleJava();

        // PartOne
        // Print the sum of all numbers in the array
        // And have the function return an array that only includes numbers that are greater than 10
        System.out.println(
                "\n\nPrint Sum of: [3,5,1,2,7,9,8,13,25,32] and return an array that only includes numbers that are greater than 10");
        System.out.println(doThis.partOne(new int[] { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 }, 10));

        // Part Two
        // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa
        // Shuffle the array and print the name of each person. 
        // Have the method also return an array with names that are longer than 5 characters.
        System.out.println(
                "\n\nCreate array: [Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa]. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.");
        System.out.println(doThis.partTwo(5));

        // Part Three
        // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        // Shuffle the array and display the last letter of the array. 
        // Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message
        System.out.println(
                "\n\nCreate an array that contains all 26 letters of the alphabet. Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message");
        doThis.partThree();

        // Part Four
        // Generate and return an array with 10 random numbers between 55-100.
        System.out.println("\n\nGenerate and return an array with 10 random numbers between 55-100");
        System.out.println(doThis.partFour());

        // Part Five
        // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). 
        // Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
        System.out.println(
                "\n\nGenerate and return an array with 10 random numbers between 55-100 and have it be sorted");
        System.out.println(doThis.partFive(10));

        // Part Six
        // Create a random string that is 5 characters long.
        System.out.println("\n\nCreate a random string that is 5 characters long: ");
        doThis.partSix(5);

        // Part Seven
        // Generate an array with 10 random strings that are each 5 characters long
        System.out.println("\n\nGenerate an array with 10 random strings that are each 5 characters long: ");
        doThis.partSeven(5, 10);
    }

    public ArrayList<Integer> partOne(int[] array, int x) {
        int sum = 0;
        int length = array.length;
        ArrayList<Integer> greaterThanX = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        for (int total : array) {
            if (total > x) {
                greaterThanX.add(total);
            }
        }
        System.out.println(sum);
        return greaterThanX;
    }

    public ArrayList<String> partTwo(int x) {
        ArrayList<String> dynamicArray = new ArrayList<String>();
        ArrayList<String> longnameArray = new ArrayList<String>();
        dynamicArray.add("Nancy");
        dynamicArray.add("Jinischi");
        dynamicArray.add("Fujibayashi");
        dynamicArray.add("Momochi");
        dynamicArray.add("Ishikawa");
        Collections.shuffle(dynamicArray);

        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }

        for (int i = 0; i < dynamicArray.size(); i++) {
            String name = dynamicArray.get(i);
            int longName = name.length();
            if (longName > x) {
                longnameArray.add(name);
            }
        }
        return longnameArray;

    }

    public void partThree() {
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        System.out.println("Alphabet: " + Arrays.toString(alphabet));

        Collections.shuffle(Arrays.asList(alphabet));
        System.out.println("Shuffle the array: " + Arrays.toString(alphabet));

        String last = alphabet[25];
        System.out.println("Display the last letter of the array = " + last);

        String first = alphabet[0];
        if ("a" == first || "e" == first || "i" == first || "o" == first || "u" == first) {
            System.out.println("Attention: First letter in the array is a vowel = " + first);
        } else {
            System.out.println("First letter of the array = " + first);
        }

    }

    public ArrayList<Integer> partFour() {
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            randomArray.add(new Random().nextInt((100 - 55) + 1) + 55);
        }

        return randomArray;
    }

    public ArrayList<Integer> partFive(int x) {
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
            randomArray.add(new Random().nextInt((100 - 55) + 1) + 55);
        }
        Collections.sort(randomArray);

        int min = randomArray.get(0);
        int max = randomArray.get(9);

        System.out.println("Minimum value in the array is: " + min);
        System.out.println("Maximum value in the array is: " + max);

        return randomArray;
    }

    public void partSix(int x) {
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        ArrayList<String> alphabetList = new ArrayList<String>(Arrays.asList(alphabet));
        Random randomLetter = new Random();
        String randomStr = "";
        int stringSize = x;
        for (int i = 0; i < stringSize; i++) {
            randomStr = randomStr.concat(alphabetList.get(randomLetter.nextInt(alphabetList.size())));
        }
        System.out.println(randomStr);
    }

    public void partSeven(int x, int y) {
        int stringSize = x;
        int strings = y;
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        ArrayList<String> alphabetList = new ArrayList<String>(Arrays.asList(alphabet));
        String[] randomStrings = new String[strings];
        Random randomLetter = new Random();
        for (int z = 0; z < strings; z++) {
            String randomStr = "";
            for (int i = 0; i < stringSize; i++) {
                randomStr = randomStr.concat(alphabetList.get(randomLetter.nextInt(alphabetList.size())));
            }
            randomStrings[z] = randomStr;
        }
        for (String word : randomStrings) {
            System.out.println(word);
        }

    }

}

// Compile:
// javac PuzzleJava.java
// java PuzzleJava
// git push origin2 master
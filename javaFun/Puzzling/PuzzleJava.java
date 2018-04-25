import java.util.*;

public class PuzzleJava {
    public static void main(String[] args) {
        PuzzleJava doThis = new PuzzleJava();

        // PartOne
        // Print the sum of all numbers in the array
        // And have the function return an array that only includes numbers that are greater than 10
        System.out.println("\n\nPrint Sum of: [3,5,1,2,7,9,8,13,25,32] and return an array that only includes numbers that are greater than 10");
        System.out.println(doThis.partOne(new int [] {3,5,1,2,7,9,8,13,25,32}, 10));

        // Part Two
        // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa
        // Shuffle the array and print the name of each person. 
        // Have the method also return an array with names that are longer than 5 characters.
        System.out.println("\n\nCreate array: [Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa]. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.");
        System.out.println(doThis.partTwo(5));

        // Part Three
        // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        // Shuffle the array and display the last letter of the array. 
        // Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message
        System.out.println("\n\nCreate an array that contains all 26 letters of the alphabet. Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message");
        doThis.partThree();
    }

    public ArrayList<Integer> partOne(int[] array, int x) {
        int sum = 0;
        int length = array.length;
        ArrayList<Integer> greaterThanX = new ArrayList<Integer>();
        for(int i = 0; i < length; i++){
            sum += array[i];
        }
        for(int total : array){
            if (total > x){
                greaterThanX.add(total);
            }
        }
        System.out.println(sum);
        return greaterThanX;
    }

    public ArrayList<String> partTwo(int x){
        ArrayList<String> dynamicArray = new ArrayList<String>();
        ArrayList<String> longnameArray = new ArrayList<String>();
        dynamicArray.add("Nancy");
        dynamicArray.add("Jinischi");
        dynamicArray.add("Fujibayashi");
        dynamicArray.add("Momochi");
        dynamicArray.add("Ishikawa");
        Collections.shuffle(dynamicArray);

        for (int i = 0; i < dynamicArray.size(); i++){
            System.out.println(dynamicArray.get(i));
        }

        for(int i = 0; i < dynamicArray.size(); i++){
            String name = dynamicArray.get(i);
            int longName = name.length();
            if(longName > x){
                longnameArray.add(name);
            }
        }
        return longnameArray;

    }

    public void partThree(){
        String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println("Alphabet: " + Arrays.toString(alphabet));

        Collections.shuffle(Arrays.asList(alphabet));
        System.out.println("Shuffle the array: " + Arrays.toString(alphabet));
    
        String last = alphabet[25];
        System.out.println("Display the last letter of the array = " + last);
  
        String first = alphabet[0];
        if ("a" == first || "e" == first || "i" == first || "o" == first || "u" == first ){
            System.out.println("Attention: First letter in the array is a vowel = " + first);
        } else{
            System.out.println("First letter of the array = " + first);
        }
 
    }         

}

// Compile:
// javac PuzzleJava.java
// java PuzzleJava
// git push origin2 master
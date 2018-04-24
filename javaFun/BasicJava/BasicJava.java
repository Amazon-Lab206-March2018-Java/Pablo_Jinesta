import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public static void main(String[] args) {
        BasicJava print = new BasicJava();

        // Print 1-255
        System.out.println("Print 1-255:");
        print.oneTo255();

        // Print odd numbers between 1-255
        System.out.println("\n\nPrint odd numbers between 1-255:");
        print.oddNumbers1To255();

        // Print Sum
        System.out.println("\n\nPrint Sum:");
        print.sum();

        // Iterating through an array
        System.out.println("\n\nIterating through an array:");
        print.iteratingArray(new int[] {1,3,5,7,9,13});

        // Find Max
        System.out.println("\n\nFind Max: [-3, -5, -7]");
        print.findMax(new int [] {-3, -5, -7});

        // Get Average
        System.out.println("\n\nGet Average: [2, 10, 3]");
        print.getAverage(new int [] {2, 10, 3});

        // Array with Odd Numbers
        System.out.println("\n\nArray with Odd Numbers:");
        print.arrayOddNumbers();

        // Greater Than Y
        System.out.println("\n\nGreater Than Y: [1,3,5,7], 3");
        System.out.println(print.greaterThanY(new int [] {1,3,5,7}, 3));
        
        // Square the values
        System.out.println("\n\nSquare the values: [1, 5, 10, -2]");
        print.squareValues(new int [] {1, 5, 10, -2});

        // Eliminate Negative Numbers
        System.out.println("\n\nEliminate Negative Numbers: [1, 5, 10, -2]");
        print.delNegativeNumbers(new int [] {1, 5, 10, -2});

        // Max, Min, and Average
        System.out.println("\n\nMax, Min, and Average: [1, 5, 10, -2]");
        System.out.println(Arrays.toString(print.maxMinAve(new int [] {1, 5, 10, -2})));

        // Shifting the Values in the Array
        System.out.println("\n\nShifting the Values in the Array: [1, 5, 10, 7, -2]");
        print.shiftingValues(new int [] {1, 5, 10, 7, -2});

    }

    public void oneTo255() {
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }

    public void oddNumbers1To255(){
        for (int i = 1; i <= 256; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public void sum(){
        int sum = 0;
        for(int i = 0; i < 256; i++){
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void iteratingArray(int[] iterateArray){
        int length = iterateArray.length;
        for(int i = 0; i < length; i++){
            System.out.println(iterateArray[i]);
        }
    }

    public void findMax(int[] maxArray){
        int length = maxArray.length;
        int max = maxArray[0];
        for (int i = 1; i < length;i++){
            if (maxArray[i] > max){
                max = maxArray[i];
            }
        }
        System.out.println("Max value is: " + max);
    }

    public void getAverage(int[] aveArray){
        int length = aveArray.length;
        int average = 0;
        for (int i = 0; i < length;i++){
            average += aveArray[i];
        }
        average /= length;
        System.out.println("The average number is: " + average);
    }

    public void arrayOddNumbers(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i <= 256; i++) {
            if (i % 2 == 1) {
                y.add(i);
            }
        }
        System.out.println(y);
    }

    public int greaterThanY(int[] arrayGTY, int y){
        int temp = 0;
        for(int container : arrayGTY){
            if (container > y){
                temp++;
            }
        }
        return temp;    
    }

    public void squareValues(int [] x){
        int length = x.length;
        for(int i = 0; i < length; i++){
            x[i] *= x[i];
        }
        System.out.print(Arrays.toString(x));
    }

    public void delNegativeNumbers(int [] x){
        int length = x.length;
        for(int i = 0; i < length; i++){
            if(x[i] < 0){
                x[i] = 0;
            }
        }
        System.out.print(Arrays.toString(x));
    }

    public double[] maxMinAve(int [] x){
        double length = x.length;
        double avg = 0;
        double min = x[0];
        double max = x[0];
        for (int i = 0; i < length;i++){
            if(x[i] < min){
                min = x[i];
            }
            else if (x[i] > max){
                max = x[i];
            }
            avg += x[i];
        }
        double[] results = {min,max,avg/x.length};
        return results;
    }

    public void shiftingValues(int [] x){
        int length = x.length;
        for(int i = 0; i < length-1; i++){
            x[i] = x[i+1];
        }     
        x[x.length-1] = 0;
        System.out.print(Arrays.toString(x));
    }
}
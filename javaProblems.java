
import java.util.Scanner;

public class javaProblems {
    public static void main(String[] args) {

        // 1. Take 10 integer inputs from user and store them in an array and print them on screen.

        Scanner input;
        input = new Scanner(System.in);

        int [] integers;
        integers = new int[10];

        for (int i = 0; i < integers.length; i++){
            integers[i] = input.nextInt();
            }

        for (int j = 0;j < integers.length; j++){
            System.out.println(integers[j]);
        }
    }
}
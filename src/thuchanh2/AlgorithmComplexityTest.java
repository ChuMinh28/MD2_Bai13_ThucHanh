package thuchanh2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int[] frequentChar = new int[225];
        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i);
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char character = (char) 225;
        for (int i = 0; i < 225; i++) {
            if (frequentChar[i]>max){
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("the most appearing letter is "+character+" with a frequency of "+max+" times");
    }
}

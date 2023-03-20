package Assignment;

import java.util.Scanner;

public class N8 {
    //To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = in.nextLine();
        in.close();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome");
        } else {
            System.out.println(inputString + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String inputString) {
        if (inputString == null || inputString.length() == 0) {
            // An empty or null string is considered a palindrome
            return true;
        }
        int left = 0;
        int right = inputString.length() - 1;
        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
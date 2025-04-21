import java.util.Scanner;
import java.util.Stack;

class PalindromeString {
    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.next();
        boolean result = palindromeString.isPalindrome(str);
        if (result) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }

    }
}
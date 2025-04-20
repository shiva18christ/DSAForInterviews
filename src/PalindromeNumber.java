import java.util.Scanner;
import java.util.Stack;

class PalindromeNumber {
    public int reverse(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 10);
            number /= 10;
        }
        int reversedNumber = 0;
        int place = 1;
        while (!stack.isEmpty()) {
            reversedNumber = reversedNumber + stack.pop() * place;
            place *= 10;
        }
        return reversedNumber;
    }

    public void isPalindrome(int number) {
        int reverseNumber = reverse(number);
        if (reverseNumber == number) {
            System.out.println("palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int number = input.nextInt();
        palindromeNumber.isPalindrome(number);
    }
}

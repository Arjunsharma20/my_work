public class palimdrome {
    static int sum = 0; // This variable is used to store the reversed number

    public static void main(String[] args) {
        rev(1234643); // Reverse a number
        System.out.println(sum); // Print the reversed number
        System.out.println(palin(121)); // Check if number is palindrome
    }

    // Method to reverse the number
    static int rev(int n) {
        sum = 0; // Reset sum before starting to reverse
        return reverse(n);
    }

    // Recursive method to reverse the number
    static int reverse(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10; // Get the last digit
        sum = sum * 10 + rem; // Add it to the reversed number
        return reverse(n / 10); // Recurse with the remaining number
    }

    // Method to check if the number is a palindrome
    static boolean palin(int n) {
        sum = 0; // Reset sum before reversing for palindrome check
        return n == rev(n); // Compare the number with its reversed value
    }
}

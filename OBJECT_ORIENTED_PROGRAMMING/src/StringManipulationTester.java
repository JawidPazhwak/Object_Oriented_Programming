public class StringManipulationTester {
    public static void main(String[] args) {
        StringManipulation obj1 = new StringManipulation();
        obj1.reverseString("Hello");
        System.out.println();
        obj1.countVowel("Hello");
        System.out.println("Palindrome: " + obj1.palindrome("madam"));
    }
}

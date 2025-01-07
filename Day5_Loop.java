
public class Day5_Loop {
    // Define the stringTimes method outside the main method
    public static String stringTimes(String str, int n) {
        String s1 = "";
        for (int i = 0; i < n; i++) {
            s1 = s1 + str; // Concatenate the string 'n' times
        }
        return s1; // Return the resulting string
    }

    public static void main(String[] args) {
        // Call the stringTimes method and print the results
        System.out.println(stringTimes("Hi", 3));    // Output: HiHiHi
        System.out.println(stringTimes("Hello", 0)); // Output: (empty string)
        System.out.println(stringTimes("Java", 2));  // Output: JavaJava
    }
}
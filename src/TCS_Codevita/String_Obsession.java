package TCS_Codevita;
import java.util.*;

public class String_Obsession {
    // Recursive function to calculate the maximum number of substring removals
    private static int dp(String mainString, List<String> substrings, Map<String, Integer> memo) {
        // Check if the result for this string is already computed
        if (memo.containsKey(mainString)) {
            return memo.get(mainString);
        }

        int maxRemovals = 0;

        for (String sub : substrings) {
            int pos = mainString.indexOf(sub);
            if (pos != -1) {
                // Create a new string by removing the found substring
                String newString = mainString.substring(0, pos) + mainString.substring(pos + sub.length());
                // Recursively calculate the maximum removals
                maxRemovals = Math.max(maxRemovals, 1 + dp(newString, substrings, memo));
            }
        }

        // Memoize the result for the current string
        memo.put(mainString, maxRemovals);
        return maxRemovals;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of substrings
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            substrings.add(scanner.nextLine());
        }

        // Input the main string
        String mainString = scanner.nextLine();

        // Create a memoization map
        Map<String, Integer> memo = new HashMap<>();

        // Calculate the result and print it
        int result = dp(mainString, substrings, memo);
        System.out.println( + result);

        scanner.close();
    }
}

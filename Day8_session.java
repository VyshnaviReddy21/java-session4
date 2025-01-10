import java.util.ArrayList;
import java.util.List;

public class Day8_session {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Day8_session solution = new Day8_session();

        // Example input
        String[] words = {"mass", "as", "hero", "superhero"};

        // Call the stringMatching method
        List<String> result = solution.stringMatching(words);

        // Print the result
        System.out.println("Substrings found: " + result);
    }
}

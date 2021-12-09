package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String input) {
        validateNotNull(input);
        List<Character> result = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (!result.contains(c)) {
                result.add(c);
            }
        }
        return result;
    }

    private void validateNotNull(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Text is null.");
        }
    }
}

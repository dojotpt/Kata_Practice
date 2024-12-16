import java.util.ArrayList;
import java.util.List;

public class No4LetterWords {
    static String[] strings = {"Train", "Boat", "Car"};
    public static void main(String[] args) {
        no4LetterWords(strings);
    }
    public static List<String> no4LetterWords (String[] strings) {
        List<String> newStrings = new ArrayList<>();
        if (strings == null) return newStrings;
        for (int i = 0; i < strings.length; i++) {
            if (strings != null && strings[i].length() != 4) {
                newStrings.add(strings[i]);
            }
        }
        System.out.println(newStrings);
        return newStrings;
    }
}

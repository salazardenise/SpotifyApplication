import java.util.Map;
import java.util.HashMap;

public class QuestionOne {

    // sort the string s by the order they occur in string t
    // assume t has no repetitive characters (i.e. all unique)
    // for letters in s not contained in t, they are appended to the end of the result 
    // ex: given s = "weather" and t = "therapyw", method returns "theeraw"
    // ex: given s = "good" and t = "odg", method returns "oodg"
    public static String sortByStrings(String s, String t) {
        // create 
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, 0);
        }
        String lettersNotContained = "";
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                lettersNotContained += Character.toString(c);
            }
        }
        String result = "";
        for (char c : t.toCharArray()) {
            int count = map.get(c);
            while (count > 0) {
                result += Character.toString(c);
                count--;
            }
        }
        return result + lettersNotContained;
    }

    public static void main (String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter two strings");
            return;
        }
        System.out.println(sortByStrings(args[0], args[1]));
    }

}

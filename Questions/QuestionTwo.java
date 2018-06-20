import java.util.Stack;

public class QuestionTwo {

    // given an encoded string, return its corresponding decoded string
    // the encoding rule is: k[encoded_string], where the encoded_string inside
    // the square brackets is repeated exactly k times.
    // Assume k is a positive number
    // Assume encoded_string contains only letters
    // Assume there are no extra white spaces
    // Assume given String s is a valid encoded string, i.e. square brackets formed correctly
    // ex: given s = "4[ab]", the method returns "abababab"
    // ex: given s = "2[b3[a]]", the method returns "baaabaaa"
    public static String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> strings = new Stack<>();

        // loop through each character in s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // option 1: character c is a number
            if (isInteger(c)) {
                // get complete number
                int count = 0;
                while (isInteger(s.charAt(i))) {
                    count = count * 10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                i--;
                numbers.push(count);
            }
            // option 2: character c is a closing brakcet
            else if (c == ']') {
                String section = "";
                String poppedString = "";
                while (poppedString.equals("") || !poppedString.equals("[")) {
                    section = poppedString + section;
                    poppedString = strings.pop();
                }
                int n = numbers.pop();
                String repeatedSection = "";
                while (n > 0) {
                    repeatedSection += section;
                    n--;
                }
                strings.push(repeatedSection);
            }
             // option 3: character c is an open bracket or a letter
            else {
                strings.push(Character.toString(c));
            }

        }

        // get all strings from the strings stack
        String finalResult = "";
        while (!strings.isEmpty()) {
            finalResult = strings.pop() + finalResult;
        }
        return finalResult;
    }

    // helper method to determine if a character is numeric
    private static boolean isInteger(char c) {
        return "0123456789".contains(Character.toString(c));
    }

    public static void main (String[] args) {
        if (args.length != 1) {
            System.out.println("Enter an encoded string");
            return;
        }
        System.out.println(decodeString(args[0]));
    }

}

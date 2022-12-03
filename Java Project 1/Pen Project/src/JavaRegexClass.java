
import java.util.regex.*;
public class JavaRegexClass {
    public static void main(String[] args) {
        String text = "Java Lessons"; // create a text to check pattern on
        String re = "\\w+\\s\\w+"; // create a pattern to check by

        // create a regex pattern
        Pattern pattern1 = Pattern.compile(re);
        Matcher match1 = pattern1.matcher(text);

        boolean result = match1.matches();
        System.out.println(result);
    }
}

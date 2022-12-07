import java.io.*;
import java.util.regex.*;

public class EmailPhoneNumberReader {
    public static void main(String[] args) {
        String results = "";
        String emailRE = "\\S+@\\w+.\\w{2,4}";
        String phoneRE = "\\d{3}\\s\\d{3}\\s\\d{4}";

        Pattern emailPattern = Pattern.compile(emailRE);
        Pattern phonePattern = Pattern.compile(phoneRE);
        // Matcher match1 = pattern1.matcher(text);

        try {
        BufferedReader reader = new BufferedReader(new FileReader("testDetails.txt"));

        String s;
        while((s = reader.readLine()) != null) {
            // bw2.write(s +"\n");
            Matcher emailMatcher = emailPattern.matcher(s);
            Matcher phoneMatcher = phonePattern.matcher(s);

            // if (emailMatcher.matches()) {
                results += emailMatcher.group() + " === ";
            // }

            if (phoneMatcher.matches()) {
                results += phoneMatcher.group();
            }
            System.out.println(s);

            
            System.out.println(results);
        }

        reader.close();
        } catch(Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }

        System.out.println(results);
    }
}

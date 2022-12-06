import java.io.*;
import java.util.regex.*;

public class EmailPhoneNumberReader {
    public static void main(String[] args) {
        String results;
        String emailRE = "\\S+@\\w+.\\w{2, 4}";
        String phoneRE = "\\d{3}\\s\\d{3}\\s\\d{4}";

        Pattern emailPattern = Pattern.compile(emailRE);
        Pattern PhonePattern = Pattern.compile(phoneRE);
        // Matcher match1 = pattern1.matcher(text);

        try {
        BufferedReader reader = new BufferedReader(new FileReader("testDetails.txt"));

        String s;
        while((s = reader.readLine()) != null) {
            // bw2.write(s +"\n");
            
            System.out.println(s);
        }

        reader.close();
        } catch(Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}

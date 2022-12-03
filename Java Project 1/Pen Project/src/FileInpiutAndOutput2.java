import java.io.*;

public class FileInpiutAndOutput2 {
    public static void main(String[] args) {
        // copying conmtents of one text file to another

        try {
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("output_copy.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("output.txt"));

            String s;
            while((s = br2.readLine()) != null) {
                bw2.write(s +"\n");
                System.out.println(s);
            }
             br2.close();
            bw2.close();
        }catch(Exception ex) {
            return;
        }

    }
}

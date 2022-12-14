import java.io.*;

public class FileInputAndOutput {
    public static void main(String[] args) {
        // writing to files using buffered writers

        try {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        bw.write("Hello there!\n");
        bw.write("It's me...\n");
        bw.write("sunnyCodeENGINEER here...!!!\n");
        bw.close();

        System.out.println("Successful!!!");
        } catch(Exception ex) {
        return;
        }

        // reading files using buffered readers

        try {
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));

            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s);

                br.close();
            }
        }catch(Exception ex) {
            return;
        }
    }
}

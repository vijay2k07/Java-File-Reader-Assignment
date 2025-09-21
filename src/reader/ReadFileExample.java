package reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try {
            // Step 1: Write some text into the file
            FileWriter fw = new FileWriter(fileName);
            fw.write("Hello Java\n");
            fw.write("This file is created and read using BufferedReader\n");
            fw.write("Line by line reading example\n");
            fw.close();

            // Step 2: Read the file line by line using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("File content:\n");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close reader
            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


# Java-File-Reader-Assignment
Java program using BufferedReader to write and read a file

## 📌 Aim
To write a Java program that first creates a text file with some content and then reads it line by line using **BufferedReader**.

---

## 📝 Algorithm
1. Start  
2. Import the required classes (`java.io.*`).  
3. Create a class `FileReadWriteExample`.  
4. Inside `main()`:
   - Use `FileWriter` to create and write data into a file (`sample.txt`).  
   - Close the writer.  
5. Create a `BufferedReader` with `FileReader`.  
6. Read the file line by line using a loop.  
7. Print each line to the console.  
8. Close the `BufferedReader`.  
9. End  

---

## 💻 Java Code
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
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

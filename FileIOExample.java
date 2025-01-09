import java.io. *;
public class FileIOExample 
{
    public static void main(String[] args)
 {
        try
 {
            // Create a BufferedReader to read from the console
            BufferedReader reader = new BufferedReader(new             InputStreamReader(System.in));

            System.out.print("Enter text to write to the file: ");
            String text = reader.readLine();

            // Create a FileWriter to write to a file
            FileWriter writer = new FileWriter("output.txt");

            // Write the text to the file
            writer.write(text);

            System.out.println("Text written to output.txt successfully.");

            // Close the writer
            writer.close();

        } 
catch (IOException e)
 {
            System.out.println("An error occurred: " + e. getMessage ());
     }
    }
}


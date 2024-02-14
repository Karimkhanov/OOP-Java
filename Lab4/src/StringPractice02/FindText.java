package StringPractice02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {

    private String fileName = "gettys.html";
    // Create Pattern
    private Pattern pattern;
    // Create Matcher
    private Matcher m;
    public static void main(String[] args) {
        FindText find = new FindText();
        find.run();
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            int c = 1;

            pattern = Pattern.compile("<h4>");//	All the lines that contain: <h4>
            /*
            All the lines that contain the word “to”
            pattern = Pattern.compile("\\bto\\b");

            All the lines that start with 4 spaces
            pattern = Pattern.compile("^\\s{4}");

            Lines that begin with “<p” or “<d”
            pattern = Pattern.compile("^<[p|d]");

            Lines that only contain HTML closing tags
            pattern = Pattern.compile("^</.*?>$");

             */
            while ((line = reader.readLine()) != null) {
                // Generate a matcher based on Pattern
                m = pattern.matcher(line);
                // Search for text
                if (m.find()) {
                    System.out.println(" " + c + " "+ line);
                }

                // Print results
                c++;
            }





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }



}


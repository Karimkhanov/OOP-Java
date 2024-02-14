package StringPractice03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchReplace {

    private String fileName = "gettys.html";

    public static void main(String[] args) {
        SearchReplace sr = new SearchReplace();
        sr.run();
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String targetTag = "p";
            String replaceTag = "span";
            String attribute = "class";
            String value = "sentence";
            String line = "";
            int c = 1;
            // Create a Pattern object to match the entire line.
            Pattern pattern1 = Pattern.compile("(<" + targetTag + ".*?>)(.*?)(</" + targetTag + ".*?>)");
            while ((line = reader.readLine()) != null) {
                // Create a matcher
                Matcher m = pattern1.matcher(line);
                // Find a match
                if (m.find()) {
                    String newStart = replaceTag(m.group(1), targetTag, replaceTag);
                    newStart = replaceAttribute(newStart, attribute, value); String newEnd = replaceTag(m.group(3), targetTag, replaceTag);

                    String newLine = newStart + m.group(2) + newEnd; System.out.printf("%3d %s\n", c, newLine);
                }

                // Replace Start Tag

                // Replace End Tag
                // Replace the attribute
                // Reassemble the new line
                String newLine = "The newly created line goes here";
                System.out.printf("%3d %s\n", c, newLine);
                c++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public String replaceTag(String tag, String targetTag, String replaceTag) {
        // Your code here

        Pattern p = Pattern.compile(targetTag); // targetTag is regex
        Matcher m = p.matcher(tag); // tag is text to replace if (m.find()){
        return m.replaceFirst(replaceTag); // swap target with replace



    }


    public String replaceAttribute(String tag, String attribute, String value) {
        // Your code here
        Pattern p = Pattern.compile(attribute + "=" + "\".*?\"");
        Matcher m = p.matcher(tag);  // tag is text to replace
        if (m.find()){
        return m.replaceFirst(attribute + "=" + "\"" + value + "\"");
    }
    return tag;

    }
}



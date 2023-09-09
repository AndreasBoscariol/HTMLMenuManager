/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menugenerator;
import java.io.*;
/**
 *
 * @author andre
 */
public class HTMLedit {
    
    public void HTMLedit(arrayLists mcdlist){
        String htmlFile = "index.html"; // the HTML file you want to modify
        String newHtmlFile = "modified_index.html"; // the new HTML file that will contain the modified code
        String codeToAdd = "<!-- Code added using Java -->"; // the code you want to add to the HTML file

        try (BufferedReader reader = new BufferedReader(new FileReader(htmlFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(newHtmlFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            // Append the code you want to add to the end of the file
            writer.write(codeToAdd);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
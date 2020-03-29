package ziemathis_problem1;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover 
{
	
    Set<String> uniqueWords;
    void remove(String dataFile)
    {
        Scanner text = null;
        try 
        {
            uniqueWords = new LinkedHashSet<>(); 
            text = new Scanner(new File(dataFile)); 
            while(text.hasNextLine()) //reading file
            {
                String line = text.nextLine(); //read from the file line by line
                String[] words= line.split(" "); //separate words by space
                for(int i=0; i<words.length; i++) 
                {
                    String str = words[i].toLowerCase(); //convert uppercase into lowercase
                    uniqueWords.add(str);
                }
            }

        }
        catch(Exception error) // error opening file
        {
            System.out.println("Error opening the file: "+dataFile);
        }
        if(text != null)
            text.close();


    }
    void write(String outputFile)
    {
        FileWriter singleWord = null;
        try {
        	singleWord = new FileWriter(outputFile);
            for(String s: uniqueWords) 
            {
            	singleWord.write(s+ "\n"); 
            }
            singleWord.close();
        }
        catch(Exception e) //if there is an exception 
        {
            System.out.println("Error writing output to file ocurred: "+outputFile);
        }

    }

}
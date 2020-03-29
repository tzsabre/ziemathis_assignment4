package ziemathis_problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter
{
   private Map<String, Integer> wordCounter;
  
   public void count(String filename)
   {
	   wordCounter = new HashMap<String,Integer>();
       Scanner infile = null;
       try {
           infile = new Scanner(new File(filename));
       } 
       catch (FileNotFoundException error) 
       {
           System.out.println(error.getMessage());
       }
       while(infile.hasNext()) 
       {
           String word = infile.next().toLowerCase();
           Integer count = wordCounter.get(word); //gets the word count from map
           if(count == null)
               count = 1;
           else
               count = count + 1;
           wordCounter.put(word, count);
       }
       infile.close();
   }
  
   public void write(String filename)
   {
       try 
       {
           PrintWriter countfile = new PrintWriter(new File(filename));
           for(String i : wordCounter.keySet()) 
           {
               countfile.println(i + " " + wordCounter.get(i));
           }
           countfile.close();
       } 
       catch (FileNotFoundException error) 
       {
           System.out.println(error.getMessage());
       }
   }
  
}
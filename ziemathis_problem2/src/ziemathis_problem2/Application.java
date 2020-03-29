package ziemathis_problem2;

public class Application {
	   public static void main(String[] args) {
	       String inFilename = "problem2.txt";
	       String outFilename = "unique_word_counts.txt";
	       DuplicateCounter duplicatecounter = new DuplicateCounter();
	       duplicatecounter.count(inFilename);
	       duplicatecounter.write(outFilename);
	   }
	}
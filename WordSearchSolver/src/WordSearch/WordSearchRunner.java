package WordSearch;

//(c) A+ Computer Science


//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearchRunner
{
  public static void main(String[] args) throws Exception
  {
  	  WordSearch puzzle = new WordSearch(8,"APPLEXYPXLHJKEEDEGGLLXXCGFPDGOGNMYNTAHUUPUQDGBTSBTHIGHMSILKXLTHI");
  	  String words = "APPLE AXE APEX CAT HEX EGG HAT COMPUTER GUM THIS TUG THIGH";
    
      //Use split to split the words into a list 
      String[] wordList = words.split(" ", 0);
      for (String[] inner : puzzle.mat) {
        for(String x : inner) {
          System.out.print(x + " ");
        }
        System.out.println();
      }
      System.out.println();
  	  //check if each word in words is in the puzzle.
      String wow = "";
      for (String word : wordList) {
        wow = "not ";
        if(puzzle.isFound(word)){
          wow = "";
        }
        System.out.println(word + " was " + wow + "found in the matrix.");
      }
    
      //Print if it is or not. Use a ternary operator.

    
  }
}

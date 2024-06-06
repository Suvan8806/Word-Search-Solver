package WordSearch;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 
import java.lang.*;

public class WordSearch
{
  public String[][] mat;

  public WordSearch( int size, String str )
  {
    mat = new String[size][size];
    int x = 0;
    for (int r = 0; r < size; r++){ 
      for (int c = 0; c < size; c++){ 
        mat[r][c] = str.substring(x,x + 1);
        x++;
      }  
    }
    
  }

  public boolean isFound( String word )
  {
    int size = mat.length;
    if ( checkRight(word, size) || checkLeft(word, size) || checkUp(word, size) || checkDown(word, size) || checkDiagUpRight(word, size) || checkDiagUpLeft(word, size) || checkDiagDownRight(word, size) || checkDiagDownLeft(word, size) ) {
      return true;
    }
    return false;
  }

	public boolean checkRight(String word, int size) {
		String str = "";
  
  for (int r = 0; r < size; r++){ 
    for (int c = 0; c < size; c++){ 
      str += mat[r][c];
    } 
    if (str.contains(word)){
      return true;
    }
  }
   
   return false;
	}

	public boolean checkLeft(String word, int size) {
		String str = "";
  
  for (int r = 0; r < size; r++){ 
    for (int c = size - 1; c >= 0; c--){ 
      str += mat[r][c];
    } 
    if (str.contains(word)){
      return true;
    }
  }
  
  return false;
	}

	public boolean checkUp(String word, int size) {
	  String str = "";
  
  for (int c = 0; c < size; c++){ 
    for (int r = size - 1; r >= 0; r--){ 
      str += mat[r][c];
    } 
    if (str.contains(word)){
      return true;
    }
  }
   
   return false;
	}

	public boolean checkDown(String word, int size) {
	  String str = "";
  
  for (int c = 0; c < size; c++){ 
    for (int r = 0; r < size; r++){ 
      str += mat[r][c];
    } 
    if (str.contains(word)){
      return true;
    }
  }
   
   return false;
	}

	public boolean checkDiagUpRight(String word, int size) {
  String str = "";
  int temp;

  for (int r = 1; r < size; r++){ 
    temp = r;
    for (int c = 0; c <= r; c++){
      str += mat[temp][c];
      temp--;
    }
    if (str.contains(word)){
      return true;
    }
    str = "";
  }
  for (int c = 1; c < size; c++){ 
    temp = c;
    for (int r = size - 1; r >= c; r--){
      str += mat[r][temp];
      temp++;
    }
    if (str.contains(word)){
      return true;
    }
    str = "";
  } 
   return false;
	}

public boolean checkDiagUpLeft(String word, int size) {
  String str = "";
  int temp;

  for (int r = 1; r < size; r++){ 
    temp = r;
    for (int c = size - 1; temp >= 0; c--){
      str += mat[temp][c];
      temp--;
    }
    if (str.contains(word)){
      return true;
    }
    str = "";
  }
  int wow = 0;
  for (int c = size - 2; c >= 0; c--){ 
    temp = c;
    for (int r = size-1; r > wow; r--){
      str += mat[r][temp];
      temp--;
    }
    if (str.contains(word)){
      return true;
    }
    wow++;
    str = "";
  } 
   return false;
	}

	public boolean checkDiagDownLeft(String word, int size) {
		String str = "";
  int temp;

  for (int r = 1; r < size; r++){ 
    temp = r;
    for (int c = 0; c <= r; c++){
      str += mat[temp][c];
      temp--;
    }
    if (str.contains(reverse(word))){
      return true;
    }
    str = "";
  }
  for (int c = 1; c < size; c++){ 
    temp = c;
    for (int r = size - 1; r >= c; r--){
      str += mat[r][temp];
      temp++;
    }
    if (str.contains(reverse(word))){
      return true;
    }
    str = "";
  } 
   return false;
	}

	public boolean checkDiagDownRight(String word, int size) {
		String str = "";
  int temp;

  for (int r = 1; r < size; r++){ 
    temp = r;
    for (int c = size - 1; temp >= 0; c--){
      str += mat[temp][c];
      temp--;
    }
    if (str.contains(reverse(word))){
      return true;
    }
    str = "";
  }
  int wow = 0;
  for (int c = size - 2; c >= 0; c--){ 
    temp = c;
    for (int r = size-1; r > wow; r--){
      str += mat[r][temp];
      temp--;
    }
    if (str.contains(reverse(word))){
      return true;
    }
    wow++;
    str = "";
  } 
   return false;
	}

public String reverse(String word) {
  String flip = "";
  for (int i = word.length() - 1; i >= 0; i--){
    flip += "" + word.charAt(i);
  }
  return flip;
	}

  public String toString() {
    
		  return "";
  }
}


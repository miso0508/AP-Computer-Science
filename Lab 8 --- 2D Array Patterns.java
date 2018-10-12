package com.company;

public class Main
{
    public static void main(String[] args)
    {
    }
    
    static String pp2dInt(int[][] a)
    {
      String r = "{";
      for(int q = 0; q < a.length; q++) {
        r += " {";
        for(int w = 0; w < a[q].length; w++)
          r += a[q][w];
        r += "}, \n";
      }
      return r;
    }
  
    static String pp2dDouble(double[][] a)
    {
      String r = "{";
      for(int q = 0; q < a.length; q++) {
        r += " {";
        for(int w = 0; w < a[q].length; w++)
          r += a[q][w];
        r += "}, \n";
      }
      return r;
    }
  
    static String pp2dString(String[][] a)
    {
      String r = "{";
        for(int q = 0; q < a.length; q++) {
          r += " {";
          for(int w = 0; w < a[q].length; w++)
            r += a[q][w];
          r += "}, \n";
        }
        return r;
    }
  
    static int[][] Task4()
    {
      int[][] p = new int[10][10];
      int c = 0;
      for(int x = 0; x < 10; x++) {
        for(int e = 0; e < 10; e++) {
          p[x][e] = c;
          c++;
        }
      }
      return p;
    }
  
    static String[][] Task5()
    {
      int[][] s = new int[10][10];
      for(int x = 0; x < 10; x++) {
        for(int e = 0; e < 10; e++) {
          s[x][e] = x + "-" + e;
        }
      }
      return s;
    }
  
    static int[][] Task6()
    {
      int[][] p = new int[10][10];
      for(int z = 0; z < 10; z++) {
        for(int x = 0 ; x < 10; x++) {
          if(z % 2 != 0) {
            if(x % 2 == 0)
              p[z][x] = 1;
            else
              p[z][x] = 0;
          }
          else {
            if(x % 2 == 0)
              p[z][x] = 0;
            else
              p[z][x] = 1;
          }
        }
      }
    }
  
    static String[][] Task7()
    {
      String[] letter = {"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
      String[][] p = new String[5];
      int c = 1;
      for(int x = 0; x < 5; x++)
        p[x] = new String[x+1];
      for(int x = 0; x < p.length; x++) {
        for(int z = 0; z < p[x].length; z++) {
          p[x][z] = letter[c];
          c++;
        }
      }
    }
}

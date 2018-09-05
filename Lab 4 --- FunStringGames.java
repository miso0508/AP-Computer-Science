package com.company;

public class Main
{
  public static void main (String[] args)
  {
     String one = "XOXOXOXOXO";
     System.out.println(stage1(one)); // -5 points
     String two = "XXOOXXOOXXOO";
     System.out.println(stage2(two)); // 0 points
  }
  
  public static int stage1(String s)
  {
    int points = 0;
    for(int x = 0; x < s.length(); x++) {
      if(s.substring(x,x+1).compareTo(s.substring(x+1,x+2)) == 0)
        points += 0;
      else {
        if(s.substring(x,x+1).compareTo("O") == 0 && s.substring(x+1,x+2).compareTo("X") == 0)
          points += 1;
        if(s.substring(x,x+1).compareTo("X") == 0 && s.substring(x+1,x+2).compareTo("O") == 0)
          points -= 1;
      }
      return points;
    }
  }
  
  public static int stage2(String s)
  {
    int ocount = 0;
    int xcount = 0;
    int points = 0;
    for(int x = 0; x < s.length(); x++) {
      if(s.substring(x,x+1).compareTo("X") == 0 && s.substring(x+1,x+2).compareTo("O") != 0)
        xcount += 1;
      if(s.substring(x,x+1).compareTo("O") == 0 && s.substring(x+1,x+2).compareTo("X") != 0)
        ocount += 1;
    }
    points = xcount - ocount;
    return points;
  }
  
}

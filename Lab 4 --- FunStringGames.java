package com.company;

public class Main
{
    public static void main (String[] args)
    {
        String one = "XOXOXOXOXO";
        System.out.println(stage1(one)); // -5 points
        String two = "XXXXOOXXXX";
        System.out.println(stage2(two)); // 9 points
        String three = "OXOXOXOX";
        System.out.println(stage3(three)); // 4 points
    }

    public static int stage1(String s)
    {
        int points = 0;
        int x = -1;
        String next, current;
        while(x < (s.length() - 1)) {
            x++;
            current = s.substring(x,x+1);
            next = s.substring(x+1,x+2);
            if(current.compareTo("O") == 0 && next.compareTo("X") == 0)
                ++points;
            if(current.compareTo("X") == 0 && next.compareTo("O") == 0)
                --points;

            System.out.println(current + " " + next);
            x++;
        }
        return points;
    }

    public static int stage2(String s)
    {
        int ocount = 0;
        int xcount = 0;
        int points = 0;
        for(int x = 0; x < s.length(); x++) {
            if(x+2 <= s.length() && (s.substring(x,x+1)).compareTo("X") == 0 && (s.substring(x+1,x+2)).compareTo("O") != 0)
                xcount += 1;
            if(x+2 <= s.length() && (s.substring(x,x+1)).compareTo("O") == 0 && (s.substring(x+1,x+2)).compareTo("X") != 0)
                ocount += 1;
        }
        points = xcount - ocount;
        return points;
    }

    public static int stage3(String s)
    {
        int points = 0;
        int c = -1;
        boolean indexOutOfRangeException = false; // s.length() < c
        while(!indexOutOfRangeException) {
            c++;
            if(c > s.length() - 4) indexOutOfRangeException = true;
            else indexOutOfRangeException = false;

            if(!indexOutOfRangeException && s.substring(c,c+1).compareTo("O") == 0 && s.substring(c+1,c+2).compareTo("X") == 0) {
                points++;
                if(s.substring(c+2,c+3).compareTo("O") == 0) {
                    points -= 2;
                    if(s.substring(c+3,c+4).compareTo("X") == 0)
                        points += 3;
                }
            }
            if(!indexOutOfRangeException && s.substring(c,c+1).compareTo("X") == 0 && s.substring(c+1,c+2).compareTo("O") == 0) {
                points--;
                if(s.substring(c+2,c+3).compareTo("X") == 0) {
                    points += 2;
                    if(s.substring(c+3,c+4).compareTo("O") == 0)
                        points -= 3;
                }
            }
            if(!indexOutOfRangeException)
                System.out.println(s.substring(c,c+1) + " " + s.substring(c+1,c+2) + " " + s.substring(c+2,c+3) + " " + s.substring(c+3,c+4) + " ");
        }
        return points;
    }
  
}

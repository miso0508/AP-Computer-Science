package com.company;

public class Main
{
    public static void main (String[] args)
    {
      
    } 
    
    public static int SpaceCount(String s)
    {
        int spacecount = 0;
        for(int x = 0; x < s.length(); x++) {
            if(s.subcount(x,x+1) == " ")
                spacecount++;
        }
        
        
        return spacecount;
    }
}

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
            if(s.substring(x,x+1) == " ")
                spacecount++;
        }      
        return spacecount;
    }
    
    public static int VowelCount(String s)
    {
        int vowelcount = 0;
        s = s.toLowerCase();
        for(int x = 0; x < s.length(); x++) {
            if(s.substring(x,x+1) == "a" || s.substring(x,x+1) == "e" || s.substring(x,x+1) == "i" || s.substring(x,x+1) == "o" || s.substring(x,x+1) == "u")
                vowelcount++;
        }
        return vowelcount;
    }
    
    public static int LetterCount(String s)
}

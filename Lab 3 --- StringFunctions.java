package com.company;

public class Main
{
    public static void main (String[] args)
    {
      
    } 
    
    static int SpaceCount(String s)
    {
        int spacecount = 0;
        for(int x = 0; x < s.length(); x++) {
            if(s.substring(x,x+1) == " ")
                spacecount++;
        }
        return spacecount;
    }

    static int VowelCount(String s)
    {
        int vowelcount = 0;
        s = s.toLowerCase();
        for(int x = 0; x < s.length(); x++) {
            if(s.substring(x,x+1) == "a" || s.substring(x,x+1) == "e" || s.substring(x,x+1) == "i" || s.substring(x,x+1) == "o" || s.substring(x,x+1) == "u")
                vowelcount++;
        }
        return vowelcount;
    }

    static int LetterCount(String s, String letter)
    {
        int lettercount = 0;
        s = s.toLowerCase();
        String[] letters = new String[s.length()];
        for(int x = 0; x < s.length(); x++) {
            letters[x] = s.substring(x,x+1);
        }
        for(String element: letters) {
            if(element == letter)
                lettercount++;
        }

        return lettercount;
    }
}

package com.company;

public class Main
{
   public static void main (String[] args)
    {
	    System.out.println(SpaceCount("He llo")); //Ans: 1
	    System.out.println(VowelCount("Hello")); //Ans: 2
	    System.out.println(LetterCount("Helllo","l")); //Ans: 3
    }
	
    static int SpaceCount(String s)
    {
        int spacecount = 0;
        s = s.toLowerCase();
        for(int x = 0; x < s.length(); x++) {
            if((s.substring(x,x+1)).compareTo(" ") == 0)
                spacecount += 1;
        }
        return spacecount;
    }

    static int VowelCount(String s)
    {
        int vowelcount = 0;
        s = s.toLowerCase();
        for(int x = 0; x < s.length(); x++) {
            if((s.substring(x,x+1)).compareTo("a") == 0 || (s.substring(x,x+1)).compareTo("e") == 0 || (s.substring(x,x+1)).compareTo("i") == 0 || (s.substring(x,x+1)).compareTo("o") == 0 || (s.substring(x,x+1)).compareTo("u") == 0)
                vowelcount += 1;
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
            if(element.compareTo(letter) == 0)
                lettercount += 1;
        }
        return lettercount;

    }
}

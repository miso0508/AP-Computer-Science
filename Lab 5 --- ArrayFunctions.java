package com.company;

public class Main
{
    public static void main (String[] args)
    {
      
    }
  
    public static int min(int a, int b)
    {
      if(a < b)
        return a;
      if(a > b)
        return b;
      if(a == b)
        return a;
    }
    
    public static int min(int[] a)
    {
        int small = a[0];
        for(int x = 0; x < a.length(); x++) {
           if(a[x] < small)
               small = a[x];
        }
        return small;
    }
    
}

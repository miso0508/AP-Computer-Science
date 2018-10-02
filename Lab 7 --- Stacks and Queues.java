package com.company;

public class Main
{
    public static void main (String[] args)
    {
      
    }
    
    static int[] createStack()
    {
        int[] stack = new int[103];
        stack[0] = 101;
        return stack;
    }
    
    static void push(int[] stack, int data)
    {
        int[] e = stack;
        stack = new int[e.length + 1];
        for(int x = 0; x < e.length; x++)
            stack[x] = e[x];
        stack[0] += 1;
        stack[stack.length - 1] = 0;
        stack[e.length] = data;
    }
    
    static int pop(int[] stack)
    {
        int[] e = stack;
        stack = new int[e.length - 1];
        for(int x = 0; x < stack.length; x++)
            stack[x] = e[x];
        return e[stack.length];
    }
  
}





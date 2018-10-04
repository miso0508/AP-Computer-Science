package com.company;

public class Main
{
    public static void main (String[] args)
    {
        //TASK 1
        int[] stack = createStack();
        for(int x = 9; x >= 3; x--)
            push(stack, x);
        pop(stack);
        pop(stack);
        pop(stack);
        //Value of 3rd pop = 5
        for(int x = 1; x <= 4; x++)
            push(stack, x);
        for(int x = 1; x <= 5; x++)
            pop(stack);
        //Value of 5th pop = 6
        System.out.println(prettyPrintStack(stack));
        
        //TASK 2
        int[] restroomList = createStack();
        /* 
           It is not a good choice because if you pop the array, last people in line
           will go first, not the first people in line 
        */
        for(int x = 1; x <= 10; x++)
            push(stack, x);
        System.out.println(prettyPrintStack(restroomList));
        pop(stack);
        System.out.println(prettyPrintStack(restroomList));
        
        //TASK 3
        int[] q = createQueue();
        for(int x = 9; x >= 3; x--)
            enqueue(q, x);
        dequeue(q);
        dequeue(q);
        dequeue(q);
        //Value of 3rd dequeue = 7
        for(int x = 1; x <= 4; x++)
            enqueue(q,x);
        dequeue(q);
        dequeue(q);
        dequeue(q);
        dequeue(q);
        dequeue(q);
        //Value of 5th dequeue = 1
        System.out.println(prettyPrintQueue(q));
        
    }
    
    static int[] createStack()
    {
        int[] stack = new int[101];
        stack[0] = 0;
        return stack;
    }
    
    static void push(int[] stack, int data)
    {
        if(stack[0] >= 100)
            System.out.println("Stack Overflow Error");
        else {
            stack[stack[0] + 1] = data;
            stack[0]++;
        }
    }
    
    static int pop(int[] stack)
    {
        stack[0]--;
        return stack[stack[0] + 1]
    }
    
    static String prettyPrintStack(int[] stack)
    {
        String s = "[";
        for(int x = 1; x <= stack[0]; x++)
            s += stack[x] + ",";
        s += "]";
        return s;
    }
    
    static String dumpStack(int[] stack)
    {
        String s = "{";
        for(int x = 0; x < 101; x++)
            s += stack[x] + ",";
        s += "}";
        return s;
    }
    
    static int[] createQueue()
    {
        int[] q = new int[101];
        q[0] = 0;
        return q;
    }
    
    static void enqueue(int[] queue, int data)
    {
        if(queue[0] >= 100)
            System.out.println("Queue Overflow Error");
        else {
            queue[0]++;
            queue[queue[0]] = data;
        }
    }
    
    static int dequeue(int[] queue)
    {
        int temp = queue[1];
        for(int x = 1; x <= a[0]; x++) {
            a[x] = a[x+1];
            a[x+1] = temp;
        }
        queue[0]--;
        return queue[queue[0] + 2];
    }
    
    static String prettyPrintQueue(int[] queue)
    {
        String s = "[";
        for(int x = 1; x <= queue[0]; x++)
            s += queue[x] + ",";
        s += "]";
        return s;
    }
    
    static String dumpQueue(int[] queue)
    {
        String s = "{";
        for(int x = 0; x < 101; x++)
            s += queue[x] + ",";
        s += "}";
        return s;
    }
    
    
  
}





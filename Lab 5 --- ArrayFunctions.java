package com.company;

public class Main
{
    public static void main (String[] args)
    {
        //makeSorted()
        System.out.println("min(3,4)\t3\t" + min(3,4));
        System.out.println("min(4,3)\t3\t" + min(3,4));
        int[] a = {1,5,3,7,2,65,8};
        int[] b = {9,6,34,23,8,6,5,3,2};
        System.out.println("min(a)\t\t1\t" + min(a));
        System.out.println("min(b)\t\t2\t" + min(b));
        //add()
        System.out.println("add(a,b)\t{10,11,37,30,10,71,13,3,2}\t" + pp(add(a,b)));
        //copy()
        int[] c = copy(a);
        c[0] = 5;
        System.out.println("copy(a)\t\t1\t"+a[0]);
        //resize()
        System.out.println("resize(a,3)\t{1,5,3}\t" + pp(resize(a,3)));
        System.out.println("resize(a,3)\t7\t" + a.length);
        System.out.println("resize(a,9)\t{1,5,3,7,2,65,8,0,0}\t" + pp(resize(a,9)));
        System.out.println("resize(a,9)\t7\t" + a.length);
        //append()
        int[] d = {1,2,3,4};
        int[] e = {5,6,7};
        System.out.println("append(d,e)\t{1,2,3,4,5,6,7}\t" + pp(append(d,e)));
        System.out.println("append(d,e)\t4\t" + d.length);
        System.out.println("append(d,e)\t3\t" + e.length);
        System.out.println("append(null,e)\t{5,6,7}\t\t" + pp(append(null,e)));
        System.out.println("append(d,null)\t{1,2,3,4}\t" + pp(append(d,null)));
        //subArray()
        System.out.println("subArray(a,3,5)\t{7,2}\t" + pp(subArray(a,3,5)));
        System.out.println("subArray()\t7\t" + a.length);
        System.out.println("subArray(a,4,7)\t{2,65,8}\t" + pp(subArray(a,4,7)));
        System.out.println("subArray(a,3,3)\tnull\t" + pp(subArray(a,3,3)));
        System.out.println("subArray(a,5,3)\tnull\t" + pp(subArray(a,5,3)));
        //makeSorted()
        makeSorted(a);
        System.out.println("makeSorted(a)\t{1,2,3,5,7,8,65}\t" + pp(a));
        //sort()
        System.out.println("sort(b)\t{2,3,5,6,6,8,9,23,34}\t" + pp(sort(b)));
        //merge()
        System.out.println("merge(a,d)\t{1,1,2,2,3,3,4,5,7,8,65}\t" + pp(merge(a,d)));
    }

    public static int min(int a, int b)
    {
        if(a < b)
            return a;
        else
            return b;
    }

    public static int min(int[] a)
    {
        int small = a[0];
        for(int x = 0; x < a.length; x++) {
            if(a[x] < small)
                small = a[x];
        }
        return small;
    }

    public static int[] add(int[] a, int[] b)
    {
        int min = 0, max = 0;
        boolean isBigger = false;
        if(a.length > b.length) {
            max = a.length;
            min = b.length;
            isBigger = true;
        }
        else {
            max = b.length;
            min = a.length;
        }
        int[] rv = new int[max];
        for(int x = 0; x < min; x++) {
            rv[x] = a[x] + b[x];
        }
        for(int x = min; x < max; x++) {
            if(isBigger == true)
                rv[x] = a[x];
            else
                rv[x] = b[x];
        }
        return rv;
    }

    public static String pp(int[] a)
    {
        String rv = "{ ";
        for(int x = 0; x < a.length; x++) {
            rv += a[x] + ", ";
        }
        rv += "}";
        return rv;
    }

    public static int[] copy(int[] a)
    {
        int[] c = new int[a.length];
        for(int x = 0; x < a.length; x++) {
            c[x] = a[x];
        }
        return c;
    }

    public static int[] resize(int[] a, int newLength)
    {
        int[] rv = new int[newLength];
        for(int x = 0; x < newLength; x++) {
            if(x > a.length - 1) {
                rv[x] = 0;
            }
            else
                rv[x] = a[x];
        }
        return rv;
    }

    public static int[] append(int[] a, int[] b)
    {
        if(a == null && b == null)
            return null;
        int[] rv = {0};
        if(a != null && b == null) {
            rv = new int[a.length];
            for(int x = 0; x < rv.length; x++)
                rv[x] = a[x];
        }
        if(b != null && a == null) {
            rv = new int[b.length];
             for(int x = 0; x < rv.length; x++)
                rv[x] = b[x];
        }
        if(a != null && b != null) {
            rv = new int[a.length + b.length];
             for(int x = 0; x < a.length; x++)
                rv[x] = a[x];
             for(int x = a.length; x < rv.length; x++)
                rv[x] = a[x];
        }     
        return rv;
    }

    public static int[] subArray(int[]a, int firstIncluded, int firstExcluded)
    {
        int[] rv = new int[firstExcluded - firstIncluded];
        boolean indexOutOfBounds = false;
        for(int x = firstIncluded; x < firstExcluded; x++)
        {
            if(x > firstExcluded) {
                indexOutOfBounds = true;
                break;
            }
            else rv[x] = a[x];
        }
        if(indexOutOfBounds == true)
            return null;
        else
            return rv;
    }

    public static void makeSorted(int[] a)
    {
        int temp = 0;
        for(int q = 0; q < a.length; q++) {
            for(int w = q + 1; w < a.length; w++) {
                if(a[q] < a[w]) {
                    temp = a[w];
                    a[w] = a[q];
                    a[q] = temp;
                }
            }
        }
    }

    public static int[] sort(int[] a)
    {
        int[] rv = new int[a.length];
        for(int x = 0; x < a.length; x++)
            rv[x] = a[x];
        makeSorted(rv);
        return rv;
    }

    public static int[] merge(int[] a, int[] b)
    {
        // { 1 2 3 4 5 6 } { 2 5 7 9 10 }
        // { 
        // x = 0
        int[] rv = new int[a.length + b.length];
        for(int x = 0; x < rv.length; x++) {
            for(int s = 0; a[s] <= b[x]; s += 0) {
                rv[s] = a[s];
                s++;
                if(a[s] > b[x]) {
                    rv[s] = b[x];
                    x++
                }
            }
        }
        return rv;
    }


}

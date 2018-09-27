package com.company;

public class Main {

    public static void main(String[] args) {
        int[] b = intToBinary(-127);
        for(int x = 0; x < 8; x++)
            System.out.print(b[x]);
    }

    static int[] createBin(int binaryNumber)
    {
        //10101010
        int[] binary = new int[8];
        for(int b = 7; b >= 0; b--) {
            binary[7-b] = (int)(binaryNumber % Math.pow(10,b));
        }
        return binary;
    }

    static int[] createBin(String binaryNumber)
    {
        int[] binary = new int[8];
        for(int b = 0; b < 8; b++) {
            if(binaryNumber.substring(b,b+1).compareTo("1") == 0)
                binary[b] = 1;
            else
                binary[b] = 0;
        }
        return binary;
    }

    static int intValue(int[] b)
    {
        int value = 0;

        for(int e = 7; e > 0 ; e--) {
            value += (b[e] * Math.pow(2,7-e));
        }
        value += (-128 * b[0]);
        return value;
    }

    static double[] doubleValue(int[] b)
    {
        double[] value = new double[2];
        double exponent = 0, mantissa = 0;
        mantissa = b[4] * -8;
        for(int c = 7; c > 4; c--) {
            mantissa += b[c] * Math.pow(2.0,7-c);
        }
        exponent = b[0] * -8;
        for(int c = 3; c > 0; c--) {
            exponent += b[c] * Math.pow(2.0,3-c);
        }
        value[0] = exponent;
        value[1] = mantissa;
        return value;
    }

    static int[] intToBinary(int a)
    {
        int[] binary = new int[8];
        int x = 0;
        int y = a;
        if(a >= -128 && a <= -1) {
            binary[0] = 1;
            a = a + 128;
            while(true) {
                if(a == 0 || intValue(binary) == y)
                    break;
                x = (int)(Math.log10(a) / Math.log10(2));
                binary[8 - (x+1)] = 1;
                a = a - (int)Math.pow(2,x);
            }
        }
        else {
            binary[0] = 0;
            while(true) {
                x = (int)(Math.log10(a) / Math.log10(2));
                binary[8 - (x+1)] = 1;
                a = a - (int)Math.pow(2,x);
                if(a == 0)
                    break;
            }
        }

        return binary;
    }

    static int[] doubleToBinary(double a)
    {
        int[] binary = new int[8];
        double y = a;
        int exp, mantissa;
        exp = (int)(Math.log(a) / Math.log(2));
        if(a < 0) {
            binary[4] = 1;
        }
        else {
            binary[4] = 0;
            for(int x = 7; x >= 1; x--) {
                if(a % x == 0)
                    mantissa = x;
            }
        }
        return binary;
    }
    
}

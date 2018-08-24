package com.company;

public class Main
{
    public static void main (String[] args)
    {
        int[] m1 = CreateMoney(10,67);
        int[] m2 = CreateMoney(20,50);

        System.out.println("$"+m1[0]+"."+m1[1]);
    }

    public static int[] CreateMoney (int dollars, int cents)
    {
        int[] money = new int[2];
        if (cents > 99)
        {
            dollars += (cents / 100);
            cents %= 100;
        }
        money[0] = dollars;
        money[1] = cents;
        return money;
    }

    public static int[] Convert(int[] m)
    {
        if (m[1] > 99)
        {
            m[0] += (m[1]/100);
            m[1] %= 100;
            return m;
        }
        else
            return m;
    }

    public static int dollars (int[] money)
    {
        Convert(money);
        return money[0];
    }

    public static int cents (int[] money)
    {
        Convert(money);
        return money[1];
    }

    public static String PrettyPrint (int[] money)
    {
        Convert(money);
        return ("$" + money[0] + "." + money[1]);
    }

    public static String MoneytoText (int[] money)
    {
        int[] mref = new int[5];
        String[] digit = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String[] teens = {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String[] txt = {"", digit[mref[0]] + "hundred and ", tens[mref[1]] + "", " " + digit[mref[2]], " " + tens[mref[3]], digit[mref[4]] + " "};
        for(int x = 3; x > 0; x--) {
            mref[3 - x] = money[0] % (int)Math.pow(10, x) / (int)Math.pow(10, x - 1);
        }
        for(int x = 2; x > 0; x--) {
            mref[5 - x] = money[1] % (int)Math.pow(10, x) / (int)Math.pow(10, x - 1);
        }
        for(int x = 0; x < 5; x++) {
            if(mref[x] == 0)
                txt[x+1] = "";
        }
        if(mref[1] == 1 && mref[2] > 10 && mref[2] < 20) {
            txt[2] = teens[mref[2]] + "";
            txt[3] = ""
        }            
        /*
        String txt1 = digit[mref[0]] + "hundred and ";
        String txt2 = tens[mref[1]] + "";
        String txt3 = " " + digit[mref[2]];
        String txt4 = " " + tens[mref[3]];
        String txt5 = digit[mref[4]] + " ";

        if(mref[0] == 0)
            txt1 = "";
        if(mref[1] == 0)
            txt2 = "";
        if(mref[2] == 0)
            txt3 = "";
        if(mref[3] == 0)
            txt4 = "";
        if(mref[4] == 0)
            txt5 = "";
        */  
        return txt[1] + txt[2] + txt[3] + " dollars and " + txt[4] + txt[5] + " cents";
    }

    public static boolean IsGreaterThan (int[] m1, int[] m2)
    {
        Convert(m1);
        Convert(m2);
        if (m1[0] > m2[0])
            return true;
        if (m1[0] < m2[0])
            return false;
        if (m1[0] == m2[0])
        {
            if (m1[1] > m1[2])
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public static boolean IsEqual (int[] m1, int[] m2)
    {
        Convert(m1);
        Convert(m2);
        if (m1[0] + m1[1] == m2[0] + m2[1])
            return true;
        else
            return false;
    }

    public static void Adder (int[] m1, int[] m2)
    {
        m1[0] += m2[0];
        m1[1] += m2[2];
        Convert(m1);
    }

    public static int[] Add (int[] m1, int[] m2)
    {
        int[] sum = new int[2];
        sum[0] = m1[0] + m2[0];
        sum[1] = m1[1] + m2[1];
        Convert(sum);
        return sum;
    }

    public static int[] Paywith20 (int[] owe)
    {
        int[] change = new int[2];
        owe[1] = (owe[0] * 100) + owe[1];
        owe[0] = 0;
        change[1] = (20 * 100) - owe[1];
        Convert(change);
        return change;
    }

}

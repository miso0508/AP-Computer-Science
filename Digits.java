 public static void main(String[] args) {
        int ones = OnesDigit(1234);
        int tens = TensOnesDigit(1234);
        System.out.println(ones);
        System.out.println(tens);
    }

    static int OnesDigit(int a)
    {
        boolean local = a%10 < 10 && a%10 > 0;
        while(!local)
        {
            a /= 10;
        }
        return a%10;
    }

    static int TensOnesDigit(int a)
    {
        int q = a;
        boolean InTens = q < 100 && q > 9;
        for(int ten = 10; !InTens; ten = ten * 10)
        {
            q = a % ten;
        }
        return q;
    }

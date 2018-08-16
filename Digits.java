    public static void main(String[] args) {
        int ones = OnesDigit(1234);
        int tens = TensOnesDigit(1234);
        int tensonly = TensDigit(1234);
        int hundredth = HundredthDigit(1234);
        int thousandth = ThousandthDigit(1234);
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(tensonly);
        System.out.println(hundredth);
        System.out.println(thousandth);
    }

    static int OnesDigit(int a)
    {
        return a % 10;
    }

    static int TensOnesDigit(int a)
    {
        return a % 100;
    }

    static int TensDigit(int a)
    {
        a = a % 100;
        a = a / 10;
        return a;
    }

    static int HundredthDigit(int a)
    {
        a = a % 1000;
        a = a / 100;
        return a;
    }

    static int ThousandthDigit(int a)
    {
        a = a % 10000;
        a = a / 1000;
        return a;
    }
    
    static int GetDigits(int a, int big, int small)
    {
        int ten = 10;
        if(big == small)
        {
            for(int x = 0; x < big; x++)
            {
                ten *= 10;
            }
            a = a % ten;
            a = a / (ten/10);
            return a;
        }

        else
        {
            //WIP
        }

        return 0;
    }

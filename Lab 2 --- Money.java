class main
{
  
  public static void Main (String[] args)
  { 
    
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
    //WIP
  }
  
  public static boolean IsGreaterThan (int[] m1, int[] m2)
  {
    Convert(m1);
    Convert(m2);
    if (m1[0] > m2[0])
      return true
    if (m1[0] < m2[0])
      return false;
    if (m1[0] == m2[0])
    {
      if (m1[1] > m1[2])
        return true;
      else
        return false;
    }
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
  }
  
  public static int[] Paywith20 (int[] owe)
  {
    int[] change = new int[2];
    owe[1] = (owe[0] * 100) + owe[1];
    owe[0] = 0;
    change[1] = (20 * 100) - owe[1];
    Convert(change);
  }
  
}





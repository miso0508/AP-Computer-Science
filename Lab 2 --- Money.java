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
  
}

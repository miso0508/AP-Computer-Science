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
  
  public static int dollars (int[] money)
  {
    return money[0];
  }
  
  public static int cents (int[] money)
  {
    return money[1];
  }
  
  public static String PrettyPrint (int[] money)
  {
    return ("$" + money[0] + "." + money[1]);
  }
  
  public static String MoneytoText (int[] money)
  {
    //WIP
  }
  
}

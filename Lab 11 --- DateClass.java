public class Main
{
  public static void main(String[] args)
  {
  }
}

public class DateClass
{
  int day, month, year;
  public DateClass()
  {
  }
  public DateClass(int month, int day, int year) 
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public DateClass(int mmddyyyy)
  {
    int m,d,y;
    m = mmddyyyy / 1000000;
    d = mmddyyyy / 10000 % 100;
    y = mmddyyyy % 10000;
    if((m == 2 && d > 28)  || (m == 1 && m > 31) || (m > 2 && m 
  }
  public String get()
  {
    return month + "," + day + "," + year;
  }
  public void set(int day, int month, int year) 
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }
}

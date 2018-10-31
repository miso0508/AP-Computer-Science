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
    if((m == 2 && d > 28)  || (m == 1 && m > 31) || (m > 2 && (m-3)%2 == 0 && d > 31) || ((m-4)%2 == 0 && d > 30)) {
      m = 0;
      d = 0;
      y = 0;
      System.out.println("Invalid Date");
    }
    this.month = m;
    this.day = d;
    this.year = y;
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
  public boolean isLeapYear(DateClass date)
  {
    boolean isleapyear = false;
    if(date.year % 4 == 0) {
      isleapyear = true;
      if(date.year % 100 == 0 && date.year
    }
  }
}

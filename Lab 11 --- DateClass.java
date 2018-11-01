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
  public String monthName()
  {
    String[] month = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
    return month[this.month];
  }
  public String toStr()
  {
    m = mmddyyyy / 1000000;
    d = mmddyyyy / 10000 % 100;
    y = mmddyyyy % 10000;
    String str = monthName(m) + "," + d + "," + y;
  }
  public boolean isLastDayOfMonth()
  {
    int m = this.month;
    int d = this.day;
    if(m == 2 && d == 28)
      return true;
    if(m == 2 && d != 28)
      return false;
    if(m == 1 && d == 31)
      return true;
    if(m == 1 && d != 31)
      return false;
    if((m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d == 31)
      return true;
    if((m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d != 31)
      return false;
    if((m == 4 || m == 6 || m == 9 || m == 8 || m == 11) && d == 30)
      return true;
    if((m == 4 || m == 6 || m == 9 || m == 8 || m == 11) && d != 30)
      return false;
    return false;
  }
  public boolean isBefore(DateClass d)
  {
    if(d.year < this.year)
      return true;
    if(d.year == this.year) {
      if(d.month < this.month)
        return true;
      if(d.month == this.month) {
        if(d.day < this.day)
          return truel
        if(d.day == this.day)
          return false;
      }
    }
    return false;
  }
  public boolean isAfter(DateClass d) {
    if(isBefore(d) == false)
      return true;
    else
      return false;
  }
  public boolean isSameDate(DateClass d) 
  {
    if(d.year == year && d.month == month && d.day == day)
      return true;
    else return false;
  }
  public boolean isLeapYear()
  {
    
  }
  public DateClass nextDate()
  {
    
  }
}

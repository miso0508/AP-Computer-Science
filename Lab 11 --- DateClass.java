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

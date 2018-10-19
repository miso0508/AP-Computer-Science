import java.lang.Math;

public class Main
{
  public static void main(String[] args)
  {
    
  }
}

public class Money
{
  private double dollars, cents;
  public Money(double dollars, double cents)
  {
    if(cents > 99) {
      dollars += cents / 100;
      cents = cents % 100;
    }
    this.dollars = dollars;
    this.cents = cents;
  }
  public double getDollars()
  {
    return dollars;
  }
  public void setDollars(double d)
  {
    dollars = d;
  }
  public double getCents()
  {
    return cents;
  }
  public void setCents(double c)
  {
    cents = c;
  }
  public boolean isGreaterThan(Money m)
  {
    if(this.dollars > m.dollars)
      return true;
    if(this.dollars < m.dollars)
      return false;
    if(this.dollars == m.dollars) {
      if(this.cents > m.cents)
        return true;
      else return false;
    }
  }
  public boolean isLessThan(Money m)
  {
    if(isGreaterThan(m) == true)
      return false;
    else return true;
  }
  public boolean isBigMoney()
  {
    if(this.dollars > 100)
      return true;
    if(this.dollars < 100)
      return false;
    if(this.dollars == 100) {
      if(this.cents > 0) return true;
      else return false;
    }
  }
  public void add(Money m)
  {
    this.dollars += m.dollars;
    this.cents += m.cents;
    if(this.cents >= 100) {
      this.dollars += this.cents / 100;
      this.cents = this.cents % 100;
    }
  }
  public void sub(Money m)
  {
    this.dollars -= m.dollars;
    this.cents -= m.cents;
    if(this.cents < 0) {
      this.dollars += (this.dollars * 100) + this.cents;
      this.cents = 0;
      this.dollars = this.dollars / 100;
      this.cents = this.dollars * 100 % 100;
    }
  }
}

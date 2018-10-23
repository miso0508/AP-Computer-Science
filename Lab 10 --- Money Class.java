import java.lang.Math;

public class Main
{
  public static void main(String[] args)
  {
    Money m1 = new Money(123,25);
    Money m2 = new Money(51,99);
    Money m3 = new Money(0,1);
  }
}

public class Money
{
  private double dollars, cents;
  public Money(double dollars, double cents)
  {
    this.dollars += cents / 100;
    this.cents += cents % 100;
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
  public void mult(int multiplier)
  {
    this.cents += this.dollars * 100;
    this.cents *= multiplier;
    this.dollars = this.cents / 100;
    this.cents = this.cents % 100;
  }
  public Money changeFrom20()
  {
    this.cents = this.dollars * 100;
    this.dollars = 0;
    this.cents = (20 * 100) - this.cents;
    this.dollars = this.cents / 100;
    this.cents = this.cents % 100;
  }
  public String toStr()
  {
    return "$" + dollars + "." + cents;
  }
  public String toEnglish()
  {
    String[] ones = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    String[] tens = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    String m = ones[dollars/100] + "hundred and " + tens[dollars%100/10] + " " + ones[dollars%10] + "dollars and " + tens[cents/10] + " " + ones[cents%10] + " cents";
    return m;
  }
}

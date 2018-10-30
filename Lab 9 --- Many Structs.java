import java.lang.Math;

public class Main
{
  public static void main(String[] args)
  {
    Money m = new Money(0,0);
    Money m1 = new Money(10,10);
    ComplexNumber q = new ComplexNumber(1,2);
    ComplexNumber q1 = new ComplexNumber(2,3);
    DateClass d = new DateClass(1,2,3);
    DateClass d1 = new DateClass(3,4,5);
    CreditCardAccount cca = new CreditCardAccount(12345, "bob");
    CreditCardAccount cca1 = new CreditCardAccount(123456, "joe");
    Fraction f = new Fraction(1,2);
    Fraction f1 = new Fraction(2,3);
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
public class ComplexNumber
{
  double a, b;
  public ComplexNumber()
  {
  }
  public ComplexNumber(double a, double b)
  {
    this.a = a;
    this.b = b;
  }
  public String get()
  {
    return a + "+" + b + "i";
  }
  public void set(double a, double b)
  {
    this.a = a;
    this.b = b;
  }
  public void add(Complex e)
  {
    this.a += e.a;
    this.b += e.b;
  }
  public Complex sum(Complex e)
  {
    return new Complex(this.a + e.a, this.b + e.b);
  }
  public void makeNegative()
  {
    this.a *= -1;
    this.b *= -1;
  }
  public Complex negative()
  {
    return new Complex(-this.a,-this.b);
  }
  public void subtract(Complex e)
  {
    this.a -= e.a;
    this.b -= e.b;
  }
  public Complex difference(Complex e)
  {
    return new Complex(this.a - e.a, this.b - e.b);
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
public class CreditCardAccount
{
  int number;
  String name;
  public CreditCardAccount()
  {
  }
  public CreditCardAccount(int number, String name) 
  {
    this.number = number;
    this.name = name;
  }
  public String get()
  {
    return "Credit Card Number: " + number + "\n" + "Name " + name;
  }
  public void set(int number, String name) 
  {
    this.number = number;
    this.name = name;
  }
}
public class Fraction
{
  int num, den;
  public Fraction()
  {
  }
  public Fraction(int num, int den)
  {
    this.num = num;
    this.den = den;
  }
  public String get()
  {
    return num + "/" + den;
  }
  public void set(int num, int den)
  {
    this.num = num;
    this.den = den;
  }
}
public class DoubleClass
{
  double exponent, mantissa;
  public DoubleClass()
  {
  }
  public DoubleClass(double e, double m)
  {
    exponent = e;
    mantissa = m;
  }
  public double get()
  {
    return Math.pow(2,exponent) * mantissa;
  }
  public void set(double e, double m)
  {
    this.exponent = e;
    this.mantissa = m;
  }
}
public class Point
{
  double x,y;
  public Point()
  {
  }
  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;    
  }
  public double getX()
  {
    return this.x;
  }
  public double getY()
  {
    return this.y;
  }
}
public class StudentRecord
{
  String name;
  public StudentRecord()
  {
  }
  public StudentRecord(String name)
  {
    this.name = name;
  }
  public String get()
  {
    return name;
  }
  public void set(String name)
  {
    this.name = name;
  }
}
public class Circle
{
  double r,x,y;
  Point center = new Point(x,y);
  public Circle()
  {
  }
  public Circle(double x, double y, double r)
  {
    this.x = x;
    this.y = y;
    this.r = r;
  }
  public String get()
  {
    return "(x + (" + center.x + ") )^2 + (y + (" + center.y + ") )^2 = " + r;
  }
  public void set(double x, double y, double r)
  {
    this.x = x;
    this.y = y;
    this.r = r;
  }
}
public class LineSegment
{
  double x1,y1,x2,y2;
  Point ep1 = new Point(x1,y1);
  Point ep2 = new Point(x2,y2);
  public LineSegment()
  {
  }
  public LineSegment(double x1, double y1, double x2, double y2)
  {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }
  public String get()
  {
    return "(" + x1 + "," + y1 + ") and (" + x1 + "," + y1 + ")";
  }
  public void set(double x1, double y1, double x2, double y2)
  {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }
}
public class Card
{
  String face, suit;
  public Card()
  {
  }
  public Card(String face, String suit)
  {
    this.face = face;
    this.suit = suit;
  }
  public String get()
  {
    return face + " of " + suit; 
  }
  public void set(String face, String suit)
  {
    this.face = face;
    this.suit = suit;
  }
}
public class Deck
{
  private int index = 0;
  Card[] d = new Card[52];
  public Deck()
  {
  }
  String[] f = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
  String suit = {"Heart","Diamond","Spade","Clover"};
  for(int i = 0; i < f.length; i++) {
    for(int e = 0; e < suit.length; e++) {
      d[index++] = new Card(f[i],suit[e]);
    }
  }
  public String getCard()
  {
    Random c = new Random();
    return d[c.nextInt(51) + 0].get();
  }
}

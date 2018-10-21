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
  int dollars, cents;
  public Money(int dollars, int cents)
  {
    this.dollars = dollars;
    this.cents = cents;
  }
  public String get()
  {
    return dollars + "." cents;
  }
  public void set(int dollars, int cents)
  {
    this.dollars = dollars;
    this.cents = cents;
  }
}
public class ComplexNumber
{
  double a, b;
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
}
public class DateClass
{
  int day, month, year;
  public DateClass(int day, int month, int year) 
  {
    this.day = day;
    this.month = month;
    this.year = year;
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

import java.lang.Math;

public class Main
{
  public static void main(String[] args)
  {
    Money m = new Money(0,0);
    Point p = new Point(0,0);
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
}
public class ComplexNumber
{
  double a, b;
  public ComplexNumber(double a, double b)
  {
    this.a = a;
    this.b = b;
  }
}
public class DateClass
{
}
public class CreditCardAccount
{
}
public class Fraction
{
}
public class DoubleClass
{
  double exponent, mantissa;
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
}
public class Card
{
  String face, suit;
  public Card(String face, String suit)
  {
    this.face = face;
    this.suit = suit;
  }
}

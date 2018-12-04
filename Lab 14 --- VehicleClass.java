import java.lang.Math;

public class Main
{
  public static void main(String[] args)
  {
  }
  public class Point
  {
    private double x,y;
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
    
  
  public class Vehicle
  {
    public int seats, passengers, speed;
    public Point current = new Point();
    public Point dest = new Point();
    public Vehicle(int s, int p, int sp, Point c, Point d) {
      seats = s;
      passengers = p;
      current = c;
      dest = d;
      speed = sp;
    }
    public Vehicle() {
    }
    public String communicate() {
      return "Hey there!";
    }
    public String toStr() {
      return "This is a vehicle";
    }
  }
  
  public class Airplane extends Vehicle
  {
    String flight_num;
    public Airplane() {
    }
    
  }
}


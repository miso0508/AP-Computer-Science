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
    public speedcompareto(Vehicle v) {
      return this.speed - v.speed;
    }
    public speedcompareto(Airplane a) {
      return this.speed - a.speed;
    }
    public speedcompareto(Car c) {
      return this.speed - c.speed;
    }
    public speedcompareto(Train t) {
      return this.speed - t.speed;
    }
  }
  
  public class Airplane extends Vehicle
  {
    String flight_num;
    public Airplane() {
    }
    public Airplane(String num, int s, int p, int sp, Point c, Point d) {
      super.(int s, int p, int sp, Point c, Point d);
      flight_num = num;
    }
    public void communicate() {
      System.out.println("Tower, this is flight " + flight_num + ".Requesting permission to land";
    }
    public String toStr() {
      return "This is an airplane, flight number " + flight_num;
    }
    
  }
  
  public class Car extends Vehicle
  {
    String engine;
    int doors;
    public Airplane() {
    }
    public Car(String num, int d, int s, int p, int sp, Point c, Point d) {
      super.(int s, int p, int sp, Point c, Point d);
      engine = num;
      doors = d;
    }
    public void communicate() {
      System.out.println("Honk Honk");
    }
    public String toStr() {
      return "This is a " + engine + "car with" + doors + "doors.";
    }
  }
  
  public class Train extends Vehicle
  {
    int boxcars;
    public Airplane() {
    }
    public Car(int b, int s, int p, int sp, Point c, Point d) {
      super.(int s, int p, int sp, Point c, Point d);
      boxcars = b;
    }
    public void communicate() {
      System.out.println("I think I can, I think I can!");
    }
    public String toStr() {
      return "This is a train, all aboard!";
    }
  }
                     
}


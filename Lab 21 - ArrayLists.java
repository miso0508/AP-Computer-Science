import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList<Double> num = new ArrayList<Double>();
    ArrayList<ArrayList<Integer>> i = new ArrayList<ArrayList<Integer>>();
    ArrayList<QueueAL<Square>> s = new ArrayList<QueueAL<Square>>();
    QueueAL<ArrayList<Circle>> q = new QueueAL<ArrayList<Circle>>();
    int[] fib = new int[50];
    for(int x = 1; x <= 50; x++) { fib[x-1] = Fib(x); }
    for(int x = 0; x < 3; x++) {
      i.add(x, new ArrayList<Integer>());
      for(int y = 0; y <= x; y++) {
        i.get(x).add(new Integer(y + 1));
      }
    }
    for(int x = 0; x < 98; x++) {
      s.add(x, new QueueAL<Square>());
      s.add(x, new QueueAL<Square>());
      s.get(x).queue(new Square(1));
      if(x != 0) s.get(x).queue(new Square(x + 2));
    }
    for(int x = 0; x < 50; x++) {
      q.queue(new ArrayList<Circle>());
    }
    q.get(0).add(new Circle(1));
    q.get(0).add(new Circle(1));
    for(int x = 0; x < 50; x++) {
      for(int y = 0; y < 3; y++) {
      }
    }
  }

  public static int Fib(int n) {
    if(n <= 2) return 1;
    else return Fib(n-1) + Fib(n-2);
  }
}

class Square {
  public Square(int side) {}
}

class Circle {
  public int r;
  public Circle(int radius) { r = radius; }
}

class QueueAL <E> implements printable {
  ArrayList<E> q = new ArrayList<E>();
  public void queue(E name) { q.add(name); }
  public E dequeue() { return q.remove(0);}
  public E get(int index) { return q.get(index); }
  public E set(int index, E obj) { return q.set(index, obj); }
  public void print() {}
}

class Double {
  private double val;
  public Double(double q) { val = q; }
  public double doubleValue() { return val; }
  public void add(double n) { val += n; }
  public void subtract(double n) { val -= n; }
}

class Integer {
  private int val;
  public Integer(int q) { val = q; }
  public int intValue() { return val; }
  public void add(int n) { val += n; }
  public void subtract(int n) { val -= n; }
}

interface printable {
  void print();
}

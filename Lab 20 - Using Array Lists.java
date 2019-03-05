import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList<Double> num = new ArrayList<Double>();

  }
}

class QueueAl <E> implements printable {
  ArrayList<String> q = new ArrayList<String>();
  public void queue(String name) { q.add(name); }
  public String dequeue() { return q.remove(0);}
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

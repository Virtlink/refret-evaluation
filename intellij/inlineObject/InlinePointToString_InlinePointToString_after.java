test;
[InlinePointToString]
    class Main {
    void test() {
        System.out.println("[" + 1 + ", " + 2 + "]");
    }
  }
  
  class Point {
    private int x, y;
  
    public Point(int _x, int _y) {
      x = _x;
      y = _y;
    }
  
    public String toString() {
      return "["+x+", "+y+"]";
    }
  }
  

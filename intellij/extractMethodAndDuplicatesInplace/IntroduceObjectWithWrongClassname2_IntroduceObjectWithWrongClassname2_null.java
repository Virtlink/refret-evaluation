test;
[IntroduceObjectWithWrongClassname2]
    public class Test {
  
    void test() {
      <selection>int x = 0;
      int y = 0;
      System.out.println();</selection>
  
      System.out.println("Point(" + x + ", " + y + ")");
    }
  
    record Conflict(int x) {}
  }

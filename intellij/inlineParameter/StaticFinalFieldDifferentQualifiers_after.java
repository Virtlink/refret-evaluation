test;
[A]
    public class A {
    void [[@2|test]]() {
      String[] myValue = [[->1|CONST]];
    }

    void callTest() {
      [[->2|test()]];
    }

    void callTest2() {
      [[->2|test()]];
    }

    public static final String[] [[@1|CONST]] = new String[] { "A", "B" };
  }

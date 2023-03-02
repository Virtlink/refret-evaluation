test;
[Usage]
    import static [[->1|q.CONSTANT|p.Test.CONSTANT]];
  import static [[->2|q.statMeth|p.Test.statMeth]];
  class Usage {
    public void context() {
        String v = CONSTANT;
        statMeth();
    }
  }
[p] {
[Test]
    package p;

  public class Test {
      public static final String [[@1|CONSTANT]] = "";

      public static void [[@2|statMeth]]() {}
  }
}

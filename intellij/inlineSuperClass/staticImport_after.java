test;
[Usage]
    import static p.Test.CONSTANT;
  import static p.Test.statMeth;
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
      public static final String CONSTANT = "";
  
      public static void statMeth() {}
  }
}

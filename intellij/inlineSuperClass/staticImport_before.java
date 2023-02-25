test;
[p1] {
[Super]
    package p1;
  public class Super {
     public static final String CONSTANT = "";
     public static void statMeth() {}
  }
}
[Usage]
    import static p1.Super.CONSTANT;
  import static p1.Super.statMeth;
  class Usage {
    public void context() {
        String v = CONSTANT;
        statMeth();
    }
  }
[p] {
[Test]
    package p;
  import p1.*;
  public class Test extends Super {} 
}

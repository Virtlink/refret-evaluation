test;
[p1] {
[StaticMethod]
  package p1;
  public class StaticMethod {
      public static int bar() {return 1;}
  }
}
[p2] {
[Test]
  package p2;
  import p1.StaticMethod;

  import java.math.BigDecimal;
  public class Test extends BigDecimal {
      Test() {super(0);}
      void test() {
          valueOf(0);
          valueOf(StaticMethod.bar());
          valueOf(StaticMethod.bar());
      }
  }
}


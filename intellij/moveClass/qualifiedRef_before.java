[[# fails]]
[[{move-class(1, p2)}]]
test;
[p1] {
[StaticMethod]
  package p1;
  public class StaticMethod {
      public static int bar() {return 1;}
  }
  
[Test]
  package p1;
  import java.math.BigDecimal;
  public class [[@1|Test]] extends BigDecimal {
      Test() {super(0);}
      void test() {
          valueOf(0);
          valueOf(StaticMethod.bar());
          valueOf(StaticMethod.bar());
      }
  }
}
[p2] {
[Test]
  package [[@p2|p2]];
}
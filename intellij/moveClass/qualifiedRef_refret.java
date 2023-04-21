test;
[p1] {
[StaticMethod]
  package p1;
  public class [[@1|StaticMethod]] {
      public static int bar() {return 1;}
  }

}
[p1] {
[Test]
  package p1;
}
[p2] {
[Test]
  package p2;
  import [[->1|StaticMethod|p1.StaticMethod]];

  import java.math.BigDecimal;
  public class Test extends BigDecimal {
      Test() {super(0);}
      void test() {
          valueOf(0);
          valueOf([[->1|StaticMethod]].bar());
          valueOf([[->1|StaticMethod]].bar());
      }
  }
}


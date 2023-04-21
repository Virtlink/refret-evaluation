[[#fails]]
[[{move-class(1, p3)}]]
test;
[p2] {
[Test]
  package p2;
  public class Test {
    public static void f() {}
  }
[First]
  package p2;
  public class [[@1|First]] {}
}
[p3] {
[First]
  package [[@p3|p3]];
}
[p1] {
[Second]
  package p1;
  
  import p2.*;
  
  class Second {
    {
      new First();
      Test.f();
    }
  }
[First]
  package p1;
  public class First extends p2.First {}
}

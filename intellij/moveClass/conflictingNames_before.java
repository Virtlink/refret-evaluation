test;
[p2] {
[Test]
    package p2;
  public class Test {
    public static void f() {}
  }
[First]
    package p2;
  public class First {}
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

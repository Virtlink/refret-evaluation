test;
[p3] {
[Second]
    package p3;
  
  import p2.*;
  
  class Second {
    {
      new First();
      Test.f();
    }
  }
[First]
    package p3;
  public class First extends p2.First {}
}
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

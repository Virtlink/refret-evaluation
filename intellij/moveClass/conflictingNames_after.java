test;
[p2] {
[Test]
  package p2;
  public class Test {
    public static void f() {}
  }
[First]
  package p2;
}
[p3] {
[First]
  package [[@p3|p3]];
  public class [[@1|First]] {}
}
[p1] {
[Second]
  package p1;
  
  import p2.*;
  
  class Second {
    {
      new p3.First();
      Test.f();
    }
  }
[First]
  package p1;
  public class First extends p3.First {}
}

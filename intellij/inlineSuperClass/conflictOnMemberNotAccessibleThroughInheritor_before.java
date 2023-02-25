test;
[Test]
    import p1.*;
  class Test extends Super{
  }
[p1] {
[Super]
    package p1;
  public class Super {
    public static final String FOO = "";
  }
[Usage]
    package p1;
  class Usage {
    {
      System.out.println(Super.FOO);
    }
  }
}

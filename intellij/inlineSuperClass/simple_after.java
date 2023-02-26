test;
[Usage]
    import p.Test;

  class Usage {
    void bar(Test s) {
      [[->1|foo|s.foo]]();  // TODO: Context: s
    }
  }
[p] {
[Test]
    package p;

  public class Test {
      public void [[1|foo]]() {
        System.out.println("Hello");
      }
  }
}

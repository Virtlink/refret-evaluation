test;
[Usage]
    import p.Test;

  class Usage {
    void bar(Test [[@2|s]]) {
      [[->1|&2|foo()|s.foo()]];
    }
  }
[p] {
[Test]
    package p;

  public class Test {
      public void [[@1|foo]]() {
        System.out.println("Hello");
      }
  }
}

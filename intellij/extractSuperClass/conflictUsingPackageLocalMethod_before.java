test;
[a] {
[Test]
    package a;
  public class Test extends Sup {
      void x() {
        foo();
      }
  }
[Sup]
    package a;
  public class Sup {
    void foo(){}
  }
}
[b] {
[E]
    package b;
  class E{}
}

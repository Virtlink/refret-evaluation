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
[TestSubclass]
    package b;
  
  import a.Test;
  
  public class TestSubclass  extends Test {
      }
}
